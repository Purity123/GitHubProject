package com.hundsun.web.entity.car;

import java.util.Date;

/**
 * <p>
 * 消息包编号表
 * </p>
 *
 * @author hundsun
 * @since 2017-09-25
 */
public class MessagePackageNo {

    private static final long serialVersionUID = 1L;

    /**
     * 消息包编号
     */
	private Integer no;
    /**
     * 创建时间
     */
	private Date createTime;


	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"createTime\":\"")
				.append(createTime).append('\"');
		sb.append(",\"no\":")
				.append(no);
		sb.append('}');
		return sb.toString();
	}
}
