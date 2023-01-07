package week14.command.exercise2;

public class Editor {
    public String text = "";

    public String getSelection() {
        return text;
    }

    public void deleteSelection() {
        text = "";
    }

    public void replaceSelection(String text) {
        this.text = text;
    }

}
