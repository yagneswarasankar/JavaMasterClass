package chapters.chapter6.OOP1;

public class Car {
    private String color;
    private String model;
    private int doors;
    private int wheels;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("wagonr") || validModel.equals("brezza")) {
            this.model = model;
        } else {
            System.out.println("Invalid Model");
        }
    }

    public void getModel(){
            System.out.println("Model "+ this.model);
        }

    }


