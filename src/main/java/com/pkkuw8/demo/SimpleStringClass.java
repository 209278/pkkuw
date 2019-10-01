package com.pkkuw8.demo;

public class SimpleStringClass {

    private StringBuilder stringBuilder;

    public SimpleStringClass(String str){
        stringBuilder = new StringBuilder(str);
    }
    public String rev(){
        return stringBuilder.reverse().toString();
    }
}
