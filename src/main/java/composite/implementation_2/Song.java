package composite.implementation_2;

public class Song implements Component {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void setPlaybackSpeed(float fasterSpeed) {
        this.speed = fasterSpeed;
    }

    @Override
    public void play() {
        System.out.println(songName + " is playing");
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }

}