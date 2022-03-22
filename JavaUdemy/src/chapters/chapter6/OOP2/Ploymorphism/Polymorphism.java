package chapters.chapter6.OOP2.Ploymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                    " : " + movie.getName() + "\n" +
                    "Plot :" + movie.plot() + "\n" );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random Number generated was "+randomNumber);
        switch (randomNumber) {
            case 1:
                return new Sankarabharanam();
            case 2:
                return new SagaraSangamam();
            case 3:
                return new SruthiLayalu();
            case 4:
                return new NoMovie();
            default:
                return null;
        }
    }
}

class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "There is not plot here as it is a parent class";
    }
}
class Sankarabharanam extends Movie {
    public Sankarabharanam() {
        super("Sankarabharanam");
    }

    public String plot() {
        return "Classical Music";
    }
}
class SagaraSangamam extends Movie{
    public SagaraSangamam(){
        super("Sagara Sangamam");
    }
    public String plot(){
        return "Classical Dance";
    }
}

class SruthiLayalu extends Movie{
    public SruthiLayalu(){
        super("SruthiLayalu");
    }

    @Override
    public String plot() {
        return "Both classical dance and Music";
    }
}

class NoMovie extends Movie{
    public NoMovie() {
        super("No Movie");
    }
    //No plot here.
}
