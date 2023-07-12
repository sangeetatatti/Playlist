package com.playsong.pom;

import java.util.ArrayList;
import java.util.List;

import com.playsong.generic.BaseClass;

public class Playlist extends BaseClass{

    private int capacity;
    private List<String> songs;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.songs = new ArrayList<String>();
    }

    public void playSong(String song) {
        if (songs.size() == capacity) {
            songs.remove(0); // Remove the oldest song
        }
        songs.add(song);
    }

    public List<String> getPlaylist() {
        return songs;
    }
/**
 * this is a pom method for playing the songs
 * @param args
 * @return string
 * @author sangeeta
 */
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        playlist.playSong("S1");
        playlist.playSong("S2");
        playlist.playSong("S3");
        System.out.println(playlist.getPlaylist()); // Output: [S1, S2, S3]

        playlist.playSong("S4");
        System.out.println(playlist.getPlaylist()); // Output: [S2, S3, S4]

        playlist.playSong("S2");
        System.out.println(playlist.getPlaylist()); // Output: [S3, S4, S2]

        playlist.playSong("S1");
        System.out.println(playlist.getPlaylist()); // Output: [S4, S2, S1]
    }
}


