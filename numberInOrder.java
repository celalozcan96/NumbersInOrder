package NumbersInOrder;

import java.util.Scanner;

//Ödev
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

public class numberInOrder {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı :");
        a = input.nextInt();

        System.out.print("2.Sayı :");
        b = input.nextInt();

        System.out.print("3.Sayı :");
        c = input.nextInt();

        if((a < b) && (a < c)){
            if(b < c){
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "a < b < c");

            }else{
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "a < c < b");
            }

        }else if((b < a ) && (b < c)){
            if(a < c){
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "b < a < c");

            }else{
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "b < c < a");
            }

        }else{
            if(a < b){
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "c < a < b");

            }else{
                System.out.println("Sayıların küçükten Büyüğe Sıralınışı :" + "c < b < a");
            }

        }
    }
    
}
