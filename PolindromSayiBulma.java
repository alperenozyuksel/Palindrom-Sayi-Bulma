package Giris;
import java.util.Scanner;



public class PolindromSayiBulma {
    static boolean isPolindrom(int number) {
        int temp = number;
        int sonSayi;
        int tersSayi = 0;

        while (temp != 0) {

            sonSayi = temp % 10;        // sonSayi = Son rakam

            tersSayi = (tersSayi * 10) + sonSayi; // tersSayi = 6 //
            temp /=10; // 25 kalıcak
        }


        if (number==tersSayi)

            return true;
        else

            return false;




    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int number = input.nextInt();
        System.out.println(isPolindrom(number));



    }

}