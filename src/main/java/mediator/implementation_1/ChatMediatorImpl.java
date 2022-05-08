package mediator.implementation_1;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(Message message, User user) {
        for (User currentUser : this.users) {
            if (currentUser != user) {
                if (currentUser.getRole() == Role.SIMPLE_USER) {
                    currentUser.receive(message.getText());
                } else if (currentUser.getRole() == Role.PREMIUM_USER){
                    currentUser.receive(message.getText() + "\n\t\t|Name:" + user.getName());
                } else if (currentUser.getRole() == Role.ADMIN){
                    currentUser.receive(message.getText() + "\n\t\t|Name:" + user.getName() + "\t|Time:" + message.getSendTime());
                } else if (currentUser.getRole() == Role.SUPER_ADMIN){
                    currentUser.receive(message.getText() + "\n\t\t|Name:" + user.getName() + "\t|Time:" + message.getSendTime() + "\t|Role:" + user.getRole());
                }
            }
        }
    }

}
