package com.woyi.mhub.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.woyi.mhub.domain.DemoEntity;
import com.woyi.mhub.repository.DemoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	// 初始化执行
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	// 验证controller是否正常响应
	@Test
	public void getHello() throws Exception {
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/hello");
		//设置参数如果有需要 mockHttpServletRequestBuilder.param( "username", "tom" ).param( "password", "jessica" );
		ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		resultActions.andExpect(status().isOk());
	}

//	@Autowired
//	private DemoMapper demoMapper;

	@Autowired
	private DemoRepository demoRepository;
	
	@Test
	public void testInsert() throws Exception {
		DemoEntity demo = new DemoEntity();
		demo.setName("A");
		demo.setPassWord("111");
		Assert.assertEquals(2, demoRepository.save(demo));
	}
	
	@Test
	public void testCount() throws Exception {
		Assert.assertEquals(2, demoRepository.count());
	}
}
