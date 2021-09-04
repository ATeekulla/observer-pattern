package observer.design.pattern;

public interface Subject {

	void subscribe(Follower sub);

	void unSubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}