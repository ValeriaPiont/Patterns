package mediator.implementation_1;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Message {
    private final String text;
    private final LocalDateTime sendTime;

    public Message(String text) {
        this.text = text;
        this.sendTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return text;
    }

}
