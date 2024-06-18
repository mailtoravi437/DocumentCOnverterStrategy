package com.scm;

public class PDFConverterStrategy implements DocumentConverterStrategy{
    @Override
    public void convert(String inputPath, String outPath) {
        System.out.println("Converted document to PDF");
    }
}
