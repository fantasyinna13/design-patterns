package observer;

import java.util.ArrayList;
import java.util.List;

public class Cinema implements Observable {

	private List<Observer> subscribers;
	private String cinema; 
	
	public Cinema() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.subscribers.add(observer);
		observer.setCinema(this);

	}

	@Override
	public void unsubscribe(Observer observer) {
		this.subscribers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.subscribers) {
			observer.update();
		} 
		
	}

	@Override
	public String getUpdate() {
		return this.cinema;
	}

	public void setCinema(String cinema) {
		this.cinema = cinema;
		this.notifyObservers();
	}

}
