package com.platzi.javatests.reto;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    static FizzBuzz prueba = new FizzBuzz();

    /*
    *   fizzBuzz(3) ⇒ "Fizz"
        fizzBuzz(6) ⇒ "Fizz"
        fizzBuzz(5) ⇒ "Buzz"
        fizzBuzz(10) ⇒ "Buzz"
        fizzBuzz(15) ⇒ "FizzBuzz"
        fizzBuzz(30) ⇒ "FizzBuzz"
        fizzBuzz(2) ⇒ "2"
        fizzBuzz(16) ⇒ "16"
    * */

    @Test
    public void return_Fizz_when_num_is_divisible_by_3() {
        assertThat(prueba.fizzBuzz(3), is("Fizz"));
        assertThat(prueba.fizzBuzz(6), is("Fizz"));
        assertThat(prueba.fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void return_Buzz_when_num_is_divisible_by_5() {
        assertThat(prueba.fizzBuzz(5), is("Buzz"));
        assertThat(prueba.fizzBuzz(10), is("Buzz"));
        assertThat(prueba.fizzBuzz(20), is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_when_num_is_divisible_by_3_and_5() {
        assertThat(prueba.fizzBuzz(15), is("FizzBuzz"));
        assertThat(prueba.fizzBuzz(30), is("FizzBuzz"));

    }

    @Test
    public void return_number_when_num_is_not_divisible_by_5_or_3() {
        assertThat(prueba.fizzBuzz(2), is(2));
        assertThat(prueba.fizzBuzz(16), is(16));
    }
}