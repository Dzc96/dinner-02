package com.appointment.dinner.config;

import com.appointment.dinner.annotation.Login;
import com.appointment.dinner.exception.UserTokenException;
import com.appointment.dinner.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * token校验
 *
 * @Author Tony
 * @Time 2019/1/24
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private JwtUtils jwtUtils;

    public static final String USER_KEY = "userId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Login annotation;
        /**
         * 校验方法上是否有Login注解，如果有的话就需要进行token的校验
         * */
        if(handler instanceof HandlerMethod){
            annotation = ((HandlerMethod)handler).getMethodAnnotation(Login.class);
        }else{
            return true;
        }
        if(annotation==null){
            return true;
        }

        //获取token
        String token = request.getHeader(jwtUtils.getHeader());
        if(StringUtils.isEmpty(token)){
          throw new UserTokenException("token is null");
        }
        Claims claims = jwtUtils.getClaimsByToken(token);
        if(claims==null||jwtUtils.isTokenExpired(claims.getExpiration())){
            throw new UserTokenException("token is expired");
        }
        //将用户id设置到request中，后续可以根据userId获取用户信息
        request.setAttribute(USER_KEY,Integer.parseInt(claims.getSubject()));
        return true;
    }
}
