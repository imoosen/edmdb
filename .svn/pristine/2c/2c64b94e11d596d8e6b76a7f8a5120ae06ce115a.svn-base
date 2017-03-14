package com.fiveone.edm.database;

import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fiveone.edm.database.dao.IEmailStateDao;
import com.fiveone.edm.database.entity.EmailState;

/**
 * 测试邮箱内容信息
 * @company: 51jrq
 * @author: lhw
 * @time: 2016年12月28日下午5:18:30
 * @version: 1.0
 * @since: JDK1.7
 */
/*@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
@RunWith(value=SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:spring/applicationContext.xml"}) */
public class EmailStateTest extends TestCase {
	
	/*@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(EmailStateTest.class); 
	
	@Autowired 
	private IEmailStateDao emailStateDao;
	
	@Before
    public void setup() {
		System.out.println("before Test");
    }
    
	*//**
	 * 测试根据id查询邮箱状态
	 *//*
	@Test
    public void testQueryById() {
		System.out.println("测试根据id查询邮箱状态...");
		IEmailStateDao emailStateDao = loadXml();
		EmailState es = emailStateDao.queryById(1);
		System.out.println(es.getStateNo());
		System.out.println(es.getStateContent());
	}
	
	*//**
	 * 测试查询所有
	 *//*
	@Test
    public void testQueryAll() {
		System.out.println("测试查询所有...");
		IEmailStateDao emailStateDao = loadXml();
		List<EmailState> esList = emailStateDao.queryAll();
		for (EmailState emailState : esList) {
			System.out.println(emailState.getStateNo());
			System.out.println(emailState.getStateContent());
		}
	}
	
	*//**
	 * 测试分页查询所有
	 *//*
	@Test
	public void testQueryByPage() {
		System.out.println("测试分页查询所有...");
		IEmailStateDao emailStateDao = loadXml();
		List<EmailState> esList = emailStateDao.queryAllByPage(0, 2);
		for (EmailState emailState : esList) {
			System.out.println(emailState.getStateNo());
			System.out.println(emailState.getStateContent());
		}
	 }
	
	*//**
	 * 测试查询总数
	 *//*
	@Test
	public void testQueryTatolCount() {
		System.out.println("测试查询总数...");
		IEmailStateDao emailStateDao = loadXml();
		int count = emailStateDao.queryTotalCount();
		System.out.println(count);
	 }
	
	*//**
	 * 测试删除
	 *//*
	@Test
	public void testDelete() {
		System.out.println("测试删除...");
		IEmailStateDao emailStateDao = loadXml();
		int row = emailStateDao.deleteById(10);
		System.out.println(row);
	 }
    
	*//**
	 * 测试插入邮箱状态信息
	 *//*
	@Test
    public void testInsert() {
		System.out.println("测试插入邮箱状态信息...");
		IEmailStateDao emailStateDao = loadXml();
		EmailState es = new EmailState();
		es.setStateNo(220);
		es.setStateContent("Service ready。 服务就绪。");
		int row = emailStateDao.save(es);
		System.out.println(row);
		Assert.assertNotNull(true);  
    } 
	
	*//**
	 * 测试修改邮箱状态信息
	 *//*
	@Test
    public void testUpdate() {
		System.out.println("测试修改邮箱状态信息...");
		IEmailStateDao emailStateDao = loadXml();
		EmailState es = new EmailState();
		es.setId(2);
		es.setStateNo(500);
		es.setStateContent("失败!");
		int row = emailStateDao.update(es);
		System.out.println(row);
		Assert.assertNotNull(true);  
    }
	
	@SuppressWarnings("resource")
	private IEmailStateDao loadXml() {
		String paths[] = {"classpath:spring/applicationContext-dao.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		IEmailStateDao emailStateDao = (IEmailStateDao) ctx.getBean("emailStateDao");
		return emailStateDao;
	}
*/
}
