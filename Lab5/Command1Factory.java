import java.util.Scanner;
import java.util.Stack;

public class Command1Factory implements CommandFactory {
    private Scanner sc;
    private Stack commands;
    
    public Command1Factory(Scanner sc , Stack commands){
        this.sc =sc;
        this.commands = commands;
    }

    public Command createCommand(){
        Command com = new Command1(sc);
        commands.push(com);
        return com;
    }
}
