package chapters.chapter12.Collections.Theatre;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Geeta",8,12);
        //theatre.getSeats();
        if(theatre.reseverSeat("H11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, Seat is taken");
        }
        if(theatre.reseverSeat("H11")){
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, Seat is taken");
        }
    }
}
