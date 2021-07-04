package com.ctsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ctsi.ssdc.captcha.CaptchaHandlerInterceptor;
//后端验证码拦截器输入F
@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer  {

	@Bean
	public CaptchaHandlerInterceptor captchaHandlerInterceptor() {
		return new CaptchaHandlerInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){

		WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(captchaHandlerInterceptor());

	}
}
