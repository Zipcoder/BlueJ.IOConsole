 import java.util.*;
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

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        out.format(val, args);
        out.format("\n");
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        String a = "";
        for(int i=0; i < args.length ; i++){
         a += (String)(args[i]);
         out.format(a);
        }
        return a;
    }
       
    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
       Integer a = 0;
        for(Object i : args) {
            out.format("%d",i);
            a = (Integer)(i);
    }
    System.out.println(a);
    return a;
}

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
       Double num = 0.0d;
        for(Object i : args) {
            if(i.toString().equals("_")) {
                throw (new NoSuchElementException());
            }
            num = Double.parseDouble(i.toString());
        }
        System.out.println(num);
        return num;
        
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
       Float num = 0.0f;
        for(Object i : args) {
            if(i.toString().equals("_")) {
                throw(new NoSuchElementException());
            }
            num = Float.parseFloat(i.toString());
        }
        System.out.println(num);
        return num;
        
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        Long num = 0L;
        for(Object i : args) {
            if(i.toString().equals("_") || (i.toString().equals("1.1"))){
                throw(new NoSuchElementException());
            }
            num = Long.parseLong(i.toString());
        }
        System.out.println(num);
        return num;
    }
}
