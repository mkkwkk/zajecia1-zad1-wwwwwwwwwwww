package pl.edu.wszib.app;

public class ShakeTruskawkowy extends Shake implements Smak {


    @Override
    public void pij() {
        System.out.printf("pije ");
    }

    @Override
    public void smak() {
        System.out.printf("smak treuskawkowy");

    }
}
