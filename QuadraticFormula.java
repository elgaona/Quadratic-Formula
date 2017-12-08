/**
 * Main class of the Java program.
 */
 
 import java.util.Scanner;
 import static java.lang.Math.sqrt;
 import java.lang.*;

public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double x = 0; // Positive Solution
        double y = 0; // Negative Solution
        String p = ""; // Will keep track of imaginary numbers
        double i = 0;
        double j = 0;
        double k = 0;
        double l = 0;
        double m = 0;
        
        System.out.println("Welcome to the Quadratic Function Calculator!");
        
        System.out.print("Enter A value = ");
        Scanner first = new Scanner(System.in); //Takes in user input for a
        a = first.nextInt();
        
        System.out.print("Enter B value = ");
        Scanner second = new Scanner(System.in); //Takes in user input for b
        b = second.nextInt();
        
        System.out.print("Enter C value = ");
        Scanner third = new Scanner(System.in); //Takes in user input for c
        c = third.nextInt();
        third.close();
        
        b = -1 * b; //Multiply b with -1
        double f = b; //Save the result of the line above for future use.
        b = b*b; //We need to square b for the quadratic formula.
        
        double g = 4*a*c; //Part of the quadratic formula.
        
        double h = b - g; //Subtract b^2 with 4*a*c
        
        if (h < 0 ) {
            h = Math.abs(h);
            p = "i";
            
            i = Math.sqrt(h); //double because you will get a decimal sometimes, square root
                    
            j = f - i; //Subtract -b with the result of the square root.
        
            k = j/(2*a); //Final step divide j by 2*a.
        
            // Now we are going to add -b by the square root.
        
            l = f + i; //add -b aka f with the result of the square root
            double z = f/(2*a);
            double z2 = i/(2*a);
        
        
            m = l/(2*a); //Final result of addition portion.
            
            
            
            System.out.println("-b = " +f); //-b
            System.out.println("-4*a*c = " +g); //4*a*c
            System.out.println("Subtract b^2 with -4*a*c = "+ h); //Subtraction between b^2 and 4*a*c
            System.out.println("Square root the result from the number above = " +i); // Square root of the result of h
            System.out.println(""); //Create a space
            System.out.println("Subtraction");
            System.out.println("Subtract -b with the square root =" + j); //Subtract "-b" with the result of j
            System.out.println("Imaginary answer from subtraction = " + z+" - "+z2+p); //Answer of subtraction
            System.out.println(""); //Create a Space
            System.out.println("Addition");
            System.out.println("Add -b with the result of square root = " +l); //Add "-b" with the result of l
            System.out.println("Imaginary answer from additon =" + z+" + "+z2+p); //Answer of Addition
        }
        else {
            i = Math.sqrt(h); //double because you will get a decimal sometimes, square root
                    
            j = f - i; //Subtract -b with the result of the square root.
        
            k = j/(2*a); //Final step divide j by 2*a.
        
            // Now we are going to add -b by the square root.
        
            l = f + i; //add -b aka f with the result of g
        
        
            m = l/(2*a); //Final result of addition portion.
            
            System.out.println("-b = " +f); //-b
            System.out.println("-4*a*c = " +g); //4*a*c
            System.out.println("Subtract b^2 with -4*a*c = "+ h); //Subtraction between b^2 and 4*a*c
            System.out.println("Square root the result from the number above = " +i); // Square root of the result of h
            System.out.println(""); //Create a space
            System.out.println("Subtraction");
            System.out.println("Subtract -b with the square root =" + j); //Subtract "-b" with the result of j
            System.out.println("Answer from subtraction = " +k+p); //Answer of subtraction
            System.out.println(""); //Create a Space
            System.out.println("Addition");
            System.out.println("Add -b with the result of -4*a*c = " +l); //Add "-b" with the result of l
            System.out.println("Answer from additon =" +m+p); //Answer of Addition
        }
        
        
    }
}
