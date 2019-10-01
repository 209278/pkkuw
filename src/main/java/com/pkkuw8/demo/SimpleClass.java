package com.pkkuw8.demo;

public class SimpleClass {

    private StringBuilder stringBuilder;

    public SimpleClass(String str){
        stringBuilder = new StringBuilder(str);
    }
    public String rev(){
        return stringBuilder.reverse().toString();
    }
}
