package singleton_mediator;

public class ChatUser extends User {

	Bot connection = Bot.getInstance();
	
	private boolean createdBot = false;
	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		if(message == "addBot") {
			System.out.println(this.name + "sends: " + message);
			System.out.println("BOT HAS BEEN ADDED!");
			createdBot = true;
			
		}
		
		
		if(createdBot && connection.forbiddenWord(message)) {
			System.out.println(name + " has been removed from the chat! Forbidden word has been used!");
			mediator.deleteUser(this);
			this.removed();
			return;
		}
		
		System.out.println(this.name + " sends: " + message);
		mediator.sendMessage(message, this);

	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);

	}

	@Override
	public void removed() {
		this.mediator = null;

	}

}
