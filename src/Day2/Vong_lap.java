package Day2;

import java.util.Scanner;

public class Vong_lap {
    public static void main(String[] args) {

//        // in ra cac so le trong 1-100;
//    for(int i=1;i<=99;i++)
//    System.out.print(i+" ");

        // in ra cac so chan trong khoang(a,b)
        Scanner khoiTao=new Scanner(System.in);
        System.out.println("nhap a,b:");
        long a= khoiTao.nextLong();


        long b= khoiTao.nextLong();
//        if(a>=b)
//            System.exit(0);
//        for(long i=a;i<=b;i++)
//            if(i%2==0)
//                System.out.println(i+" ");
int dem=0;
                if(a>=b)
            System.exit(0);
        for(long i=a+1;i<b;i++)
            if(i%2!=0)
            {
                System.out.println(i+" ");
                dem++;
            }
        System.out.print("co "+dem+" so le");



    }
}
