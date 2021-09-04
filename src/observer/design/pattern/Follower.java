package observer.design.pattern;

public class Follower implements Observer {

	private String name;
	private AnilVlogs anilVlogs = new AnilVlogs();

	public Follower(String name) {
		super();
		this.name = name;
	}

	public Follower(String name, AnilVlogs anilVlogs) {
		super();
		this.name = name;
		this.anilVlogs = anilVlogs;
	}

	@Override
	public void update() {
		System.out.println(String.format("Hello %s new video uploaded on %s", name, anilVlogs.title));

	}

	@Override
	public void followChannel(AnilVlogs vlogs) {
		anilVlogs = vlogs;
	}

}
