import java.util.Scanner;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    private IOConsole inputOutput;
    
    public Calculator(){
        inputOutput = new IOConsole();
    }
    
    public void start(){
        Double num1 = inputOutput.getDoubleInput("give me a number");
    }
}
