package com.example.oauthdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/**
 * 资源控制服务，可以具体到某一个权限访问某一个接口url
 * */
@Configuration
@EnableResourceServer
public class ResourceServerConfig {
}
