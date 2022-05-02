package chapters.chapter9.Interfaces.PlayLists;

import java.util.*;

public class Main {

    private String Name;
    static List<Album> albums  = new ArrayList<Album>();

    public static void main(String[] args) {
     Album album = new Album("RRR","Keeravani");
     album.addSong("Komaram",4.32);
     album.addSong("Natu",4.25);
     album.addSong("bla bla bla",5.32);
     albums.add(album);

     album = new Album("Thyagayya","Mahadevan");
     album.addSong("Aragimpare",4.00);
     album.addSong("Mundu Venuka iruPakkala",5.23);
     album.addSong("Bantureethi",4.3);
     album.addSong("Sangeetha Gnanamu",5.4);
     albums.add(album);

     List<Song> playList = new ArrayList<Song>();
     albums.get(0).addToPlayList("Komaram",playList);
     albums.get(0).addToPlayList("Natu",playList);
     albums.get(0).addToPlayList("Kodi",playList);

     albums.get(1).addToPlayList(1,playList);
     albums.get(1).addToPlayList(2,playList);
     albums.get(1).addToPlayList(5,playList);

     play(playList);
    }

    private static void play(List<Song> playList){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No Songs in the play list");
            return;
        }else{
            System.out.println("Now playing: "+ listIterator.next().toString() );
            printMenu();
        }

        System.out.println("Enter the choice");
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    System.out.println("We have reached the end of the file");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing :"+listIterator.next().toString());

                    }else{
                        System.out.println("We have reached the end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = true;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing : "+ listIterator.previous().toString());

                    }else{
                        System.out.println("We are at the begining of the playList ");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Re-Playing "+listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the begining the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now Re-Playing "+listIterator.next().toString());
                            forward = true;

                        }else{
                            System.out.println("We have reached to the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next().toString());

                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous().toString());
                        }
                    }else{
                        System.out.println("There are no songs to play: ");
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Availabe actions:\npress"+
                  "0- Quit\n" +
                  "1- MoveForward\n"+
                  "2- MoveBackward\n" +
                  "3- Replay the current song\n" +
                  "4- Print List\n"+
                  "5- Print Menu\n" +
                  "6- Remove the current Song");
    }

    private static void printList(List<Song> songs){
        for(Song song: songs){
            System.out.println(song.toString());
        }
    }


}
