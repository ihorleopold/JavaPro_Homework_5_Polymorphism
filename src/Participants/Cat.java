package Participants;

public class Cat implements Participant {

    @Override
    public String run() {
        System.out.println("Cat is running on the treadmill");
        return null;
    }

    @Override
    public String jump() {
        System.out.println("Cat is jumping over the wall");
        return null;
    }

}
