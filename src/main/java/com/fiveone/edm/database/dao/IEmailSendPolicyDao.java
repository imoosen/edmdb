package com.fiveone.edm.database.dao;

import java.util.List;

import com.fiveone.edm.database.entity.EmailSendPolicy;

/**
 * 邮件发送策略操作数据库类
 * @company: 51jrq
 * @author: lhw
 * @time: 2017年1月12日 下午1:53:48
 * @version: 1.0
 * @since: JDK1.7
 */
public interface IEmailSendPolicyDao {

	/**
	 *  根据主键或邮箱类型或客户端id查找
	 * @param entity
	 * @return
	 */
	public List<?> selectPolicyByid_mailtype_clientid(EmailSendPolicy esp);
	
	/**
	 * 根据主键删除数据
	 * @param entity
	 */
	public int deleteByPrimaryKey(EmailSendPolicy esp);
	
	/**
	 * 根据主键修改数据 
	 * @param entity
	 */
	public int updateMailSendPolicyById(EmailSendPolicy esp);
	
	/**
	 * 插入数据
	 * @param entity
	 */
	public int insertMailSendPolicy(EmailSendPolicy esp);
	
	/**
	 * 统计邮箱计划
	 * @return
	 */
	public int queryCountPlan();
}
