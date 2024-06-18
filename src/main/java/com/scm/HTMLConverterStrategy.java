package com.scm;

public class HTMLConverterStrategy implements DocumentConverterStrategy{
    @Override
    public void convert(String inputPath, String outPath) {
        System.out.println("CONVERT DOCUMENT TO HTML");
    }
}
