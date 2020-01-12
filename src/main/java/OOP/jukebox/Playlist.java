package OOP.jukebox;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Модель описывающая набор песен
 *
 * */
public class Playlist {
    private String name;
    private HashMap<String, Song> songs = new HashMap<>();

    public Playlist(String name, HashMap<String, Song> songs) {
        this.name = name;
        this.songs = new HashMap(songs);
    }

    public void putSongToPlay(Song song) {
        songs.put(song.getName(), song);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Song> getSongs() {
        return new HashMap<>(songs);
    }
}
