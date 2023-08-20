package saksham.spring.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements SportsCoach{
	
	private ExpertAdvise expertAdvise;
	
	public FootballCoach() {}
	
	@Autowired
	public void setExpertAdvise(ExpertAdvise expAdvise) {
		expertAdvise = expAdvise;
	}
	
	public String getTrainingSchedule() {
		return "Practice Dribbling";
	}
	
	public String getAdvise() {
		return expertAdvise.getAdvise();
	}

}
