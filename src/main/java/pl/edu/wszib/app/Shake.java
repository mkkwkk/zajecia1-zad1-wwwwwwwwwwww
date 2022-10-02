package pl.edu.wszib.app;
import pl.edu.wszib.app.Pijalne;
import pl.edu.wszib.app.Jadalne;

public abstract class Shake implements Jadalne, Pijalne{

    @Override
    public void jedz() {
        System.out.printf("jedz");
        pij();
    }

}
