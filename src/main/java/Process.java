import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Process extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 30;
    List <Integer> speed = new ArrayList<>(Arrays.asList(0,0,0,0));

    public static void main(String[] args) {
       PApplet.main("Process",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for (int ballNumber = 1; ballNumber <= 4; ballNumber++) {
            BallCount ballCount = new BallCount(HEIGHT,ballNumber,speed);
            float yCoord = ballCount.getHEIGHT();
            int xCoord = ballCount.getX();
            drawCircle(xCoord,yCoord,ballCount);
        }
    }

    public void drawCircle(int x,float y,BallCount ballCount){
        ellipse(x,y,DIAMETER,DIAMETER);
        ballCount.setX();
    }
}
