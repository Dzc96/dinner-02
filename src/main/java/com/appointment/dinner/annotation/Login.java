package com.appointment.dinner.annotation;

import java.lang.annotation.*;

/**
 * APP登陆校验
 *
 * @Author Tony
 * @Time 2019/1/24
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
