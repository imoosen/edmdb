package com.fiveone.edm.database.entity;

import java.sql.Timestamp;

/**
 * t_email_content实体类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月26日下午7:20:55
 * @version: 1.0
 * @since: JDK1.7
 */
public class EmailContent {

	//主键id
	private Integer id;
	
	//邮件主题
	private String emailTitle;
	
	//邮件内容
	private String content;
	
	//是否需要发送 0：否 1：是
	private Integer isSend;
	
	//数据创建时间
	private Timestamp createDate;
		
	//数据更新时间
	private Timestamp updateDate;
	
	//内容是否有效：0：无效，1：有效
	private Integer contentIsValid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIsSend() {
		return isSend;
	}

	public void setIsSend(Integer isSend) {
		this.isSend = isSend;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getContentIsValid() {
		return contentIsValid;
	}

	public void setContentIsValid(Integer contentIsValid) {
		this.contentIsValid = contentIsValid;
	}

}
