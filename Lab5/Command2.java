import java.util.Scanner;

public class Command2 implements Command {
    private int id;
    private Scanner sc;

    public Command2(Scanner sc){
        this.sc = sc;
    }

    public void execute(){
        System.out.println("Input ID for Command2: ");
        id = sc.nextInt();
        System.out.println(id + "Command1: execute()");
    };

    @Override
    public void undo(){
        System.out.println(id+"Command2: undo()");
    };
}
