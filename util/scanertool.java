package util;

import java.util.Scanner;

public class scanertool {

private static Scanner sc=new Scanner(System.in);
    public static int getnumberinput() {
        return sc.nextInt();
    }
    public static String getstringinput(){
        return sc.next();
    }
}