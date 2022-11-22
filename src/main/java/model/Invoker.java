package model;

import interfaces.Command;

import java.util.Deque;
import java.util.LinkedList;

public class Invoker {
    private Command command;
    private Deque<Command> cola;

    public Invoker() {
        cola = new LinkedList<>();
    }

    public void addCommand(Command command) {
        cola.addLast(command);
    }

    public void undo() {
        cola.removeLast();
    }

    public void go() {
        for (Command com : cola) {
            com.execute();
        }
    }

    public void setCoomand(Command command) {
        this.command = command;
    }


    public void buttonWasPressed() {
        command.execute();
    }


}
