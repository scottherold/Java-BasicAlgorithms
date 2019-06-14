// Import 'Arrays' to log Arrays to the console
import java.util.Arrays;

public class BasicJava {    
    // Prints all numbers from 1 to 255
    public boolean oneTwoFiveFive() {
        int i = 1;
        while (i <= 255) {
            System.out.println(i);
            i++;
        }
        return false;
    }

    // Prints all odd numbers from 1 to 255
    public boolean oddOneTwoFiveFive() {
        int i = 1;
        while(i <= 255) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        return false;
    }

    // Sums numbers from 1 to 255
    public boolean sumZeroTwoFiveFive() {
        int i = 0;
        int sum = 0;
        while(i <= 255) {
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
            i++;
        }
        return false;
    }

    // Iterates through an array and prints values
    public boolean arrNums(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return false;
    }

    // Iterates through an array and finds the maximum value
    public boolean findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return false;
    }

    // Iterates through an array and calculates the average number
    public boolean findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
        return false;
    }

    // Creates an array with all the odd numbers between 1 and 255
    public int[] arrOddOneTwoFiveFive() {
        int[] y;
        y = new int[(255/2)+1];
        int i = 1;
        int j = 0;
        while (i <= 255) {
            if (i % 2 != 0) {
                y[j] = i;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(y));
        return y;
    }

    // Takes an array and an integer, then returns the number of values in the array that are greater than the integer
    public int greaterThanY(int[] arr, int y) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                total++;
            }
        }
        System.out.println(total);
        return total;
    }

    // Takes an array, squares the values and returns the array
    public int[] squareVals(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
        return x;
    }

    // Takes an array and sets an negative number to equal 0
    public int[] noNegNums(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
        return x;
    }

    // Takes an array and returns an new array with the minumum, maximum and average numbers of the given array
    public int[] maxMinAvg(int[] x) {
        int max = x[0];
        int min = x[0];
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
            if (x[i] < min) {
                min = x[i];
            }
            total += x[i];
        }
        int[] arr = {max, min, total / x.length};
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // Takes an array, and shifts the values of each index by one to the front of the array. The value of the last index is set to 0.
    public int[] valShift(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x[i] = 0;
            } else { 
                x[i] = x[i+1];
            }
        }
        System.out.println(Arrays.toString(x));
        return x;
    }
}