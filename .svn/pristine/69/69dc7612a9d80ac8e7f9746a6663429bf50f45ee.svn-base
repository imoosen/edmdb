package com.fiveone.edm.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fiveone.edm.database.dao.IEmailProjectDao;
import com.fiveone.edm.database.entity.EmailProject;
import com.fiveone.edm.database.utils.DBMybatisGenericImpl;

/**
 * 邮箱项目信息数据库操作实现类
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月30日 上午11:27:21
 * @version: 1.0
 * @since: JDK1.7
 */
@Repository("emailProjectDao")
public class EmailProjectDaoImpl extends DBMybatisGenericImpl implements IEmailProjectDao {

	/**
	 * 根据id查询邮箱项目信息
	 * @param id
	 * @return
	 */
	@Override
	public EmailProject queryById(Integer id) {
		return sqlSessionTemplate.selectOne("emailProjectMapper.queryById",id);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@Override
	public List<EmailProject> queryAll() {
		return sqlSessionTemplate.selectList("emailProjectMapper.queryAll");
	}

	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<EmailProject> queryAllByPage(int startIndex, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startIndex", startIndex);
		map.put("pageSize", pageSize);
		return sqlSessionTemplate.selectList("emailProjectMapper.queryAllByPage",map);
	}
	
	/**
	 * 查询总数
	 * @return
	 */
	@Override
	public int queryTotalCount() {
		return sqlSessionTemplate.selectList("emailProjectMapper.queryTotalCount").size();
	}

	/**
	 * 根据id删除
	 * @param id
	 */
	@Override
	public int deleteById(Integer id) {
		return sqlSessionTemplate.delete("emailProjectMapper.deleteById",id);
	}

	/**
	 * 保存邮箱项目信息
	 * @param emailProject
	 * @return
	 */
	@Override
	public int save(EmailProject emailProject) {
		return sqlSessionTemplate.insert("emailProjectMapper.save",emailProject);
	}

	/**
	 * 修改邮箱项目信息
	 * @param emailProject
	 * @return
	 */
	@Override
	public int update(EmailProject emailProject) {
		return sqlSessionTemplate.update("emailProjectMapper.update",emailProject);
	}

}
