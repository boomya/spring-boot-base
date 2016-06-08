package com.boom.base.repository.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.boom.base.repository.mapper")
@AutoConfigureAfter({ MyBatisConfig.class, MyBatisConfigDevelopment.class })
public class MyBatisMapperScannerConfig {

    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.boom.base.repository.mapper");
        return mapperScannerConfigurer;
    }
}
