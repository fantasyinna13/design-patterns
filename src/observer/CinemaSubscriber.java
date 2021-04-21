package observer;


public class CinemaSubscriber implements Observer {

	private String name;
	private Observable subscribedTo;
	
	public CinemaSubscriber(String name) {
		this.name = name; 
	}


	@Override
	public void update() {

		if(this.subscribedTo == null) {
			System.out.println(this.getName() + " has no cinema set" );
			return;
		} 
		
		String newCinema= this.subscribedTo.getUpdate();
		System.out.println(this.getName() + "received an update: " + newCinema);
		
	}

	@Override
	public void setCinema(Observable cinema) {
		this.subscribedTo = cinema; 
		
	}


	public String getName() {
		return name;
	}

}
