package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailContentDao;
import com.fiveone.edm.database.entity.EmailContent;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱内容数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月27日下午4:31:22
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailContentDao")
public class EmailContentDaoImpl extends DBMybatisGenericImpl implements IEmailContentDao {

	/**
	 * 根据id查询邮箱内容
	 * @param id
	 * @return
	 */
	@Override
	public EmailContent queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailContentMapper.queryById",id);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<EmailContent> queryAll() {
		return sqlSessionTemplate.selectList("emailContentMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<EmailContent> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailContentMapper.queryAllByPage",map);
	}
	
	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailContentMapper.queryTotalCount").size();
	}

	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailContentMapper.deleteById",id);
	}

	/**
	 * 保存邮箱内容
	 * @param emailContent
	 */
	@Override
	public int save(EmailContent emailContent) {
		return sqlSessionTemplate.insert("emailContentMapper.save",emailContent);
	}

	/**
	 * 修改邮箱内容
	 * @param emailContent
	 */
	@Override
	public int update(EmailContent emailContent) {
		return sqlSessionTemplate.update("emailContentMapper.update",emailContent);
	}

}
