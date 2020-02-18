package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class lab01 {

        public static void main(String[] args) {
            System.out.println("Kar Miktarını Giriniz :");
            Scanner kar = new Scanner(System.in);
            int KarMiktari=kar.nextInt();

            System.out.println("Zarar Miktarını Giriniz :");
            Scanner zarar=new Scanner(System.in);
            int ZaraMiktari=zarar.nextInt();
            if(KarMiktari>ZaraMiktari) {
            System.out.println("Kar Yaptınız :"+(KarMiktari-ZaraMiktari));
            }

            else{

                System.out.println("Zarar Yaptınız :"+(ZaraMiktari-KarMiktari));

            }

        }

}


