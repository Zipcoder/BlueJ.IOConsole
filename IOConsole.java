 /**
 * @author leon on 03/02/2019.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;
    
    private int number;

    public IOConsole() {
        this(System.in, System.out);
    }
 
    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }
    
    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
    }
    // val- msg you want to display to the user
    // args- the format (how it is diplayed. can be ignore for calculator project
    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        out.format(val, args);
        out.format("\n");
        
        //System.out.print(val);
        //System.out.print("\n");
    }
   

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        out.println(prompt);
        return scanner.next();
    }
    //prompt -" enter a number"
    //return is what the the user want to put in
    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        out.println(prompt);
        Integer result = scanner.nextInt();
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        out.println(prompt);
        Double result = scanner.nextDouble();
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
        out.println(prompt);
        Float result = scanner.nextFloat();
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        out.println(prompt);
        Long result = scanner.nextLong();
        return result;
    }
}
