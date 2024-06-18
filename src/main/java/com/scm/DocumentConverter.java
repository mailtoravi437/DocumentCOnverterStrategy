package com.scm;

public class DocumentConverter {
    DocumentConverterStrategy  documentConverterStrategy;
    DocumentConverter(DocumentConverterStrategy converterStrategy){
        this.documentConverterStrategy = converterStrategy;
    }

    public void convertDocument(String input,String output){
        documentConverterStrategy.convert(input, output);
    }
}
