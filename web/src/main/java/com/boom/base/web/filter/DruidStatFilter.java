package com.boom.base.web.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by jiangshan on 16/6/8.
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="/druid/*")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}
