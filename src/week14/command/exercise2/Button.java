package week14.command.exercise2;

public class Button {
    private Action command;

    public void setCommand(Action command) {
        this.command = command;
    }

    public void onClick() {
        command.perform();
    }

}
