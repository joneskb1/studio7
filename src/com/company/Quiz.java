package com.company;
import java.util.Scanner;

import java.util.ArrayList;


public class Quiz {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Question> myQuiz = new ArrayList<>();


    public static void main(String[] args) {
        Question multiQuestion = new Multi("My favorite color is?", "pink", "blue", "purple", "red", "blue");
        Question checkQuestion = new Check("Where have I lived?", "Texas", "Tennessee", "Arkansas", "Florida", "Tennessee Arkansas");
        Question trueFalse = new TrueFalse("I'm 27 years old?",  "true");
        myQuiz.add(multiQuestion);
        myQuiz.add(checkQuestion);
        myQuiz.add(trueFalse);

        startQuiz();

    }


    public static void startQuiz() {
        System.out.println("Time to start the quiz!");
        int score = 0;

            for(int i=0; i<myQuiz.size(); i++) {
                System.out.println(myQuiz.get(i).getQuestion());
                System.out.println(myQuiz.get(i).getAnswers());
                System.out.println("please type your answer");
                String answer = scanner.nextLine();
                if (myQuiz.get(i).getCorrectAnswer1().toLowerCase().equals(answer.toLowerCase())) {
                    System.out.println("CORRECT!");
                    score ++ ;
                } else {
                    System.out.println("Wrong!");
                }
            }
//
        System.out.println("you score was " + score);

    }






}
