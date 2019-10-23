package com.hehe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

@MapperScan(
		//指定扫描包
		basePackages = {"com.hehe.dao"}
//		{"com.hehe.pojo"}
	)
@SpringBootApplication
public class StartApplication {

//	@Autowired
//	SqlSessionFactory sqlSessionFactory = null;

	// 定义 MyBatis Mapper 接口
//	@Bean
//	public MapperFactoryBean<UserDao> initMyBatisUserDao() {
//		MapperFactoryBean<UserDao> bean = new MapperFactoryBean<>();
//		bean.setMapperInterface(UserDao.class);
//		bean.setSqlSessionFactory(sqlSessionFactory);
//		return bean;
//	}

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}


//请求地址：http://localhost:8080/demo/file/2