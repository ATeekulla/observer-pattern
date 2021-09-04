package observer.design.pattern;

public class ObserverDesignPattern {
	public static void main(String[] args) {
		AnilVlogs anilVlogs = new AnilVlogs();

		Follower s1 = new Follower("John");
		Follower s2 = new Follower("James");
		Follower s3 = new Follower("Nick");
		Follower s4 = new Follower("Jonny");

		anilVlogs.subscribe(s1);
		anilVlogs.subscribe(s2);
		anilVlogs.subscribe(s3);
		anilVlogs.subscribe(s4);

		s1.followChannel(anilVlogs);
		s2.followChannel(anilVlogs);
		s3.followChannel(anilVlogs);
		s4.followChannel(anilVlogs);

		anilVlogs.upload("Observer Design Pattern");

	}

}
