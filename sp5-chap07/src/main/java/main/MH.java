package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.MemberDAO;
import config.MHCtx;

public class MH {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext acac
		= new AnnotationConfigApplicationContext(MHCtx.class);
		
		MemberDAO dao = acac.getBean("memberDao",MemberDAO.class);
		dao.insert();
	}
	
}
