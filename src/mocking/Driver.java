package mocking;

import application.QuestionMaster;

public class Driver {
	


public static void main( String[] args ) {
    QuestionMaster questionMaster = new QuestionMaster();
    //float[][] getMyAnswer = myQuestionMaster.giveMeQuestions("add");
    float[][] getMyAnswer = questionMaster.giveMeQuestions("sub");
    //float[][] getMyAnswer = giveMeQuestions("div");
    //float[][] getMyAnswer = giveMeQuestions("mul");

    int myCounter = 0;
    

    
    while (myCounter < 10) {
        System.out.println(getMyAnswer[myCounter][0] + ", " + getMyAnswer[myCounter][1] + ", " + getMyAnswer[myCounter][2]); // Display the string.
        myCounter = myCounter + 1; //increment counter

    }

}


}