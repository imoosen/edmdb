package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailSenderDao;
import com.fiveone.edm.database.entity.EmailSender;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱发件人信息数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月30日 上午11:20:50
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailSenderDao")
public class EmailSenderDaoImpl extends DBMybatisGenericImpl implements IEmailSenderDao {

	/**
	 * 根据id查询邮箱发件人信息
	 * @param id
	 * @return
	 */
	@Override
	public EmailSender queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailSenderMapper.queryById",id);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<EmailSender> queryAll() {
		return sqlSessionTemplate.selectList("emailSenderMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<EmailSender> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailSenderMapper.queryAllByPage",map);
	}
	
	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailSenderMapper.queryTotalCount").size();
	}

	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailSenderMapper.deleteById",id);
	}

	/**
	 * 保存邮箱发件人信息
	 */
	@Override
	public int save(EmailSender emailSender) {
		return sqlSessionTemplate.insert("emailSenderMapper.save",emailSender);
	}

	/**
	 * 修改邮箱发件人信息
	 */
	@Override
	public int update(EmailSender emailSender) {
		return sqlSessionTemplate.update("emailSenderMapper.update",emailSender);
	}

}
