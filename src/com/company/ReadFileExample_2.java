package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileExample_2 {

    public static void main(String[] args) throws IOException {
        System.out.println(readFile());
    }

    private static String readFile() throws IOException {
        InputStream is = new FileInputStream("file.txt");
        byte [] buffer = new byte[1024 * 64]; //64KB
        //0.. - how many bytes succeeded to read
        //-1 - to more bytes to read

        while(is.available() > 0) {
            int read = is.read(buffer, 0, 100); //return value -> сколько байт удалось прочитать
            //buffer
            //0..100 - фотографии
            //101..200 - звуки
            //200..1000 - видео


            //Допустим, метод read прочитал 10 байт (10 + 80 + 20)
            //Значит, в buffer с 0 по 9 индекс уже заняты
            //Новый файл нужно класть начиная с 10го индекса (offset)
            //Можно класть в buffer картинки только по 100 индекс (length)

//            if (read == -1) {
//                break;
//            }
        }

        return new String(buffer);
    }
}
