/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lspjava;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Lspjava {

    /**
     * @param args the command line arguments
     */
    public static String lagi;
    public static boolean stop = true;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        do {
        System.out.println("==============================================================");
        System.out.println("Selamat Datang di Aplikasi Penyewaan Lapangan");
        System.out.println("Tipe Lapangan : ");
        System.out.println("1. Indoor");
        System.out.println("2. Outdoor");
        System.out.print("Pilih tipe lapangan yang akan disewa : ");
        int lapangan = scan.nextInt();
        System.out.println("==============================================================");
        System.out.println("Jenis Lapangan : ");
        System.out.println("1. Reguler");
        System.out.println("2. Matras");
        System.out.println("3. Rumput");
        System.out.print("Pilih Jenis lapangan yang akan disewa : ");
        int jenis = scan.nextInt();
        System.out.println("==============================================================");
        System.out.print("Lama sewa (jam) : ");
        int jam = scan.nextInt();
        System.out.println("==============================================================");
        System.out.print("Ingin menyewa sepatu (y/n) : ");
        String sepatu = scan.next();
        System.out.println("==============================================================");
        System.out.print("Ingin menyewa kostum (y/n) : ");
        String kostum = scan.next();
        System.out.println("==============================================================");
        System.out.print("Nama penyewa : ");
        String namaPenyewa = scan.next();
        
        proses(lapangan, jenis, jam, sepatu, kostum, namaPenyewa);
       
        } while (true);
    }
    
    private static void proses(int lapangan, int jenis, int jam, String sepatu, String kostum, String namaPenyewa){
        Scanner scan = new Scanner(System.in);
        Sewa SetSewa = new Sewa();
        SetSewa.setLapangan(lapangan);
        SetSewa.setJenis(jenis);
        SetSewa.setJam(jam);
        SetSewa.setSepatu(sepatu);
        SetSewa.setKostum(kostum);
        SetSewa.setNamaPenyewa(namaPenyewa);
        System.out.println("==============================================================");
        System.out.println("Data Penyewaaan Lapangan");
        System.out.println("==============================================================");
        System.out.println("Lapangan : "+SetSewa.getLapanganText()+" ("+SetSewa.getJenisText()+") "+jam+" Jam" );
        System.out.println("Nama penyewa : " + SetSewa.getNamaPenyewa());
        System.out.println("Sewa Lapangan    : " + SetSewa.getHrgLapangan());
        System.out.println("Sewa Sepatu      : " + SetSewa.getHrgSepatu());
        System.out.println("Sewa Kostum      : " + SetSewa.getHrgKostum());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total            : " + SetSewa.getTotal());
        System.out.print("Uang Pembayaran  : ");
        int bayar = scan.nextInt();
        SetSewa.setKembalian(bayar);
        System.out.println("Kembalian        : " + SetSewa.getKembalian());
        System.out.println("==============================================================");
        System.out.print("Apakah yakin ingin keluar? (y/n) ");
        lagi = scan.next();
        if (lagi.toLowerCase().equals("n")){
            stop = false;
        } else {
            System.out.println("Terima Kasih!!");
            System.exit(0);
        }
    }
    
}
