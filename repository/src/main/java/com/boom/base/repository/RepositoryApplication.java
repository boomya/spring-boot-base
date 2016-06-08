package com.boom.base.repository;

import com.boom.base.repository.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * Created by jiangshan on 16/6/7.
 */
@SpringBootApplication
public class RepositoryApplication implements CommandLineRunner {

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RepositoryApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("========= datasource:" + dataSource.toString());
        System.out.println("========= " + memberMapper.findMemberById("1").getName());
    }
}
