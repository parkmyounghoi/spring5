package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect2.MHAspect;
import chap07.MemberDAO;

@Configuration
@EnableAspectJAutoProxy
public class MHCtx {

	@Bean
	public MemberDAO memberDao() {
		return new MemberDAO();
	}
	
	@Bean
	public MHAspect mhAspect() {
		return new MHAspect();
	}
}
