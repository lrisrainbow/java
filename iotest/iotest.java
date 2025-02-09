package iotest;

import java.io.*;

public class iotest {

    public static void main(String[] args) {
        File file=new File("D:\\cxdownload\\test01\\a3.txt");
        File file1=new File("D:\\cxdownload\\test01\\a1.txt");
//        try {
//            FileInputStream fileInputStream=new FileInputStream(file);
//            FileOutputStream fileOutputStream=new FileOutputStream(file1,true);
//            int i;
//            while ((i=fileInputStream.read())!=-1){
//                fileOutputStream.write(i);
//            }
//            fileInputStream.close();
//            fileOutputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            FileOutputStream fileOutputStream=new FileOutputStream(file1,true);
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i;
           while ((i=bufferedInputStream.read())!=-1)
           {
               bufferedOutputStream.write(i);
           } bufferedOutputStream.close();
            bufferedInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
