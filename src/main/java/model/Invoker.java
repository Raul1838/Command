package model;

import interfaces.Command;

public class Invoker {
    private Command command;

    public void setCoomand(Command command){
        this.command = command;
    }



    public void buttonWasPressed() {
        command.execute();
    }
}
