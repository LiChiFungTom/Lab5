import java.util.*;

public class UndoCommand implements Command{
    
    private Stack commands;

    public UndoCommand(Stack commands) {
        this.commands = commands;
    }

    public  void execute(){
        if(commands.size()!=0){
            Command com = (Command)commands.pop();
            com.undo();
        }else{
            System.out.println("Nothing to undo!");
        }
    }
    public  void undo(){

    }
}
