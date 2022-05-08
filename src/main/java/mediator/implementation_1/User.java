package mediator.implementation_1;

import lombok.Getter;

@Getter
public abstract class User {
    private final ChatMediator mediator;
    private String name;
    private Role role;

    User(ChatMediator med, String name, Role role) {
        this.mediator = med;
        this.name = name;
        this.role = role;
    }

    public abstract void send(Message msg);

    public abstract void receive(String msg);
}
