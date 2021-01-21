package exam.spring.board.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(
		basePackages = "test.dao",
		sqlSessionFactoryRef = "sqlSessionFactoryBean"
		)
public class MyBatisConfig {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean
	(DataSource dataSource, ApplicationContext applicationContext) throws IOException {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(applicationContext.getResource(""));
		factoryBean.setMapperLocations(applicationContext.getResources(""));
		return factoryBean;
		
	}
}
