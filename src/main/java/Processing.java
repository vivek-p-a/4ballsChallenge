import processing.core.PApplet;

public class Processing extends PApplet {
    int shiftPosition = 0;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int XCOORDINATE = 15;
    public static final int RADIUSONE = 30;
    public static final int RADIUSTWO = 30;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void draw() {
        ellipse(XCOORDINATE + shiftPosition, HEIGHT/5, RADIUSONE, RADIUSTWO);
        ellipse(XCOORDINATE + 2 * shiftPosition, 2* HEIGHT/5, RADIUSONE, RADIUSTWO);
        ellipse(XCOORDINATE + 3 * shiftPosition, 3 * HEIGHT/5, RADIUSONE, RADIUSTWO);
        ellipse(XCOORDINATE + 4 * shiftPosition, 4 * HEIGHT/5, RADIUSONE, RADIUSTWO);
        shiftPosition++;
    }
}
