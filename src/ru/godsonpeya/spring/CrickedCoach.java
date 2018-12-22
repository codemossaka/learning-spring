package ru.godsonpeya.spring;

public class CrickedCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAdress;
	
	private String team;
	
	public CrickedCoach() {
		System.out.println("behind the scene");
	}

	@Override
	public String getDailyWorkout() {
		return "Patrcie is the ";
	}

	@Override
	public String getDailyFortune() {
		return "cricked "+ fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("set fortuneService");
		this.fortuneService = theFortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("set emailAdress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("set team");
		this.team = team;
	}

	
}
