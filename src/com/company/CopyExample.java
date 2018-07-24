package com.company;

import java.io.*;
import java.net.URL;

public class CopyExample {

    public static void main(String[] args) throws IOException {
//        write();

        //DataInputStream
        //DataOutputStream
        copy(
                new URL("https://en.wikipedia.org/wiki/ASCII").openStream(),
                new FileOutputStream(new File("wiki.html"))
                );
    }

    private static void copy(InputStream is, OutputStream out) throws IOException {
        int bytesRead = 0;
        byte [] bytes = new byte[1024 * 100];
        while (is.available() > 0) {
            is.read(bytes);
            out.write(bytes);
        }

        System.out.println("Bytes read: " + bytesRead);

        out.flush();
        out.close();

        is.close();
    }


    private static void write() throws IOException {
        String textToSaveToTextFile = "My output text";
        OutputStream outputStream = new FileOutputStream("file_2.txt");
        outputStream.write(textToSaveToTextFile.getBytes()); //textToSaveToTextFile -> byte[]
        outputStream.flush(); //for outputs less than 8 bytes
        outputStream.close();

    }
}
