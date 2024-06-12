package com.spring.crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.queries.QueryClass;

@Configuration
public class JavaConfig {
	
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

@Bean
public QueryClass getQueryClass() {
	QueryClass c=new QueryClass();
	c.setJt(getJdbcTemplate());
	return c;
}

}



