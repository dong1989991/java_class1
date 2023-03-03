package BT_Tren_lop;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        // tinh tong: 1^2+2^2+...+n^2;
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("nhap n:");
        int n= khoiTao.nextInt();
        float tong=0;
        for(int i=1;i<=n;i++)
        {
            tong=tong+i*i;
        }

        System.out.println("Tong la:"+tong);
    }
}
