package day1_chieu;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Tìm số lớn nhất trong dãy số --");
        System.out.print("Nhập số lượng số trong dãy: ");
        n = scanner.nextInt();

        double max = 0; // Giả sử số lớn nhất ban đầu là 0

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            double number = scanner.nextDouble();

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Số lớn nhất trong dãy là: " + max);
    }
    }


