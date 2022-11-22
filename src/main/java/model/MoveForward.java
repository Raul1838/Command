package model;

import interfaces.Command;

public class MoveForward implements Command {
    BeeBot bot;

    public MoveForward(BeeBot bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        bot.moveForward();
    }
}
