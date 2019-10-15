package com.pkkuw8.demo;

import java.util.function.Predicate;

public class SimpleStringClass {

    private StringBuilder stringBuilder;

    public SimpleStringClass(String str){
        stringBuilder = new StringBuilder(str);
    }
    public String rev(){
        return stringBuilder.reverse().toString();
    }
    public String chackType(){
        StringBuilder response = new StringBuilder("String zawiera:");
        String givenValue = stringBuilder.toString();
        if(givenValue.chars().anyMatch((x) -> (x >= 0 && x <= 47) || (x >= 58 && x <= 64) || (x >= 91 && x <= 96) || (x >= 122 && x <= 127))){
            response.append("\nznak specjalny");
        }
        if(givenValue.chars().anyMatch((x) -> x >= 48 && x <= 57)){
            response.append("\nznak liczby");
        }
        if(givenValue.chars().anyMatch((x) -> x >= 65 && x <= 90)){
            response.append("\ndużą litere");
        }
        if(givenValue.chars().anyMatch((x) -> x >= 97 && x <= 122)){
            response.append("\nmałą literę");
        }

        return response.toString();
    }
}
