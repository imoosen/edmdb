package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailDao;
import com.fiveone.edm.database.entity.Email;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月27日下午4:28:45
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailDao")
public class EmailDaoImpl extends DBMybatisGenericImpl implements IEmailDao {

	/**
	 * 根据id查询邮箱
	 * @param id
	 * @return
	 */
	@Override
	public Email queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailMapper.queryById",id);
	}

	/**
	 * 根据邮箱类型查询
	 * @param emailType
	 * @return
	 */
	@Override
	public List<Email> queryByEmailType(String emailType) {
		return sqlSessionTemplate.selectList("emailMapper.queryByEmailType",emailType);
	}

	/**
	 * 根据邮箱地址查询
	 * @param emailAddress
	 * @return
	 */
	@Override
	public List<Email> queryByEmailAddress(String emailAddress,String no) {
		StringBuffer sb = new StringBuffer("t_email_");
		sb.append(no);
		String table = sb.toString();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emailAddress", emailAddress);
		map.put("table", table);
		return sqlSessionTemplate.selectList("emailMapper.queryByEmailAddress",map);
	}

	
	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<Email> queryAll() {
		return sqlSessionTemplate.selectList("emailMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<Email> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailMapper.queryAllByPage",map);
	}

	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailMapper.queryTotalCount").size();
	}

	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailMapper.deleteById",id);
	}

	/**
	 * 保存邮箱
	 * @param email
	 */
	@Override
	public int save(Email email) {
		return sqlSessionTemplate.insert("emailMapper.save",email);
	}

	/**
	 * 修改邮箱
	 * @param email
	 */
	@Override
	public int update(Email email) {
		return sqlSessionTemplate.update("emailMapper.update",email);
	}

}
