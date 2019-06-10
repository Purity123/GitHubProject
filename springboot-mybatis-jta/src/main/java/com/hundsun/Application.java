package com.hundsun;

import com.hundsun.web.config.DataSourceCarProperties;
import com.hundsun.web.config.DataSourceTestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DataSourceCarProperties.class,DataSourceTestProperties.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
