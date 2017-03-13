package com.yixi.rabbit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by eguoyix on 17/3/13.
 */
@Configuration
@EnableWebMvc
@ComponentScan(value={"com.yixi.rabbit.*"})
public class WebConfig {


}
