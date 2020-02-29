package com.company;
import java.util.Scanner;


public class nsayisi {

    public static void main(String[] args){
        System.out.println("Sayi Giriniz");
        Scanner sayi=new Scanner(System.in);
        int nSayisi=sayi.nextInt();
        int i;
        System.out.println("n"+"   "+"n^2"+"   "+"n^3"+"   "+"n^4");

        for(i=1; i<=nSayisi;i++){
            System.out.println(i+"   "+Math.pow(i,2)+"   "+Math.pow(i,3)+"   "+Math.pow(i,4));
        }

    }




}
