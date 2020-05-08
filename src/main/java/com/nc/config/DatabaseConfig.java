//package com.nc.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@MapperScan(value="com.nc.mapper", sqlSessionFactoryRef="ncSqlSessionFactory")
//public class DatabaseConfig {
//	@Value("${spring.datasource.mapperPath}")
//    private String mapperPath;
//	
//	@Bean(name = "ncDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource samsDataSource() {
//		return DataSourceBuilder.create().build();
//    }
//	
//    @Bean(name = "ncSqlSessionFactory")
//    public SqlSessionFactory ncSqlSessionFactory(@Qualifier("ncDataSource") DataSource dataSource, ApplicationContext applicationContext) throws Exception {
//    	SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:"+mapperPath+"/*.xml"));
//		return sqlSessionFactoryBean.getObject();  
//    }
// 
//    @Bean(name = "ncSqlSessionTemplate")
//    public SqlSessionTemplate ncSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception { 
//    	return new SqlSessionTemplate(sqlSessionFactory);
//    }
//    
//    @Bean(name = "ncTransactionManager")
//    public PlatformTransactionManager transactionManager() {    
//        return new DataSourceTransactionManager(samsDataSource());
//    }
//}
