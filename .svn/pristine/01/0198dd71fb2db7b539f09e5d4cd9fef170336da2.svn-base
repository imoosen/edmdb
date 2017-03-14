package com.fiveone.edm.database.entity;

import java.sql.Timestamp;

/**
 * t_email_content实体类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月29日 下午6:25:51
 * @version: 1.0
 * @since: JDK1.7
 */
public class EmailProject implements Cloneable {
	
	//主键id
	private Integer id;

	//项目名称
	private String projectName;
	
	//关联t_email_sender由谁来发送
	private Integer emailSenderId;
	private EmailSender emailSender;

	//关联t_email_content发送主题、内容
	private Integer contentId;
	private EmailContent emailContent;

	//计划发送多少
	private Integer planSend;
	
	//已经发送多少
	private Integer sendNum;

	//活动状态：0：无效,1：有效
	private Integer activeFlag;

	//'数据创建时间
	private Timestamp createDate;

	//数据更新时间
	private Timestamp updateDate;
	
	//项目状态是否有效：0：无效,1：有效
	private Integer projectState;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getEmailSenderId() {
		return emailSenderId;
	}

	public void setEmailSenderId(Integer emailSenderId) {
		this.emailSenderId = emailSenderId;
	}

	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

	public Integer getPlanSend() {
		return planSend;
	}

	public void setPlanSend(Integer planSend) {
		this.planSend = planSend;
	}

	public Integer getSendNum() {
		return sendNum;
	}

	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}

	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
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

	public Integer getProjectState() {
		return projectState;
	}

	public void setProjectState(Integer projectState) {
		this.projectState = projectState;
	}

	public EmailSender getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public EmailContent getEmailContent() {
		return emailContent;
	}

	public void setEmailContent(EmailContent emailContent) {
		this.emailContent = emailContent;
	}
	
	@Override
	public EmailProject clone() {  
		EmailProject project = null;  
        try{  
        	project = (EmailProject)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return project;  
    }  
}
