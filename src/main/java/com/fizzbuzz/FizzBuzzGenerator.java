package com.fizzbuzz;

/**
 * Purpose of this class is to generate Numbers between the given range,
 * given that,
 * if number is multiple of 3 - it will be replaced by Fizz
 * if number is multiple of 5 - it will be replaced by Buzz
 * if number is multiple of 3 & 5 - it will be replaced by FizzBuzz
 */
public class FizzBuzzGenerator {

    public String[] createArrayInRange(int i, int j) {

        if (i <= 0 || j <= 0) {
            return new String[]{};
        }

        String[] numbers = new String[j - i + 1];
        System.out.println(numbers.length);
        int count = 0;
        for (int k = i; k <= j; k++) {
            if (Math.floorMod(k, 15) == 0) {
                numbers[count] = "FizzBuzz";
            } else if (Math.floorMod(k, 3) == 0) {
                numbers[count] = "Fizz";
            } else if (Math.floorMod(k, 5) == 0) {
                numbers[count] = "Buzz";
            } else {
                numbers[count] = String.valueOf(k);
            }
            count++;
        }
        return numbers;
    }
}
