package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileExample {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file.txt");
        System.out.println(is.read());

        while (true) {
            //0..255 - data
            //-1 - end of file

            //.read() -> читает по одному байту

            //.read(with params) -> читает сразу много байтов


            int read = is.read();
            if (read == -1) {
                break;
            }

            System.out.println(read);
        }
    }
}
