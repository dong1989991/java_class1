package BT_Tren_lop;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner khoitao=new Scanner(System.in);
        System.out.println("x^n");
        System.out.println("nhap x:");
        int x=khoitao.nextInt();
        System.out.println("nhap n:");
        int n=khoitao.nextInt();
        double tong=Math.pow( x,  n);
        System.out.println("tong:"+tong);
    }
}
