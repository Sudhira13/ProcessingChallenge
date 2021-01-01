import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Process extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 30;
    private int xCoord;
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
        ellipse(10,HEIGHT/5f,DIAMETER,DIAMETER);
        ellipse(10,HEIGHT*(0.4f),DIAMETER,DIAMETER);
        ellipse(10,HEIGHT*(0.6f),DIAMETER,DIAMETER);
        ellipse(10,HEIGHT*(0.8f),DIAMETER,DIAMETER);
    }

    @Override
    public void draw() {
        for (int ballCount = 1; ballCount <= 4; ballCount++) {
            float yCoord = HEIGHT * (ballCount / 5f);
            xCoord = speed.get(ballCount-1);
            drawCircle(xCoord, yCoord, ballCount);
        }
    }

    public void drawCircle(int x,float y,int num){
        ellipse(x,y,DIAMETER,DIAMETER);
        speed.set(num-1,xCoord+num);
    }
}
