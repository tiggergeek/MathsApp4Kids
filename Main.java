package com.company;
import javax.swing.*;



public class Main {
    public static void main( String[] args ) {
        //float[][] getMyAnswer = giveMeQuestions("add");
        float[][] getMyAnswer = giveMeQuestions("sub");
        //float[][] getMyAnswer = giveMeQuestions("div");
        //float[][] getMyAnswer = giveMeQuestions("mul");

        int myCounter = 0;
        while (myCounter < 10) {
            System.out.println(getMyAnswer[myCounter][0] + ", " + getMyAnswer[myCounter][1] + ", " + getMyAnswer[myCounter][2]); // Display the string.
            myCounter = myCounter + 1; //increment counter

        }

    }

    public static float[][] giveMeQuestions( String args ) {
    //public static float[] giveMeQuestions( int args ) {
        System.out.println("made it in to giveMeQuestions"); // Display the string.
        // read in question type rom argument
        // create 10 sets of x and y
        int myCounter = 0;
        float[][] myResult = new float[10][3];

        while (myCounter < 10){

            int x, y;
            float result = 0;
            x = 0 + (int) (Math.random() * ((10 - 0) + 1));
            y = 0 + (int) (Math.random() * ((10 - 0) + 1));

            // calculate answers for the 10 sets of x and y
            switch (args) {
                case "add":
                    result = x + y;
                    break;
                case "sub":
                    result = x - y;
                    break;
                case "div":
                    result = x / y;
                    break;
                case "mul":
                    result = x * y;
                    break;
                default: // tell them they where daft and gave us a bad input not the children
            }
            //System.out.println(" x, y, result"+x+", "+y+", "+result); // Display the string.
            myResult[myCounter][0] = x;
            myResult[myCounter][1] = y;
            myResult[myCounter][2] = result;

            myCounter = myCounter + 1; //increment counter

        }

        //float[] myResult = {x, y, result};
        return myResult;
    }


}
