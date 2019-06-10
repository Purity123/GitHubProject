package com.hundsun.web.service.group;

import com.hundsun.web.entity.car.MessagePackageNo;
import com.hundsun.web.entity.test.User;
import com.hundsun.web.service.car.MessagePackageNoService;
import com.hundsun.web.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Project: design-pattern
 * @Package: com.hundsun.service.impl
 * @Author: Administrator
 * @Description: TODO
 * @Version: 1.0
 * @Datetime: 2017/9/27 17:35
 */
@Service
public class IndexService {
    @Autowired
    private MessagePackageNoService messagePackageNoService;

    @Autowired
    private UserService userService;

    /**
     * 保存数据
     *
     * @param messagePackageNo
     * @param user
     */
    @Transactional
    public void save(MessagePackageNo messagePackageNo, User user) {
        userService.insert(user);
        messagePackageNoService.insert(messagePackageNo);

        int i = 4 / 0; // 除0异常,测试事务
    }

}
