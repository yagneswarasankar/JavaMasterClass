package chapters.chapter7.LinkedLists.PlayLists;

import chapters.chapter7.LinkedLists.LinkedLists.LinkedListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PlayList{

    private String name;
    private LinkedList<Song> songs;


    public PlayList(String name) {
        this.name = name;
        songs = new LinkedList<Song>();


    }

    public String getName() {
        return name;
    }


   /* public boolean addSongToPlayList(String albumName, String trackName) {
        System.out.println("The album size is : "+ albums.size());
        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            if (album.findSongInAnAlbum(album.getName(), trackName)) {
                this.playList.add(album.getSongs().get(i));
                System.out.println("The song added successfully "+ album.getSongs().get(i));
                return true;
            }

        }
        return false;
    }

    public void printSongs(){
        Iterator<Song> iterator = this.songs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle() +" "+ iterator.next().getDuration());
        }
    }*/




}












