package app;

import control.Command;
import control.SwitchStatus;
import model.Linterna;
import view.Display;

public class Main {
    private Display display;
    private Command command;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
    }

    public void execute(){
        this.display = new MockDisplay();
        Linterna linterna = new Linterna(true);
        this.command = new SwitchStatus(linterna);
        this.display.display(linterna);

        this.command.execute();
        this.display.display(linterna);
    }
}
