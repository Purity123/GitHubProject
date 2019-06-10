package com.hundsun.web.service.car.impl;

import com.hundsun.web.entity.car.MessagePackageNo;
import com.hundsun.web.mapper.car.MessagePackageNoMapper;
import com.hundsun.web.service.car.MessagePackageNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息包编号表 服务实现类
 * </p>
 *
 * @author hundsun
 * @since 2017-09-25
 */
@Service
public class MessagePackageNoServiceImpl  implements MessagePackageNoService {
	@Autowired
	private MessagePackageNoMapper messagePackageNoMapper;

	@Override
	public void insert(MessagePackageNo messagePackageNo){
		messagePackageNoMapper.insert(messagePackageNo);
	}
}
