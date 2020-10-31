/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan30.cakep;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Cakep
 * 
 */

public class PB01010119902Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String jawab;
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String hijau    = "\u001b[32m";
        String kuning   = "\u001b[33m";
        String biru     = "\u001b[34m";
        String ungu     = "\u001b[35m";
        String birumuda = "\u001b[36m";
        String putih    = "\u001b[37m";
        
        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri "  + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = scanner.next();
        jawab = jawab.toLowerCase();

        System.out.println();

        if (jawab.equals("yoi")) 
        {
            System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
        }
        else if (jawab.equals("enggak")) 
        {
            System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
        }
    }
}
