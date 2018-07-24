package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamCloseExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream is = new FileInputStream("file.txt");

        while (true) {
            is.read();
            Thread.sleep(1000); //1000 milliseconds = 1 second
        }
    }
}
