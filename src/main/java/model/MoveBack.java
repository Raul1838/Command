package model;

import interfaces.Command;

public class MoveBack implements Command {
    BeeBot bot;

    public MoveBack(BeeBot bot){
        this.bot = bot;
    }

    @Override
    public void execute() {
        System.out.println("Moving backwards");
    }
}
