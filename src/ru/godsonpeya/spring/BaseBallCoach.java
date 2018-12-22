package ru.godsonpeya.spring;

public class BaseBallCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spen 30 workoit";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
