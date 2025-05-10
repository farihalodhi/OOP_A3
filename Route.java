import java.io.Serializable;

public class Route implements Serializable {
    protected String start,end;
    protected int distance;
    protected int thresholdDistance;

    public Route(String start, String end,int thresholdDistance, int distance) {
        this.start = start;
        this.end = end;
        this.thresholdDistance = thresholdDistance;
        this.distance = distance;
    }
    public void distanceCovered(int distance, int thresholdDistance) {
        if (distance >= thresholdDistance) {
            System.out.println("Distance covered is more than threshold distance");
        } else {
            System.out.println("Distance covered is within threshold distance");
        }
    }
    public String getRoute(){
        return start + "," + end + "," + distance;
    }

}
