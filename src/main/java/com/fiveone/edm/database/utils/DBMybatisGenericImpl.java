package com.fiveone.edm.database.utils;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

/**
 * 获取sqlSessionTemplate
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月26日下午5:11:30
 * @version: 1.0
 * @since: JDK1.7
 */
public class DBMybatisGenericImpl {
	
	@Resource
	public SqlSession sqlSessionTemplate;
}	
