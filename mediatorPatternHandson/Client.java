package mediatorPatternHandson;

public class Client {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();

		IUser a = new BasicUser(chatMediator, "john");
		IUser b = new PremiumUser(chatMediator, "rambo");

		chatMediator.addUser(a);
		chatMediator.addUser(b);
		chatMediator.addUser(new BasicUser(chatMediator, "teja"));
		chatMediator.addUser(new PremiumUser(chatMediator, "pumi"));

		a.SendMessage("Hello");
	}

}