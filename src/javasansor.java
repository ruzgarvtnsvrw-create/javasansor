/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odevler3;

import java.util.Scanner;

/**
 *
 * @author kevir
 */
public class odevasansor {
    
    public static void main(String[] args) { // abi yeter artık çok ödev var kodda yanlıs varsa umursamayın çok dikkat etmedim
        
    
    
    Scanner ruzgar = new Scanner(System.in);
    
    System.out.println("Gitmek istediğiniz katı yazınız (Çıkmak isterseniz 100 yazınız ) mevcut kat = 0");
    
    int kat=ruzgar.nextInt();
    
    int mevcut;
    mevcut=0;
    int hedef;
    int mesafe;
    
    if (kat == 100) {

                System.out.println("Programdan çıkılıyor.");

            } else if (kat < 1 || kat > 10) {

                System.out.println("yanlış kat girdin");

            } else {

                hedef = kat;

                System.out.println("mevcut " + mevcut);
                System.out.println("hedef " + hedef);

                if (hedef > mevcut) {

                    mesafe = hedef - mevcut;

                    System.out.println("asansör yukarı çıkıyo");
                    System.out.println(mesafe + " kat yukarı gitcek");

                } else if (hedef < mevcut) {

                    mesafe = mevcut - hedef;

                    System.out.println("asansör aşşa iniyo");
                    System.out.println(mesafe + " kat aşşa incek");

                } else {

                    System.out.println("zaten burda");
                    System.out.println("hareket etmicek");

                }

                mevcut = hedef;

                System.out.println("bitti");

            }
        }

        //scanner closeye gerek yokki çekirdek kadar kod zaten.

    }





   
