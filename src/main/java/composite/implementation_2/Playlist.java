package composite.implementation_2;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Component {

    private String playlistName;
    private List<Component> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        playlist = new ArrayList<>();
    }

    public void add(Component component) {
        playlist.add(component);
    }

    public void remove(Component component) {
        playlist.remove(component);
    }

    public void setPlaybackSpeed(float slowSpeed) {
        playlist.forEach(song -> song.setPlaybackSpeed(slowSpeed));
    }

    @Override
    public void play() {
        System.out.println("Playlist " + playlistName + " was chosen");
        playlist.forEach(Component::play);
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

}

