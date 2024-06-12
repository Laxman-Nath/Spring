package com.spring.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.queries.QueryClass;

@Configuration
@ComponentScan(basePackages ="com.spring.queries")
public class JavaConfig2 {
	
@Bean
public DriverManagerDataSource getDataSource() {
DriverManagerDataSource ds=new DriverManagerDataSource();
ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
ds.setPassword("siddha@123");
ds.setUrl("jdbc:mysql://localhost/springjdbc");
ds.setUsername("root");
return ds;
}

@Bean
public JdbcTemplate getJdbcTemplate() {	
	JdbcTemplate template=new JdbcTemplate();
	template.setDataSource(getDataSource());
	return  template;
}



}



