package processing;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Process extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 30;
    public static final int TOTAL_BALLS = 4;
    public List<Ball> balls = new ArrayList<>();

    int xPosition = 0;

    public static void main(String[] args) {
       PApplet.main("processing.Process",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int ballNumber = 1; ballNumber <= TOTAL_BALLS; ballNumber++) {
            Ball ball = new Ball(xPosition, ((ballNumber * HEIGHT) / 5f), ballNumber, DIAMETER);
            balls.add(ball);
        }
    }

    @Override
    public void draw() {
       balls.forEach(ball -> {ball.drawCircle(this);});
    }
}
