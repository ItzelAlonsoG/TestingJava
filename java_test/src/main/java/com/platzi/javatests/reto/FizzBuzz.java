package com.platzi.javatests.reto;

public class FizzBuzz {

    public Object fizzBuzz(int num) {

        if (num % 5 == 0 && num % 3 == 0) return "FizzBuzz";
        else if (num % 5 == 0) return "Buzz";
        else if (num % 3 == 0) return "Fizz";
        else return num;

    }
}
