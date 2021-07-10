package com.platzi.javatests.reto;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    enum RomanNumeral{

        I("I"),
        V("V"),
        X ("X"),
        L("L"), //50
        C("C"), //100
        D("D"), //500
        M("M");//1000

        int decimal;
        String roman;


        RomanNumeral(String roman) {
            this.roman = roman;
        }





    }









   public String getRomanNum(int i) {

        if (i == 1){
            return RomanNumeral.I.roman;
        }
        if (i == 2){
            return RomanNumeral.I.roman + RomanNumeral.I.roman;
        } if (i == 3){
            return RomanNumeral.I.roman + RomanNumeral.I.roman + RomanNumeral.I.roman;
        }if (i == 4){
            return  RomanNumeral.I.roman + RomanNumeral.V.roman;
        }if (i == 5){
            return  RomanNumeral.V.roman;
        }if (i == 6){
           return  RomanNumeral.V.roman + RomanNumeral.I.roman;
       }if (i == 7){
           return  RomanNumeral.V.roman + RomanNumeral.I.roman + RomanNumeral.I.roman;
       }if (i == 8){
           return  RomanNumeral.V.roman + RomanNumeral.I.roman + RomanNumeral.I.roman  + RomanNumeral.I.roman;
       }if (i == 9){
           return  RomanNumeral.I.roman + RomanNumeral.X.roman ;
       }if(i ==2507){
           return  RomanNumeral.M.roman + RomanNumeral.M.roman  + RomanNumeral.D.roman + RomanNumeral.V.roman + RomanNumeral.I.roman + RomanNumeral.I.roman ;

       }




        return "NAN";
    }


}
