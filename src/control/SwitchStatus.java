package control;

import model.Linterna;
import view.Display;

public class SwitchStatus implements Command {
    private Linterna linterna;

    public SwitchStatus(Linterna linterna){
        this.linterna = linterna;
    }

    @Override
    public void execute() {
        if (linterna.getStatus()) linterna.turnOff();
        else linterna.turnOn();
    }
}
