package com.appointment.dinner.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.appointment.dinner.exception.LogicalVerificationException;
import com.appointment.dinner.service.RedisService;
import com.appointment.dinner.service.SendMsgService;
import com.appointment.dinner.util.JsonUtil;
import com.appointment.dinner.util.MsgTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author Tony
 * @Time 2019/1/17
 */
@Service
@Slf4j
public class SendMsgServiceImpl implements SendMsgService {

    @Value("${accessKeyId}")
    private  String accessKeyId;

    @Value("${accessKeySecret}")
    private  String accessKeySecret;

    @Value("${signName}")
    private  String signName;

    @Value("${templateCode}")
    private  String templateCode;

    //初始化ascClient需要的几个参数
    private static final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
    private static final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）

    @Autowired
    private RedisService redisService;


    @Override
    public MsgTemplate sendMsgCde(String phone) {
        MsgTemplate msgTemplate = null;
        try {
            //设置超时时间-可自行调整
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");
            //初始化ascClient,暂时不支持多region（请勿修改）
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            //组装请求对象
            SendSmsRequest request = new SendSmsRequest();
            //使用post提交
            request.setMethod(MethodType.POST);
            //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为国际区号+号码，如“85200000000”
            request.setPhoneNumbers(phone);
            //必填:短信签名-可在短信控制台中找到
            request.setSignName(signName);
            //必填:短信模板-可在短信控制台中找到，发送国际/港澳台消息时，请使用国际/港澳台短信模版
            request.setTemplateCode(templateCode);
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
            msgTemplate = getRandomCode(phone);
            request.setTemplateParam(JsonUtil.objectToJson(msgTemplate));
            //请求失败这里会抛ClientException异常
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            if (sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                log.info(phone+": send msg success");
            }
        } catch (ClientException e) {
            log.error("send error");
        }
        return msgTemplate;
    }

    @Override
    public boolean verifyMsgCode(String phone, String code) {
        if(redisService.isExsitKey(phone)){
            Object o = redisService.getForValue(phone);
            MsgTemplate msgTemplate = JsonUtil.jsonToObject(o.toString(),MsgTemplate.class);
            if(code.equals(msgTemplate.getCode())){
                return true;
            }else{
                throw new LogicalVerificationException("验证码错误，请重新输入");
            }
        }else{
            throw new LogicalVerificationException("验证码已失效，请重新获取");
        }
    }

    private  MsgTemplate getRandomCode(String phone){
        MsgTemplate msgTemplate = new MsgTemplate(generateRandomCode());
        redisService.setValue(phone,JsonUtil.objectToJson(msgTemplate));
        return msgTemplate;
    }

    private static String generateRandomCode(){
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
