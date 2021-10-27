import java.util.Stack;

public class UndoCommandFactory implements CommandFactory{
    
    private Stack commands;

    public UndoCommandFactory(Stack commands){
        this.commands = commands;
    }

    public Command createCommand(){
        return new UndoCommand(commands);
    }
}
