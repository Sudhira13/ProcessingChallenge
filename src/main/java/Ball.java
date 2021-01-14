import processing.core.PApplet;


public class Ball {
    private final float yCoord;
    private int xCoord;
    private final int diameter;
    private final int ballNumber;


    public Ball(int xCoord, float yCoord, int ballNumber, int DIAMETER) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.ballNumber = ballNumber;
        this.diameter = DIAMETER;
    }

    public void move() {
        xCoord = xCoord + ballNumber;
    }

    public void drawCircle(PApplet pApplet) {
        pApplet.ellipse(xCoord, yCoord, diameter, diameter);
        move();
    }

}
