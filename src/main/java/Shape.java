public class Shape {
    private final String DEFAULT_COLOR = "Green";
    private final boolean DEFAULT_FILLED = true;

    private String color;
    private boolean filled;

    public Shape() {
        this.color = DEFAULT_COLOR;
        this.filled = DEFAULT_FILLED;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of xxx and filled/not filled";
    }
}
