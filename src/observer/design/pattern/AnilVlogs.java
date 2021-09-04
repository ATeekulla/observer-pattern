package observer.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class AnilVlogs implements Subject {

	List<Follower> subs = new ArrayList<>();

	String title;

	@Override
	public void subscribe(Follower sub) {
		subs.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}

	@Override
	public void notifySubscribers() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
}
