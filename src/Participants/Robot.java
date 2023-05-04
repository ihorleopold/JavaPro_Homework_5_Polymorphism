package Participants;

public class Robot implements Participant {
    @Override
    public String run() {
        System.out.println("Dog is running on the treadmill");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("Dog is jumping over the wall");
        return null;
    }

}
