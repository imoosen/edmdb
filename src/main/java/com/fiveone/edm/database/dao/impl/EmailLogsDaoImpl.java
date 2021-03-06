package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailLogsDao;
import com.fiveone.edm.database.entity.EmailLogs;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱日志数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月27日下午4:46:26
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailLogsDao")
public class EmailLogsDaoImpl extends DBMybatisGenericImpl implements IEmailLogsDao {

	/**
	 * 根据id查询邮箱日志
	 * @param id
	 * @return
	 */
	@Override
	public EmailLogs queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailLogsMapper.queryById",id);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<EmailLogs> queryAll() {
		return sqlSessionTemplate.selectList("emailLogsMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<EmailLogs> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailLogsMapper.queryAllByPage",map);
	}

	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailLogsMapper.queryTotalCount").size();
	}

	/**
	 * 统计某个邮件项目每分钟发送量
	 * @param table     邮箱日志表名
	 * @return
	 */
	@Override
	public int queryCountByMinute(String table) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("table", table);
		return sqlSessionTemplate.selectList("emailLogsMapper.queryCountByWhen",map).size();
	}

	/**
	 * 统计某个邮件项目每小时发送量
	 * @param table	邮箱日志表名
	 * @return
	 */
	@Override
	public int queryCountByHour(String table) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("table", table);
		return sqlSessionTemplate.selectList("emailLogsMapper.queryCountByHour",map).size();
	}

	/**
	 * 统计某个邮件项目每天发送量
	 * @param table	邮箱日志表名
	 * @return
	 */
	@Override
	public int queryCountByDay(String table) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("table", table);
		return sqlSessionTemplate.selectList("emailLogsMapper.queryCountByDay",map).size();
	}


	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailLogsMapper.deleteById",id);
	}
	
	/**
	 * 保存邮箱日志
	 * @param emailLogs
	 */
	@Override
	public int save(EmailLogs emailLogs) {
		return sqlSessionTemplate.insert("emailLogsMapper.save",emailLogs);
	}

	/**
	 * 根据主键修改邮箱日志
	 * @param emailLogs
	 */
	@Override
	public int update(EmailLogs emailLogs) {
		return sqlSessionTemplate.update("emailLogsMapper.update",emailLogs);
	}

	/**
	 * 根据邮箱id修改邮箱日志
	 * @param emailLogs
	 */
	@Override
	public int updateByEmailId(EmailLogs emailLogs,String no) {
		StringBuffer sb = new StringBuffer("t_email_logs_");
		sb.append(no);
		String table = sb.toString();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("table", table);
		map.put("emailId", emailLogs.getEmailId());
		map.put("msgSend", emailLogs.getMsgSend());
		map.put("stateId", emailLogs.getStateId());
		//map.put("updateDate", emailLogs.getUpdateDate());
		return sqlSessionTemplate.update("emailLogsMapper.updateByEmailId",map);
	}
}
