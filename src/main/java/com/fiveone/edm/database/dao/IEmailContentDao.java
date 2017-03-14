package com.fiveone.edm.database.dao;

import java.util.List;

import com.fiveone.edm.database.entity.EmailContent;

/**
 * 邮箱内容数据库操作
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月27日上午11:15:15
 * @version: 1.0
 * @since: JDK1.7
 */
public interface IEmailContentDao {

	/**
	 * 根据id查询邮箱内容
	 * @param id
	 * @return
	 */
	public EmailContent queryById(Integer id);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<EmailContent> queryAll();
	
	/**
	 * 分页查询所有
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List<EmailContent> queryAllByPage(int startIndex,int pageSize);
	
	/**
	 * 查询总数
	 * @return
	 */
	public int queryTotalCount();
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public int deleteById(Integer id);
	
	/**
	 * 保存邮箱内容
	 * @param emailContent
	 */
	public int save(EmailContent emailContent);
	
	/**
	 * 修改邮箱内容
	 * @param emailContent
	 */
	public int update(EmailContent emailContent);
	
}
