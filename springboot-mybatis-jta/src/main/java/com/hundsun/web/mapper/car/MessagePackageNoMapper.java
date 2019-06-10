package com.hundsun.web.mapper.car;

import com.hundsun.web.entity.car.MessagePackageNo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
  * 消息包编号表 Mapper 接口
 * </p>
 *
 * @author hundsun
 * @since 2017-09-25
 */
@Repository
public interface MessagePackageNoMapper {

    /**
     * 保存
     * @param no
     */
    @Insert("INSERT INTO `tb_message_package_no` (`no`, `create_time`) VALUES (#{no.no}, NOW())")
    void insert(@Param("no") MessagePackageNo no);
}