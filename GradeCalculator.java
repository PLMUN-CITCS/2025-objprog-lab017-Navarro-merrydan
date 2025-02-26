import java.util.Scanner;

public class GradeCalculator {

    public static void main (String args []){

        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanInput.nextInt();

        if (score >= 90){
            System.out.println("A");
        } else if (score>=80){
            System.out.println("B");
        }


        //case switch for grading, a ,b ,c ,d ,e ,f 

        System.out.println("Your Grade is: " + score);
    }
}