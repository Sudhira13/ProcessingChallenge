import java.util.List;

public class BallCount {
    private static float HEIGHT;
    private final int ballNumber;
    private int xCoord;
    List<Integer> speed;


    public BallCount(float HEIGHT,int ballNumber, List<Integer> speed) {
        BallCount.HEIGHT = HEIGHT;
        this.ballNumber = ballNumber;
        this.speed = speed;
    }

    public float getHEIGHT() {
        return HEIGHT*(ballNumber/5f);
    }

    public int getX() {
        xCoord = speed.get(ballNumber-1);
        return xCoord;
    }

    public void setX() {
        speed.set(ballNumber-1,xCoord+ballNumber);
    }

}
