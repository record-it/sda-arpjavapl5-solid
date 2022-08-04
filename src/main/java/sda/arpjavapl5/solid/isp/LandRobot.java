package sda.arpjavapl5.solid.isp;
//Klasa implementuje tylko jedną metodę interfejsu
//Klasa narusza ISP
public class LandRobot implements Amphibian{
    @Override
    public void swim() {

    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
