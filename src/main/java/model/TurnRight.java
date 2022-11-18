package model;

import interfaces.Command;

public class TurnRight implements Command {
    BeeBot bot;

    public TurnRight(BeeBot bot){
        this.bot = bot;
    }
    @Override
    public void execute() {
        System.out.println("Turning right");
    }
}
