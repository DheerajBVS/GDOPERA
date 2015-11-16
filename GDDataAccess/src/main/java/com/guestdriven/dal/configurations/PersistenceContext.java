package com.guestdriven.dal.configurations;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "com.guestdriven.dal.repositories" })
@EnableTransactionManagement
@PropertySource("classpath:/application.properties")
/**
 * PersistenceContext
 * 
 * JPA specific Bean configurations
 * 
 * @author dheeraj
 * 
 */
public class PersistenceContext {
	private static final String PROPERTY_NAME_DATABASE_DRIVER = "datasource.driverClassName";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "datasource.password";
	private static final String PROPERTY_NAME_DATABASE_URL = "datasource.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "datasource.username";
	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "jpa.hibernate.dialect";
	@Resource
	private Environment env;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env
				.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		dataSource.setUsername(env
				.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		dataSource.setPassword(env
				.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));

		return dataSource;
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(getDataSource());
		entityManagerFactoryBean
				.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean
				.setPackagesToScan("com.guestdriven.dal.models");

		Properties jpaProperties = new Properties();

		jpaProperties.put("hibernate.dialect",
				env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));

		entityManagerFactoryBean.setJpaProperties(jpaProperties);

		return entityManagerFactoryBean;
	}

	@Bean
	JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory()
				.getObject());
		return transactionManager;
	}

}
