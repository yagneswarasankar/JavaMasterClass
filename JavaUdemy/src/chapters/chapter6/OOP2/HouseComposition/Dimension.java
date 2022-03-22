package chapters.chapter6.OOP2.HouseComposition;

public class Dimension {
    private int width;
    private int length;
    private int height;

    public Dimension(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
