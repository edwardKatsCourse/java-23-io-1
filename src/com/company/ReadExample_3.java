package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample_3 {

    public static void main(String[] args) throws IOException {
        System.out.println(getFile_2());
    }

    private static String getFile_1() throws IOException {
        byte [] buffer = new byte[1024 * 20];
        InputStream inputStream = new FileInputStream("file.txt");
        while (true) {
            int bytesAlreadyRead = inputStream.read(buffer);
            if (bytesAlreadyRead == -1) {
                break;
            }
        }

        return new String(buffer);
    }
    private static String getFile_2() throws IOException {
        byte [] buffer = new byte[1024 * 10];
        InputStream inputStream = new FileInputStream("file.txt");
        int readBytes = 0;
        while (inputStream.available() > 0) {
            readBytes = readBytes + inputStream.read(buffer);
        }
        System.out.println("Total read bytes: " + readBytes);

        return new String(buffer);
    }
}
