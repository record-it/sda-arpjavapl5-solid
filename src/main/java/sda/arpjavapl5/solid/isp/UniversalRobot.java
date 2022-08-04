package sda.arpjavapl5.solid.isp;

public class UniversalRobot implements Amphibian{

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
