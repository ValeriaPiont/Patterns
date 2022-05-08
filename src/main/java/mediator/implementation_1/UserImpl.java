package mediator.implementation_1;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name, Role role) {
        super(mediator, name, role);
    }

    @Override
    public void send(Message msg) {
        System.out.println(this.getName() + ". Sending Message:" + msg);
        this.getMediator().sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + ". Received information: " + msg + "");
    }

}
