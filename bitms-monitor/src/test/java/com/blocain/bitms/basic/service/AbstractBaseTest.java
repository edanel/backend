package com.blocain.bitms.basic.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试对象 Introduce
 * <p>File：AbstractBaseTest.java </p>
 * <p>Title: AbstractBaseTest </p>
 * <p>Description:AbstractBaseTest </p>
 * <p>Copyright: Copyright (c) 17/6/18</p>
 * <p>Company: BloCain</p>
 *
 * @author Playguy
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
     "classpath:spring.xml",
     "classpath:spring-jdbc.xml",
     "classpath:spring-mongodb.xml",
     "classpath:spring-jedis.xml"
})
public abstract class AbstractBaseTest
{
}
