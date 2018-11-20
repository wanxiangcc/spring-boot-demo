package com.boot.demo.rest;

import com.boot.demo.config.ConfigDemoBean;
import com.boot.demo.config.custom.CustomConfigDemoBean;
import com.boot.demo.interfaces.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/test")
/**
 * test controller
 * @author wanxiang
 */
public class TestRestController {
    @Autowired
    private ConfigDemoBean configDemoBean;
    @Autowired
    private CustomConfigDemoBean customConfigDemoBean;

    @Autowired
    DBConnector connector;

    @RequestMapping("/index")
    public String index() {
        return "this is test controller index";
    }

    @RequestMapping("/config")
    public String config() {
        return configDemoBean.getName();
    }

    @RequestMapping("/customConfig")
    public String customConfig() {
        return customConfigDemoBean.getName();
    }

    @RequestMapping(value = {"/db", ""})
    public String hellTask() {
        connector.configure(); //最终打印testdb
        return "";
    }
}
