package Week1;

public class ArrayPlusArray {


    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int sum = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i] + arr2[i];
            }

        } else {
            System.out.println("arrays are of unequal length");
        }


        return sum;
    }

    //Another way -
    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sumArray1 += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sumArray2 += arr2[j];
        }

        return sumArray1 + sumArray2;

    }

}
