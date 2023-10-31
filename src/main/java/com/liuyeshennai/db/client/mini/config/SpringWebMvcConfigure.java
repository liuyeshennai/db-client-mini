package com.liuyeshennai.db.client.mini.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringWebMvcConfigure implements WebMvcConfigurer {

  @Autowired
  private CommonInterceptor commonInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(commonInterceptor)
        .addPathPatterns("/**")
        .excludePathPatterns("");
    WebMvcConfigurer.super.addInterceptors(registry);
  }

}
