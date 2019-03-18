package com.appointment.dinner.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author Tony
 * @Time 2019/1/24
 */
@ConfigurationProperties(prefix = "jwt")
@Component
@Slf4j
@Data
public class JwtUtils {

    private String secret;
    private long expire;
    private String header;

    /**
     * 生成token
     * */
    public String generateToken(int userId){
        Date now = new Date();
        //设置过期时间
        Date expireDate = new Date(now.getTime()+expire*1000);
        return Jwts.builder()
                .setHeaderParam("type","JWT")
                .setSubject(userId+"")
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }

    /**
     * 获取token信息
     * */
    public Claims getClaimsByToken(String token){
        return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
    }

    /**
     * 判断token是否过去
     * */

    public boolean isTokenExpired(Date expiration){
        return expiration.before(new Date());
    }


}
