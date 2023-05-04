package Participants;

public class Human implements Participant {


    public void overcome(Obstacle obstacleType) {

        Obstacle Treadmill = new Treadmill();
        Obstacle Wall = new Wall();
        if (obstacleType == Treadmill) {
            System.out.println(run());
        } else if (obstacleType == Wall) {
            System.out.println(jump());

        }
    }

    @Override
    public String run() {
        System.out.println("Human is running on treadmill");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("Human is jumping over the wall");
        return null;
    }

}
