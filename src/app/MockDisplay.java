package app;

import model.Linterna;
import view.Display;

public class MockDisplay implements Display {
    private Linterna linterna;

    @Override
    public void display(Linterna linterna) {
        this.linterna = linterna;
        System.out.println(this.linterna.toString());
    }
}
