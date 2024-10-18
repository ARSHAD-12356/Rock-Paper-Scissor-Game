// import java.util.Random;
// import java.util.Scanner;

// public class rock_paper_scissor {

//     public static void main(String[] args) {
//         // ! 0 for rock
//         // ! 1 for paper
//         // ! 2 for Scissor
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 0 for rock, 1 for paper and 2 for Scissor");
//         // * taking input form the user
//         int user = sc.nextInt();
//         // * generated random number
//         Random r = new Random();
//         int compter = r.nextInt(3);

//         // * game logic
//         if (user==compter) {
//             System.out.println("Draw!!");
//         }
//         else if (user==0 && compter==2 || user==1 && compter==0 || user==2 && compter==1) {
//             System.out.println("Congratulations!!, You won this game");
//         }
//         else{
//             System.out.println("Sorry!!, Computer won the match");
//             System.out.println("Try again");
//         }
//         sc.close();
//         //* computer output */
//         if (compter==0) {
//             System.out.println("Computer choose Rock");
//         }
//         else if (compter==1) {
//             System.out.println("Computer choose Paper");
//         }
//         else if (compter==2) {
//             System.out.println("Computer choose Scissor");
//         }
//     }
// }

// ! Practice

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {

    public static void main(String[] args) {
        /*
         * 0 for Rock
         * 1 for Paper
         * 2 for Scissor
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper and 2 for Scissor");
        int user = sc.nextInt();
        Random r = new Random();
        int computer = r.nextInt(3);

        // ! game logic
        if (user==computer) {
            System.out.println("Draw!! , Try Again..");
        }
        else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1) {
            System.out.println("Congratulations!!, You won this game");
        }
        else{
            System.out.println("Oh No.., Computer won this game");
        }
        sc.close();
        // * Computer Output
        if (computer==0) {
            System.out.println("Computer choose Rock");
        }
        else if (computer==1) {
            System.out.println("Computer choose Paper");
        }
        else if (computer==2) {
            System.out.println("Computer choose Scissor");
        }
    }
}