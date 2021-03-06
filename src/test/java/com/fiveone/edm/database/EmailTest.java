package com.fiveone.edm.database;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fiveone.edm.database.dao.IEmailDao;
import com.fiveone.edm.database.entity.Email;

/**
 * 测试邮箱信息
 * @company: 51jrq
 * @author: lhw
 * @tim: 2016年12月27日下午5:18:30
 * @version: 1.0
 * @since: JDK1.7
 */
public class EmailTest extends TestCase {
	/*
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(EmailTest.class); 
	
	@Before
    public void setup() {
		System.out.println("before Test");
    }
    
	*//**
	 * 测试根据id查询
	 *//*
	@Test
    public void testQueryById() {
		System.out.println("测试根据id查询...");
		IEmailDao emailDao = loadXml();
		Email email = emailDao.queryById(2);
		System.out.println(email.getEmailAddress());
		System.out.println(email.getCity());
	}
	
	*//**
	 * 测试根据邮箱类型查询
	 *//*
	@Test
    public void testQueryByEmailType() {
		System.out.println("测试根据邮箱类型查询...");
		IEmailDao emailDao = loadXml();
		List<Email> emailList = emailDao.queryByEmailType("163.com");
		for (Email email : emailList) {
			System.out.println(email.getEmailAddress());
			System.out.println(email.getCity());
			System.out.println("===================");
		}
	}
	
	*//**
	 * 测试查询所有
	 *//*
	@Test
    public void testQueryAll() {
		System.out.println("测试查询所有...");
		IEmailDao emailDao = loadXml();
		List<Email> emailList = emailDao.queryAll();
		for (Email email : emailList) {
			System.out.println(email.getEmailAddress());
			System.out.println(email.getEmailType());
			System.out.println("===================");
		}
	}
	
	*//**
	 * 测试分页查询所有
	 *//*
	@Test
	public void testQueryByPage() {
		System.out.println("测试分页查询所有...");
		IEmailDao emailDao = loadXml();
		List<Email> emailList = emailDao.queryAllByPage(0, 2);
		for (Email email : emailList) {
			System.out.println(email.getEmailAddress());
			System.out.println(email.getEmailType());
			System.out.println("===================");
		}
	 }
	
	*//**
	 * 测试查询总数
	 *//*
	@Test
	public void testQueryTatolCount() {
		System.out.println("测试查询总数...");
		IEmailDao emailDao = loadXml();
		int count = emailDao.queryTotalCount();
		System.out.println(count);
	 }
	
	*//**
	 * 测试删除
	 *//*
	@Test
	public void testDelete() {
		System.out.println("测试删除...");
		IEmailDao emailDao = loadXml();
		int row = emailDao.deleteById(3);
		System.out.println(row);
		Assert.assertNotNull(true);
	 }
    
	*//**
	 * 测试插入邮箱信息
	 *//*
	@Test
    public void testInsert() {
		System.out.println("测试插入邮箱信息...");
		IEmailDao emailDao = loadXml();
    	Email email = new Email();
    	email.setEmailAddress("595971102@qq.com");
    	email.setEmailType("qq.com");
    	email.setCreateDate(new Timestamp(System.currentTimeMillis()));
    	email.setDataIsValid(1);
    	email.setCity("1");
    	email.setEmailIsSubscibe(1);
    	email.setEmailState(1);
    	email.setProvince("1");
    	email.setSource("1");
    	email.setUpdateDate(new Timestamp(System.currentTimeMillis()));
    	int row = emailDao.save(email);
    	System.out.println(row);
    	Assert.assertNotNull(true);  
    } 
	
	*//**
	 * 测试修改邮箱信息
	 *//*
	@Test
    public void testUpdate() {
		System.out.println("测试修改邮箱信息...");
		IEmailDao emailDao = loadXml();
    	Email email = new Email();
    	email.setId(2);
    	email.setEmailAddress("374745367@163.com");
    	email.setEmailType("163.com");
    	email.setCreateDate(new Timestamp(System.currentTimeMillis()));
    	email.setDataIsValid(1);
    	email.setCity("北京");
    	email.setEmailIsSubscibe(1);
    	email.setEmailState(1);
    	email.setProvince("1");
    	email.setSource("1");
    	email.setUpdateDate(new Timestamp(System.currentTimeMillis()));
    	int row = emailDao.update(email);
    	System.out.println(row);
    	Assert.assertNotNull(true);  
    }

	  
	@SuppressWarnings("resource")
	private IEmailDao loadXml() {
		String paths[] = {"classpath:spring/applicationContext-dao.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		IEmailDao emailDao = (IEmailDao) ctx.getBean("emailDao");
		return emailDao;
	}*/
}
