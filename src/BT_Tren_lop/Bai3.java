package BT_Tren_lop;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // tinh tong: 1+1/2+1/3+...+1/n;
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("nhap n:");
        int n= khoiTao.nextInt();
        float tong=0;
        for(float i=1;i<=n;i++)
        {
            tong=(tong+(1/i));
        }

        System.out.printf("Tong la: %.2f",tong);
    }
}
