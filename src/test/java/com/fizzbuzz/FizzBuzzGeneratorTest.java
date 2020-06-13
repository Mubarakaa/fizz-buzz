package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitPlatform.class)
public class FizzBuzzGeneratorTest {

    @InjectMocks
    private FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @Test
    public void givenRange1to2_WhenGenerate_ThenNoFizzBuzz() {
        String[] expected = {"1", "2"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(1, 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenRange1to1_WhenGenerate_ThenArrayShouldHaveOneElement() {
        String[] expected = {"1"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(1, 1);

        assertArrayEquals(expected, actual);

    }

    @Test
    public void givenRange0to0_WhenGenerate_ThenReturnEmptyArray() {

        String[] result = fizzBuzzGenerator.createArrayInRange(0, 0);

        assertThat(result).isEmpty();
    }

    @Test
    public void givenRange4to5_WhenGenerate_ThenArrayHasBuzzWord() {
        String[] expected = {"4", "Buzz"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(4, 5);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenRange1to3_WhenGenerate_ThenArrayHasFizzWord() {

        String[] expected = {"1", "2", "Fizz"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(1, 3);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenRange1to5_WhenGenerate_ThenArrayHasFizzAndBuzzWord() {

        String[] expected = {"1", "2", "Fizz", "4", "Buzz"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(1, 5);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenRange1to15_WhenGenerate_ThenArrayHasFizzBuzzWord() {
        String[] expected = {"1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"};

        String[] actual = fizzBuzzGenerator.createArrayInRange(1, 15);

        assertArrayEquals(expected, actual);
    }
}
