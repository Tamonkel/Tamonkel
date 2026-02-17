package flugzeug;

public class Runway {
    public static final int DEFAULT_LENGTH = 100;
    public static final int DEFAULT_WIDTH = 50;

    private int length;
    private int width;

    // Standardkonstruktor
    public Runway() {
        this.length = DEFAULT_LENGTH;
        this.width = DEFAULT_WIDTH;
    }

    // Voll qualifizierter Konstruktor
    public Runway(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    // Kopierkonstruktor
    public Runway(Runway other) {
        this.length = other.length;
        this.width = other.width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return "Runway [length=" + length + ", width=" + width + "]";
    }
}

