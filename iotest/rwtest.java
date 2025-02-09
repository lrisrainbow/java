package iotest;

import java.io.*;

public class rwtest {
    public static void main(String[] args) {
        File file=new File("D:\\cxdownload\\test01\\a3.txt");
        File file1=new File("D:\\cxdownload\\test01\\a1.txt");
//        try {
//            FileWriter fileWriter=new FileWriter(file);
//            FileReader fileReader=new FileReader(file1);
//            char[] a=new char[2];
//            while (fileReader.read(a)!=-1)
//            {
//                fileWriter.write(a);
//            }
//            fileWriter.close();
//            fileReader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try {
            FileWriter fileWriter=new FileWriter(file);
            FileReader fileReader=new FileReader(file1);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String s;
          while ((s=bufferedReader.readLine())!=null)
          {
              bufferedWriter.write(s);

          }
          bufferedWriter.close();
          bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
