package com.jagannath.thermalbluetoothprinter;

import java.util.Random;

public class ThermalBluetoothPrinter {
    private final String LETTERS="abcdefghijklmnopqrstuvwxyz";
    private  final char[] ALHPANUMERIC =(LETTERS + LETTERS.toUpperCase()+"0123456789").toCharArray();

    public String generateAlphaNumeric(int length){
        StringBuilder result= new StringBuilder();
        for (int i=0 ;i < length ;i++){
            result.append(ALHPANUMERIC[new Random().nextInt(ALHPANUMERIC.length)]);
        }
        return  result.toString();
    }
}
