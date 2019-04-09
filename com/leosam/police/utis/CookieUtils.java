package com.leosam.police.utis;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @create: 2019-01-21 11:37
 **/

public class CookieUtils {


    /**
     * 根据指定的属性名，从cookie中获取属性值
     *
     * @param attribute
     * @param request
     * @return
     */
    public static String getCookieAttribute(String attribute, HttpServletRequest request) {
        //判空
        if (request == null || StringUtils.isEmpty(attribute)) {
            return null;
        }
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        String attributeValue = null;
        //获取属性值
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i] == null) {
                continue;
            }
            if (attribute.equals(cookies[i].getName())) {
                attributeValue = cookies[i].getValue();
                break;
            }
        }
        return attributeValue;
    }

}
