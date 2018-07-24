package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //InputStream OutputStream

        //JVM -> OS -> file(Java 23. IO-1.iml)
        //OS: JVM = file(Java 23. IO-1.iml)
        InputStream is = new FileInputStream("file.txt");

        //текущий байт, который Java прочитала
        //1..255
        //byte -128..127    1-1-0-1-1-1-1-1

        //positive - информация
        //zero - данные закончились
        int read = is.read();


        //negative - данные закончились

        //-128..127
        //0..255
        //русский алфавит??
        //[120][65] я - UTF-8
        byte [] b = new byte[1024 * 1000000000];
    }
}
