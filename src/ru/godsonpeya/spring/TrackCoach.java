package ru.godsonpeya.spring;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	public TrackCoach(FortuneService theFortuneService) {
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
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: insite the method doMyStartupStuff");
	}
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: insite the method doMyCleanupStuffYoYo");
	}

}
