package calculateg;

public class CalculateG {
public static double multiplication(double w, double x) {
        return w* x ;   
    }
    public static double square(double w) {
        return w*w;
    }
    public static double summation(double w, double x) {
        return w + x ;   
    }
public static void outline (String message , double result){

}
public static void main(String[] arguments){
Double gravity =9.81; // Earth's gravity in m/s^2
Double fallingTime = 30.0;
Double initialVelocity = 0.0;
Double finalVelocity;
Double initialPosition = 0.0;
Double finalPosition;

// Add the formulas for position and velocity
//𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥

finalPosition= 0.5 * gravity * fallingTime * fallingTime + initialPosition * fallingTime + initialPosition ;
//𝑣(𝑡) = 𝑎𝑡 + 𝑣
finalVelocity=gravity * fallingTime + initialVelocity ;

//output the result
System.out.println("The object's position after" + fallingTime +"seconds is" + finalPosition );
System.out.println("The object's velocity after" + fallingTime +"seconds is" + finalVelocity);

double a = 6.7;
double b = 3.6;
double c = multiplication(a, b);
System.out.println("");//empty line
 System.out.println("multiplication:"+ c);
double d = square (a);
System.out.println("power to square:"+ d);
double e = summation (a,b);
System.out.println("summation"+ e);







// Add output line for velocity (similar to position)     
    }
    
}
