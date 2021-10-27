import java.util.*;

public class Command2Factory implements CommandFactory{

    private Scanner sc;
    private Stack commands;

    public Command2Factory(Scanner sc, Stack commands){
        this.sc = sc;
        this.commands = commands;
    }

    public Command createCommand(){
        return new Command2(sc);
    }
}
