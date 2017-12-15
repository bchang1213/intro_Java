public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava basics = new BasicJava();

        basics.print255();
        basics.printOdd();
        basics.printSum();

        int[] myArray = {1, 3, 5, 7, 9, 13};

        basics.iterateArray(myArray);
        basics.findMax(myArray);
        basics.getAverage(myArray);
        basics.arrayOdd();
        basics.greaterY(myArray, 5);
        basics.squareValues(myArray);

        int[] myArray2 = {1, 5, 10, -2};

        basics.elimNeg(myArray2);
        basics.maxMinAvg(myArray2);

        int[] myArray3 = {1, 5, 10, 7, -2};

        basics.shiftVals(myArray3);
    }
}