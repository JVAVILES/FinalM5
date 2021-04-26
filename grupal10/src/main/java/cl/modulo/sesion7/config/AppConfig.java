package cl.modulo.sesion7.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("cl.modulo.sesion7")
public class AppConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource dMDS = new DriverManagerDataSource();
		dMDS.setDriverClassName(env.getProperty("db.driver"));
		dMDS.setUsername(env.getProperty("db.username"));
		dMDS.setPassword(env.getProperty("db.password"));
		dMDS.setUrl(env.getProperty("db.url"));
		return dMDS;
	}
	 

	
}
