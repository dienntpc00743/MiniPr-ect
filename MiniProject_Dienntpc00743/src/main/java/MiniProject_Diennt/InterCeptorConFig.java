package MiniProject_Diennt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import MiniProject_Diennt.interCeptor.GlobalInterceptor;

@Configuration
public class InterCeptorConFig implements WebMvcConfigurer {
	
	@Autowired
	GlobalInterceptor global;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(global)
		.addPathPatterns("/**")
		.excludePathPatterns("/rest/**","/admin/**","/order/**");

	}
}
