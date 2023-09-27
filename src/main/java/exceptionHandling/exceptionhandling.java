package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptionhandling {

//    public static void exceptionhandlingwiththrows() throws FileNotFoundException {
//        File file = new File("Pathof the file.exe");
//        FileInputStream stream = new FileInputStream(file);
//
//
//    }

    public static void Exceptionahndlingwithtrycatch()
    {
        try {
            //int i = 8 / 0;
            int [] a = new int[5];
            a[6] = 10;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        finally
        {
            System.out.println("This is the finally block");
        }

        //System.out.println("Exception Handling");
    }

    public static void main(String[] args) {
       Exceptionahndlingwithtrycatch();
    }

}
