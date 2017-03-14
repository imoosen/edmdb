package com.fiveone.edm.database.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailSendPolicyDao;
import com.fiveone.edm.database.entity.EmailSendPolicy;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱策略操作数据库实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2017年1月12日 下午2:28:55
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailSendPolicyDao")
public class EmailSendPolicyDaoImpl extends DBMybatisGenericImpl implements IEmailSendPolicyDao {

	/**
	 *  根据主键或邮箱类型或客户端id查找
	 * @param entity
	 * @return
	 */
	@Override
	public List<?> selectPolicyByid_mailtype_clientid(EmailSendPolicy esp) {
		return sqlSessionTemplate.selectList("emailSendPolicyMapper.selectPolicyByid_mailtype_clientid", esp);
	}

	/**
	 * 根据主键删除数据
	 * @param entity
	 */
	@Override
	public int deleteByPrimaryKey(EmailSendPolicy esp) {
		return sqlSessionTemplate.delete("emailSendPolicyMapper.deleteByPrimaryKey", esp);
	}

	/**
	 * 根据主键修改数据 
	 * @param entity
	 */
	@Override
	public int updateMailSendPolicyById(EmailSendPolicy esp) {
		return sqlSessionTemplate.update("emailSendPolicyMapper.updateMailSendPolicyById", esp);
	}

	/**
	 * 插入数据
	 * @param entity
	 */
	@Override
	public int insertMailSendPolicy(EmailSendPolicy esp) {
		return sqlSessionTemplate.insert("emailSendPolicyMapper.insertMailSendPolicy", esp);
	}

	/**
	 * 统计邮箱计划
	 * @return
	 */
	@Override
	public int queryCountPlan() {
		return sqlSessionTemplate.selectList("emailSendPolicyMapper.queryCountPlan").size();
	}

}
