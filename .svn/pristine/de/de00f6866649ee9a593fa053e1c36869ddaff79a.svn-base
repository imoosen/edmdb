package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailStateDao;
import com.fiveone.edm.database.entity.EmailState;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱状态数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月27日下午4:38:49
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailStateDao")
public class EmailStateDaoImpl extends DBMybatisGenericImpl implements IEmailStateDao {

	/**
	 * 根据id查询邮箱状态
	 * @param id
	 * @return
	 */
	@Override
	public EmailState queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailStateMapper.queryById",id);
	}

	/**
	 * 根据邮箱状态编号查询
	 * @param emailType
	 * @return
	 */
	@Override
	public List<EmailState> queryByEmailStateNo(Integer stateNo) {
		return sqlSessionTemplate.selectList("emailStateMapper.queryByEmailStateNo",stateNo);
	}
	
	/**
	 * 根据邮箱状态编号和状态内容查询
	 * @param stateNo
	 * @param stateContent
	 * @return
	 */
	@Override
	public EmailState queryByWhere(Integer stateNo, String stateContent) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stateNo", stateNo);
		map.put("stateContent", stateContent);
		return sqlSessionTemplate.selectOne("emailStateMapper.queryByWhere",map);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<EmailState> queryAll() {
		return sqlSessionTemplate.selectList("emailStateMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<EmailState> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailStateMapper.queryAllByPage",map);
	}
	
	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailStateMapper.queryTotalCount").size();
	}

	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailStateMapper.deleteById",id);
	}

	/**
	 * 保存邮箱状态
	 * @param emailState
	 */
	@Override
	public int save(EmailState emailState) {
		return sqlSessionTemplate.insert("emailStateMapper.save",emailState);
	}

	/**
	 * 修改邮箱状态
	 * @param emailState
	 */
	@Override
	public int update(EmailState emailState) {
		return sqlSessionTemplate.update("emailStateMapper.update",emailState);
	}

}
