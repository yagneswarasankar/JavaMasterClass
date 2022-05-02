package chapters.chapter9.Interfaces.PlayLists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }


    public boolean addSong(String title,double duration){
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The title "+title +" not in the album");
        return false;

    }



    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber - 1;
        if ((index >= 0 && (index < this.songs.size()))){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a song: "+ index);
         return false;
    }

}
