package saksham.spring.springDemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvise implements ExpertAdvise {

	public String getAdvise() {
		
		return "Do a lot of practice";
	}
	
}
