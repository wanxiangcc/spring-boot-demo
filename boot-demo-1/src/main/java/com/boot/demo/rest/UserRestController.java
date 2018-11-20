package com.boot.demo.rest;

import com.boot.demo.domain.Customer;
import com.boot.demo.domain.User;
import com.boot.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest/user")
public class UserRestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    // @Autowired
    // public HttpServletRequest request;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/{userId}/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long userId) {
        return null;
    }

    @RequestMapping(value = "/loginSub", method = RequestMethod.POST)
    public Map<String, String> loginSub(@RequestBody Map<String, Object> params, HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        String userName = (String) params.get("userName");
        String password = (String) params.get("password");
        User user = userService.checkLogin(userName, password);
        if (user != null) {
            logger.info(userName + " login success");
            // 获取request几种方式
            // 1、方法声明，会注入；2、Autowired；3、(ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }
}
