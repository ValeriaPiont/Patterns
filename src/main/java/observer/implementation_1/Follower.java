package observer.implementation_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Follower implements Observer {

    private String followerName;

    @Override
    public void update(String status) {
        System.out.println("Hey, " + followerName + "! Notification: " + status);
    }

    public void play() {
        System.out.println(followerName + " started watching a new video");
    }

}
