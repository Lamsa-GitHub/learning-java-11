import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Who is the first president of Cote d'Ivoire?";
        String choiceOne = "Laurent Gbagbo";
        String choiceTwo = "Alassane Ouattara";
        String choiceThree = "Felix Houphouet Boigny";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(
                "Choose the answer between 'Laurent Gbagbo', 'Alassane Ouattara' and 'Felix Houphouet Boigny' : ");

        // Have the user input an answer
        Scanner sc = new Scanner(System.in);

        // Retrieve the user's input
        String userAnswer = sc.nextLine();

        // If the user's input matches the correctAnswer...
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            // then the user is correct and we want to print out a congrats message to the
            // user.
            System.out.println("Congratulations, you got it right!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the
            // user is incorrect as well as what the correct choice was.
            System.out.println("Incorrect. The correct answer was " + correctAnswer);

        }

    }

}
