import model.*;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        BeeBot bot = new BeeBot();

        demo1(invoker, bot);
        System.out.println("");
        demo2(invoker, bot);

    }

    public static void demo1(Invoker invoker, BeeBot bot) {
        invoker.setCoomand(new MoveForward(bot));
        invoker.buttonWasPressed();
        invoker.setCoomand(new TurnLeft(bot));
        invoker.buttonWasPressed();
        invoker.setCoomand(new MoveForward(bot));
        invoker.buttonWasPressed();
        invoker.buttonWasPressed();
        invoker.setCoomand(new TurnRight(bot));
        invoker.buttonWasPressed();
    }

    public static void demo2(Invoker invoker, BeeBot bot) {
        invoker.addCommand(new MoveForward(bot));
        invoker.addCommand(new TurnLeft(bot));
        invoker.addCommand(new MoveForward(bot));
        invoker.undo();
        invoker.addCommand(new TurnRight(bot));
        invoker.addCommand(new MoveBack(bot));
        invoker.go();
    }


}
