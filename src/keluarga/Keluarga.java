/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia bapak = new Orang_Tua("Iskak Marzuki", "Magelang", "08 November 1976", "POLRI", "Banyuwangi, Bandongan, Magelang", "085727026381", 0);
        Manusia ibu = new Orang_Tua("Dwi Purwanti", "Magelang", "11 December 1981", "Mengurus Rumah Tangga", "Banyuwangi, Bandongan, Magelang", "0856400776766", 0);
        Manusia anak1 = new Anak("Andhika Reo Saputra", "Magelang", "20 April 2004", "Pelajar/Mahasiswa", "Banyuwangi, Bandongan, Magelang", "085227244317", 0);
        Manusia anak2 = new Anak("Anindya Rantis Saputri", "Magelang", "29 April 2012", "Pelajar/Mahasiswa", "Banyuwangi, Bandongan, Magelang", "085227244317", 0);

        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(anak1.getDetails());
        System.out.println(anak2.getDetails());
    }
    
       
    }

