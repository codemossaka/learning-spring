package ru.godsonpeya.spring;

public class BaseBallCoatch implements Coatch{

	private FortuneService fortuneService;
	
	public BaseBallCoatch(FortuneService theFortuneService) {
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
