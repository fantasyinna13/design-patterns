package observer;

public class ObserverMain {

	public static void main(String[] args) {
		

		Cinema cinema = new Cinema();
		
		Observer obs1 = new CinemaSubscriber ("Cinema subscriber 01 ");
		Observer obs2 = new CinemaSubscriber ("Cinema subscriber 02 ");
		Observer obs3 = new CinemaSubscriber ("Cinema subscriber 03 ");
		
		cinema.subscribe(obs1);
		cinema.subscribe(obs2);
		cinema.subscribe(obs3);
		
		cinema.setCinema("Breaking news: Coming 2 America is out now! ");
		cinema.setCinema("Breaking news: Space Jam: A New Legacy is coming soon! ");

	}

}
