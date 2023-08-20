package saksham.spring.springDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach{
	
	private ExpertAdvise expertAdvise;
	
	
	public CricketCoach(ExpertAdvise expAdvise) {
		expertAdvise =  expAdvise;
	}
	
	public String getTrainingSchedule() {
		return "Practice Straight Drive";
	}
	
	public String getAdvise() {
		
		return expertAdvise.getAdvise();
		
	}
}
