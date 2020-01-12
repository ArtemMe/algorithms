package OOP.jukebox;

import java.util.HashMap;
import java.util.List;

/**
* Требуестя создать модель музыкального автомата испозуя принципы ООП.
 *
 * 1. Уточнить какой будет музыкальнй проиграыватель. Что будет проиграывать CD, кассеты онлайн.
 * 2. Уточнить он будет платный? Должен ли сдачу выдавать.
 * 3. Уточнить будет ли он реальный или это проагрмма.
 *
 * Решение:
 * Предполагаем что это программный проигрыватель. Проигрвыает cd диски.
 *
 * Выделим компоненты:
 * 1. Jukebox
 * 2. CD
 * 3. CDPlayer
 * 4. Playlist
 * 5. Song
 * 6. Display
 *
 * Выделим функционал:
 * 1. Проигрывать CD
 * 2. Создать плейлист
 * 3. Переключать треки
 * 4. Показывать текущей трек
 * 5. Загрузить CD
* */

public class Jukebox {
    private HashMap<String, Song> songs = new HashMap<>();
    private HashMap<String, Playlist> playlists = new HashMap<>();
    private Player player;

    public Jukebox(HashMap<String, Song> songs, HashMap<String, Playlist> playlists, Player player) {
        this.songs = songs;
        this.playlists = playlists;
        this.player = player;
    }

    public Playlist createPlaylist(List<Song> songs) { return null; }

    public void addSongToPlaylist(Song song) {}

    public void display() { }

    public void nextSong() {}

    /**
     * Играет конкретную песню
     * */
    public void playSong(String name) {
        if(!songs.containsKey(name)) throw new IllegalArgumentException("Current song does not exist in list");
        player.playSong(songs.get(name));
    }
    /**
     * Проигрывает плейлист
     * */
    public void playPlaylist(String name) {
        if(!playlists.containsKey(name)) throw new IllegalArgumentException("Current playlist does not exist in list");
        player.playListSong(playlists.get(name));
    }
}
