package unit1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        double vnd=24000;
        double usd ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Endter USD ");
        usd =scanner.nextDouble();
        double quyDoi= usd * vnd;
        System.out.println(quyDoi);
    }
}
