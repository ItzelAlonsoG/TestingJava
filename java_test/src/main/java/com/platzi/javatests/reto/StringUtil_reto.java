package com.platzi.javatests.reto;

public class StringUtil_reto {

    static String result;
    static boolean res;

    public static boolean isEmpty(String str){
        result = str;
         res = false ;

        if(result == "" || result.trim().length() > 0 ){

            res = true;

        }else{
            throw new IllegalArgumentException("String is not empty");
        }

        return res;
    }

    public static boolean isNull (String str){
        result = str;
        res = false ;

        if(result == null){

            res = true;

        }else{
            throw new IllegalArgumentException("String is not empty");
        }

        return res;
    }

}
