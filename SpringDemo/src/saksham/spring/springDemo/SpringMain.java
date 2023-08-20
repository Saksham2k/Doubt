package saksham.spring.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import saksham.spring.springDemo.config.SpringConfig;

public class SpringMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("--------------------Cricket Schedule--------------------");
		SportsCoach sp = ctx.getBean("cricketCoach", SportsCoach.class);
		System.out.println(sp.getTrainingSchedule());
		System.out.println(sp.getAdvise());
		
		System.out.println("--------------------Football Schedule--------------------");
		sp = ctx.getBean("footballCoach", SportsCoach.class);
		System.out.println(sp.getTrainingSchedule());
		System.out.println(sp.getAdvise());
	}

}
