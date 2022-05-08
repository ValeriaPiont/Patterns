package mediator.implementation_1;

public interface ChatMediator {

    void sendMessage(Message msg, User user);

    void addUser(User user);
}