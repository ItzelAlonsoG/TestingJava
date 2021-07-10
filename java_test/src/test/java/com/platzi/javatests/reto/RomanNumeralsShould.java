package com.platzi.javatests.reto;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsShould {

    /*
    -arabicToRoman(1) ⇒ "I"
   - arabicToRoman(2) ⇒ "II"
   - arabicToRoman(3) ⇒ "III"
    -arabicToRoman(5) ⇒ "V"
    -arabicToRoman(6) ⇒ "VI"
    -arabicToRoman(7) ⇒ "VII"
    arabicToRoman(10) ⇒ "X"
    arabicToRoman(11) ⇒ "XI"
    arabicToRoman(15) ⇒ "XV"
    arabicToRoman(16) ⇒ "XVI"
    arabicToRoman(50) ⇒ "L"
    arabicToRoman(51) ⇒ "LI"
    arabicToRoman(55) ⇒ "LV"
    arabicToRoman(56) ⇒ "LVI"
    arabicToRoman(60) ⇒ "LX"
    arabicToRoman(70) ⇒ "LXX"
    arabicToRoman(80) ⇒ "LXXX"
    arabicToRoman(81) ⇒ "LXXXI"
    arabicToRoman(85) ⇒ "LXXXV"
    arabicToRoman(86) ⇒ "LXXXVI"
    arabicToRoman(126) ⇒ "CXXVI"
    arabicToRoman(2507) ⇒ "MMDVII"
    * */

   @Test
    public void return_roma_number_of_num() {
        RomanNumerals  romanNum = new RomanNumerals();

       assertThat(romanNum.getRomanNum(1), CoreMatchers.is("I"));
       assertThat(romanNum.getRomanNum(2), CoreMatchers.is("II"));
       assertThat(romanNum.getRomanNum(3), CoreMatchers.is("III"));
       assertThat(romanNum.getRomanNum(4), CoreMatchers.is("IV"));
       assertThat(romanNum.getRomanNum(5), CoreMatchers.is("V"));
       assertThat(romanNum.getRomanNum(6), CoreMatchers.is("VI"));
       assertThat(romanNum.getRomanNum(7), CoreMatchers.is("VII"));
       assertThat(romanNum.getRomanNum(8), CoreMatchers.is("VIII"));
       assertThat(romanNum.getRomanNum(2507), CoreMatchers.is("MMDVII"));




   }
}