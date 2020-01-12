package OOP.jukebox;

/**
 * Описывает компакт диск с набором песен
 * */

public class CD {
    private Playlist songs;
    private String name;

    public Playlist getSongs() {
        return songs;
    }

    public void setSongs(Playlist songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
