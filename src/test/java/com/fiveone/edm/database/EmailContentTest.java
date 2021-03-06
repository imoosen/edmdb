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

import com.fiveone.edm.database.dao.IEmailContentDao;
import com.fiveone.edm.database.entity.EmailContent;

/**
 * 测试邮箱内容信息
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月28日下午5:18:30
 * @version: 1.0
 * @since: JDK1.7
 */
public class EmailContentTest extends TestCase {
	
	/*@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(EmailContentTest.class); 
	
	@Before
    public void setup() {
		System.out.println("before Test");
    }
    
	*//**
	 * 测试根据id查询邮箱内容
	 *//*
	@Test
    public void testQueryById() {
		System.out.println("测试根据id查询...");
		IEmailContentDao emailContentDao = loadXml();
		EmailContent emailContent = emailContentDao.queryById(1);
		System.out.println(emailContent.getEmailTitle());
		System.out.println(emailContent.getContent());
	}
	
	*//**
	 * 测试查询所有
	 *//*
	@Test
    public void testQueryAll() {
		System.out.println("测试查询所有...");
		IEmailContentDao emailContentDao = loadXml();
		List<EmailContent> ecList = emailContentDao.queryAll();
		for (EmailContent emailContent : ecList) {
			System.out.println(emailContent.getEmailTitle());
			System.out.println(emailContent.getContent());
			System.out.println("======================");
		}
	}
	
	*//**
	 * 测试分页查询所有
	 *//*
	@Test
	public void testQueryByPage() {
		System.out.println("测试分页查询所有...");
		IEmailContentDao emailContentDao = loadXml();
		List<EmailContent> ecList = emailContentDao.queryAllByPage(0, 2);
		for (EmailContent emailContent : ecList) {
			System.out.println(emailContent.getEmailTitle());
			System.out.println(emailContent.getContent());
			System.out.println("======================");
		}
	 }
	
	*//**
	 * 测试查询总数
	 *//*
	@Test
	public void testQueryTatolCount() {
		System.out.println("测试查询总数...");
		IEmailContentDao emailContentDao = loadXml();
		int count = emailContentDao.queryTotalCount();
		System.out.println(count);
	 }
	
	*//**
	 * 测试删除
	 *//*
	@Test
	public void testDelete() {
		System.out.println("测试删除...");
		IEmailContentDao emailContentDao = loadXml();
		int row = emailContentDao.deleteById(2);
		System.out.println(row);
	 }
    
	*//**
	 * 测试插入邮箱内容信息
	 *//*
	@Test
    public void testInsert() {
		System.out.println("测试插入邮箱内容信息...");
		IEmailContentDao emailContentDao = loadXml();
		EmailContent ec = new EmailContent();
		ec.setEmailTitle("51金融圈有活动啦！");
		ec.setContent("初具规模后一般会自建edm发送平台，这样既可以保障数据安全，又能和公司现有业务做定制化的整合。自建edm前期成本投入相对较大，但是从长远来看是一劳永逸的做法。");
		ec.setIsSend(1);
		ec.setCreateDate(new Timestamp(System.currentTimeMillis()));
		ec.setUpdateDate(null);
		ec.setContentIsValid(1);
		int row = emailContentDao.save(ec);
		System.out.println(row);
		Assert.assertNotNull(true);  
    } 
	
	*//**
	 * 测试修改邮箱内容信息
	 *//*
	@Test
    public void testUpdate() {
		System.out.println("测试修改邮箱内容信息...");
		IEmailContentDao emailContentDao = loadXml();
		EmailContent ec = new EmailContent();
		ec.setId(1);
		ec.setEmailTitle("51金融圈邀请您的到来！");
		ec.setContent("另外不要相信那些邮件群发机啥的东西，他们大多都是通过频繁拨号更换ip或使用不靠谱的smtp代理来发送邮件，使用这些软件发送的邮件头信息不是很正规，容易被esp根据关键字封锁，也不能有效的通过邮件建立自己公司的形象，大家自己邮箱或多或少会收到些“代开发票”之类的邮件，看看这些就知道了");
		ec.setIsSend(1);
		ec.setCreateDate(new Timestamp(System.currentTimeMillis()));
		ec.setUpdateDate(new Timestamp(System.currentTimeMillis()));
		ec.setContentIsValid(1);
		int row = emailContentDao.update(ec);
		System.out.println(row);
		Assert.assertNotNull(true);  
    }

	  
	@SuppressWarnings("resource")
	private IEmailContentDao loadXml() {
		String paths[] = {"classpath:spring/applicationContext-dao.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		IEmailContentDao emailContentDao = (IEmailContentDao) ctx.getBean("emailContentDao");
		return emailContentDao;
	}*/
}
