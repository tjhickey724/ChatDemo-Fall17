package demo;

import lib.NumArray;
import lib.TextIO;
/**
This provides a few tests of the methods in the lib.NumArray class
*/
public class NumArrayTest {
    public static void main(String[] args){
        int[] vals1 = {2,7,1828,1828,45,90,45};
        double[] vals2 = {1.0,  2.7,  3.141592, 2.017 };
        TextIO.putf("%n%nThe integer array vals1 is ");
        NumArray.printArray(vals1);

        TextIO.putf("%n%nThe double array vals2 is ");
        NumArray.printArray(vals2);

        int maxV1 = NumArray.max(vals1);
        double maxV = NumArray.max(vals2);
        TextIO.putf("%n%nThe biggest value in vals1 is %d%n",maxV1);
        TextIO.putf("The biggest value in vals2 is %f%n",maxV);

        TextIO.putf("%nEnd of the Demo%n");
    }
}
