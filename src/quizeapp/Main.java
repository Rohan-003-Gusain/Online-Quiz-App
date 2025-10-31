package quizeapp;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static int score = 0;
    private static Quiz quiz = new Quiz();
    private static List<Question> questions = quiz.getQuestions();
    private static Scanner sc = new Scanner(System.in);

    // Countdown 
    private static void countDown() {
        for (int i = 5; i >= 0; i--) {
            System.out.print("\rStarting quiz in "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }

    // Quize logic 
    private static void runQuiz() {
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            while (true) {
                System.out.println("Q" + (i + 1) + ". " + q.getQuestion());
                String[] options = q.getOptions();

                char optionChar = 'A';
                for (String opt : options) {
                    System.out.println(optionChar + ". " + opt);
                    optionChar++;
                }

                System.out.println("Your answer: ");
                char userInput = sc.next().toUpperCase().charAt(0);

                if (userInput < 'A' || userInput > 'D') {
                    System.out.println("Invalid input! Please enter A, B, C, or D only.\n");
                    continue;
                }

                if (userInput == q.getCorrectAnswer()) {
                    System.out.println("Correct!");
                    System.out.println();
                    score++;
                } else {
                    System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer() + ". " + q.getOptions()[q.getCorrectAnswer() - 'A'] + "\n");
                }
                break;
            }
        }
    }

    // Show result
    private static void showResults(String name) {
        System.out.println("Quiz Finished!");
        System.out.println("Player: " + name);
        System.out.println("Your final score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("Ecxellent! Perfect Score.");
        } else if (score >= questions.size() / 2){
            System.out.println("Good Job! You Passed.");
        } else {
            System.out.println("Keep Practicing! Better Luck next time!");
        }

        System.out.println("<------------------------------>");
    }
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     Welcome To Online Quiz App     ");
        System.out.println("====================================");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Welcome, " + name + " Let's start the Quiz!\n");

        System.out.println("<--- INSTRUCTIONS: --->");
        System.out.println("1. Each questions have 4 options.");
        System.out.println("2. Type the correct option excatly shown as (A/B/C/D).");
        System.out.println("3. Each correct answer gives you 1 point.");
        System.out.println("4. No negative marking.");
        System.out.println("Press Enter to start...");
        sc.nextLine();
        
        countDown();

        runQuiz();
        showResults(name);

        sc.close();
    
    }
}
