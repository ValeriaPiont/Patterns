package mediator.implementation_1;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "User1", Role.SIMPLE_USER);
        User user2 = new UserImpl(mediator, "User2", Role.SIMPLE_USER);
        User user3 = new UserImpl(mediator, "User3", Role.ADMIN);
        User user4 = new UserImpl(mediator, "User4", Role.SUPER_ADMIN);
        User user5 = new UserImpl(mediator, "User5", Role.PREMIUM_USER);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send(new Message(";)"));

    }

}
