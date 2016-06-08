package com.boom.base.repository.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyBatisConfig {

    @Value("${my.test}")
    private String myTest;
    @Value("${spring.datasource.jdbc.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.jdbc.username}")
    private String username;
    @Value("${spring.datasource.jdbc.password}")
    private String password;
    @Value("${spring.datasource.jdbc.maxActive:20}")
    private int    maxActive;

    @Bean
    public DataSource dataSource() {

        System.out.println(
                "======= MyBatisConfig ====== jdbcUrl:" + jdbcUrl + " username:" + username + " password:" + password +
                " maxActive:" + maxActive + " test:" + myTest);
        DruidDataSource druidDataSource = new DruidDataSource();
        try {
            druidDataSource.setUrl(jdbcUrl);
            druidDataSource.setUsername(username);
            druidDataSource.setPassword(password);
            druidDataSource.setMaxActive(maxActive);

            druidDataSource.setFilters("stat");
            druidDataSource.setInitialSize(1);
            druidDataSource.setMaxActive(60000);
            druidDataSource.setMinIdle(1);
            druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
            druidDataSource.setMinEvictableIdleTimeMillis(300000);
            druidDataSource.setTestWhileIdle(true);
            druidDataSource.setTestOnBorrow(false);
            druidDataSource.setTestOnReturn(false);
            druidDataSource.setValidationQuery("select 'x'");
            druidDataSource.setPoolPreparedStatements(true);
            druidDataSource.setMaxOpenPreparedStatements(20);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return druidDataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

}
