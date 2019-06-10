package com.hundsun.web.entity.test;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hundsun
 * @since 2017-09-27
 */
public class User{

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 名字
     */
	private String name;
    /**
     * 年龄
     */
	private Integer age;

	private Date createTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
		sb.append("\"age\":")
				.append(age);
		sb.append(",\"createTime\":\"")
				.append(createTime).append('\"');
		sb.append(",\"id\":")
				.append(id);
		sb.append(",\"name\":\"")
				.append(name).append('\"');
		sb.append('}');
		return sb.toString();
	}
}
