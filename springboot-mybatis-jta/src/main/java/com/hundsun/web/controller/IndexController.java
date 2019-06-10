package com.hundsun.web.controller;

import com.hundsun.web.entity.car.MessagePackageNo;
import com.hundsun.web.entity.test.User;
import com.hundsun.web.service.group.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Project: design-pattern
 * @Package: com.hundsun.controller
 * @Author: Administrator
 * @Description: TODO
 * @Version: 1.0
 * @Datetime: 2017/9/27 16:19
 */
@RestController
@RequestMapping("/")
public class IndexController {

    // 可以测试分布式事务
    @Autowired
    private IndexService indexService;

    @GetMapping
    public void index() {
        // 构造数据
        MessagePackageNo messagePackageNo = new MessagePackageNo();
        messagePackageNo.setNo(99);
        messagePackageNo.setCreateTime(new Date());

        User user = new User();
        user.setAge(25);
        user.setName("1111");
        user.setCreateTime(new Date());

        indexService.save(messagePackageNo, user);

    }
}
