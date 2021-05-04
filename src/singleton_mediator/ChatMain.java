package singleton_mediator;

public class ChatMain {

	public static void main(String[] args) {


		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Maria");
		User user2 = new ChatUser(chat, "Ivan");
		User user3 = new ChatUser(chat, "Mitko");
		
		user2.send("Hi, guys!");
		user2.send("addBot");
		user1.send("Let's talk about my cat");
		user3.send("No! C-A-T is a forbidden word here! We only talk about dogs! ");
		user2.send("She will be removed from the chatroom!");

	}

}
