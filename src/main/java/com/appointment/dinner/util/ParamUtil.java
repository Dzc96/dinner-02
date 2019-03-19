package com.appointment.dinner.util;

/**
 * Controller层参数校验
 */
public class ParamUtil {
    private boolean checkParams(String[] params){
        for(String param:params){
            if(param==""||param==null||param.isEmpty()){
                return false;
            }
        }
        return true;
    }
}
