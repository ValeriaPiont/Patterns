package observer.implementation_1;

public class Main {

    public static void main(String[] args) {
        Channel channel = new Channel("Channel");

        Follower follower1 = new Follower("User1");
        Follower follower2 = new Follower("User2");

        channel.registerObserver(follower1);
        channel.registerObserver(follower2);

        channel.setStatus("The video was added");

        follower1.play();
        follower2.play();

        channel.removeObserver(follower1);

        channel.setStatus("One more video was added");

    }

}
