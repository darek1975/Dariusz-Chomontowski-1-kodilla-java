package com.kodilla.exception.main.Exception.Module;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String args[]){
        FileReaderException fileReaderException = new FileReaderException();
        try {
            fileReaderException.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");

        }
    }
}
