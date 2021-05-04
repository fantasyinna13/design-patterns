package singleton_mediator;

public class Bot {

	private static Bot instance;
	
	private Bot() {
		
	}
	
	public static Bot getInstance() {
		if (instance == null) {
			instance = new Bot();
		}
		return instance;
	}
	
	public boolean forbiddenWord(String message) {
		if(message.contains("cat")) {
			System.out.println("FORBIDDEN WORD HAS BEEN USED!!! ");
			return true;
		} return false;
	}

}
