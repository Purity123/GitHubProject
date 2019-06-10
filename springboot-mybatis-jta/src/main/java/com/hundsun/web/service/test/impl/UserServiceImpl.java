package com.hundsun.web.service.test.impl;

import com.hundsun.web.entity.test.User;
import com.hundsun.web.mapper.test.UserMapper;
import com.hundsun.web.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hundsun
 * @since 2017-09-27
 */
@Service
public class UserServiceImpl  implements UserService {
	@Autowired
    private UserMapper userMapper;

	@Override
	public void insert(User user){
		userMapper.insert(user);
	}
}
