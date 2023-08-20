package saksham.spring.springDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import saksham.spring.springDemo.CricketCoach;
import saksham.spring.springDemo.ExpertAdvise;
import saksham.spring.springDemo.FootballCoach;
import saksham.spring.springDemo.PracticeAdvise;
import saksham.spring.springDemo.SportsCoach;

@Configuration
@ComponentScan
public class SpringConfig {
	
	@Bean
	public ExpertAdvise practiceAdvise() {
		return new PracticeAdvise();
	}
	
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvise());
	}
	
	@Bean
	public SportsCoach footballCoach() {
		return new FootballCoach();
	}

}
