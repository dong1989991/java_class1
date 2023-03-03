package BT_Tren_lop;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Tinh tong day so: tong=1+2+3+4+...+n
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("nhap n:");
        int n= khoiTao.nextInt();
        float tong=0;
        for(int i=1;i<=n;i++)
        {
            tong=tong+i;
        }

        System.out.println("Tong la:"+tong);
    }
}
