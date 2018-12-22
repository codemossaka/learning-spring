package ru.godsonpeya.spring;

public class TrackCoatch implements Coatch {
	private FortuneService fortuneService;
	
	public TrackCoatch() {
	}
	public TrackCoatch(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It "+ fortuneService.getFortune();
	}

}
