import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack commands = new Stack();
        int command;

        CommandFactory[] f = new CommandFactory[4];
        f[0] = new ExitCommandFactory();
        f[1] = new UndoCommandFactory(commands);
        f[2] = new Command1Factory(sc,commands);
        f[3] = new Command2Factory(sc,commands);

        while(true){
            System.out.println("Enter command: 0 = exit , 1 = undo , 2 = Command1 , 3 = Command2");
            command = sc.nextInt(); 
            
            Command com = f[command].createCommand();
            com.execute();
          

        }
        
        
    }
}
