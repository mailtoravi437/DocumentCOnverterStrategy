package com.scm;

public class PngConverterStrategy implements DocumentConverterStrategy{
    @Override
    public void convert(String inputPath, String outPath) {
        System.out.println("PNG converter");
    }
}
