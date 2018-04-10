package com.atguigu.gmall.order;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.atguigu.gmall.bean.bean.UserAddress;
import com.atguigu.gmall.service.UserManageService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Reference
    UserManageService userManageService;


    @RequestMapping(value = "initOrder")
    public String initOrder(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList = userManageService.getUserAddressList(userId);
        String jsonString = JSON.toJSONString(userAddressList);
        return jsonString;

    }
}