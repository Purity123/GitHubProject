package com.hundsun.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Project: design-pattern
 * @Package: com.hundsun.config
 * @Author: Administrator
 * @Description: TODO
 * @Version: 1.0
 * @Datetime: 2017/9/28 9:16
 */
@Component //自动注入
@ConfigurationProperties(prefix = "spring.datasource.car")
@Data
public class DataSourceCarProperties {
    private String type;
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private int maxWait;
    private int timeBetweenEvictionRunsMillis;
    private int minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private boolean poolPreparedStatements;
    private int maxPoolPreparedStatementPerConnectionSize;
    private String filters;
    private String connectionProperties;
}
