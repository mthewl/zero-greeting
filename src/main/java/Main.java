import zero.App;
import zero.ui.Label;
import zero.ui.TextField;
import zero.ui.Button;
import zero.ui.Column;

public class Main extends App {
    @Override public void settings() { 
        title("Greeting");
        size(300, 300);
        padding(30); 
    }

    public void setup() {
        Label greeting = new Label("Hello, Java");

        TextField name = new TextField();
        name.setPromptText("Your name");

        Button button = new Button("Say hello");

        button.onClick(() -> 
                greeting.setText("Goodbye, " + name.getText() + "?"));
        show(new Column(20, greeting, name, button));
    }
    public static void main(String[] args) { launch(args); }
}
