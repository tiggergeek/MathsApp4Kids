package application;

public class QuestionMaster {

    public float[][] giveMeQuestions( String args ) {
    //public static float[] giveMeQuestions( int args ) {
        System.out.println("made it in to giveMeQuestions"); // Display the string.
        // read in question type rom argument
        // create 10 sets of x and y
        int myCounter = 0;
        float[][] myResult = new float[10][3];

        while (myCounter < 10){

            float x = 0, y = 0;
            float result = 0;

            // calculate answers for the 10 sets of x and y
            switch (args) {
                case "add":
                    result = 0 + (int) (Math.random() * ((100 - 0) + 1));
                    x = 0 + (int) (Math.random() * ((55 - 0) + 1));
                    while (x>result){
                        x = 0 + (int) (Math.random() * ((55 - 0) + 1));
                    }
                    y = result - x;
                    break;
                case "sub":
                    x = 0 + (int) (Math.random() * ((100 - 0) + 1));
                    y = 0 + (int) (Math.random() * ((100 - 0) + 1));
                    while (y>x){
                        y = 0 + (int) (Math.random() * ((100 - 0) + 1));
                    }
                    result = x - y;
                    break;
                case "div":
                    float tempX = 0 + (int) (Math.random() * ((12 - 0) + 1));
                    float tempY = 0 + (int) (Math.random() * ((12 - 0) + 1));
                    result = tempX * tempY;
                    x = result;
                    y = tempY;
                    result = tempX;
                    break;
                case "mul":
                    x = 0 + (int) (Math.random() * ((12 - 0) + 1));
                    y = 0 + (int) (Math.random() * ((12 - 0) + 1));
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
