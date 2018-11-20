package com.boot.demo.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.boot.demo.domain.User;
import com.boot.demo.util.ServletUtil;
import com.boot.demo.util.StringUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * @author wanxiang
 */
@Configuration
public class AuthLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = true;
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            if ("XMLHttpRequest".equals(request.getHeader("x-requested-with"))) {
                JSONObject jo = new JSONObject();
                jo.put("code", 401);
                jo.put("message", "no login");
                ServletUtil.createSuccessResponse(200, jo, response);
            } else {
                response.sendRedirect("/user/login");
            }
            flag = false;
        }
        return flag;
    }
}
