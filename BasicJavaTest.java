public class BasicJavaTest {
    public static void main(String[] args) {

        // cretaes new BasicJava object to access methods
        BasicJava jObject = new BasicJava();

        // tests:
        jObject.oneTwoFiveFive();
        jObject.oddOneTwoFiveFive();
        jObject.sumZeroTwoFiveFive();

        int[] x = {1,3,5,7,9,13};
        jObject.arrNums(x);

        int[] maxTest = {-3,-5,-7};
        jObject.findMax(maxTest);

        int[] avgTest = {2,10,3};
        jObject.findAvg(avgTest);
        jObject.arrOddOneTwoFiveFive();

        int[] gYTest = {1,3,5,7};
        jObject.greaterThanY(gYTest, 3);

        int[] sTest = {1,5,10,-2};
        jObject.squareVals(sTest);

        int[] nTest = {1,5,10,-2};
        jObject.noNegNums(nTest);

        int[] mmaTest = {1,5,10,-2};
        jObject.maxMinAvg(mmaTest);

        int[] vSTest = {1,5,10,-2};
        jObject.valShift(vSTest);
    }
}