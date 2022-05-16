/*11
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lspjava;

/**
 *
 * @author ASUS
 */
public class Sewa {
    private String lapanganText;
    private String jenisText;
    private int lapangan;
    private int hrglapangan;
    private int jenis;
    private int jam;
    private String sepatu;
    private String kostum;
    private int hrgSepatu;
    private int hrgKostum;
    private int total;
    private int kembalian;
    private String namaPenyewa;
    
    public int getLapangan(){
        return lapangan;
    }
    
    public void setLapangan(int lapangan){
        this.lapangan = lapangan;
    }
    
    public String getLapanganText(){
        switch(lapangan){
            case 1:
                lapanganText = "Indoor";
                break;
            case 2:
                lapanganText = "Outdoor";
                break;
            default:
                throw new AssertionError();
        }
        return lapanganText;
    }   
    
    public int getJenis() {
        return jenis;
    }
    
    public void setJenis(int jenis) {
        this.jenis = jenis;
    }
    
    public String getJenisText() {
        switch(jenis){
            case 1:
                jenisText = "Reguler";
                break;
            case 2:
                jenisText = "Matras";
                break;
            case 3:
                jenisText = "Rumput";
                break;
            default:
                throw new AssertionError();
        }
        return jenisText;
    }
    
    public int getHrgLapangan(){
        if (lapangan == 1){
            switch(jenis){
                case 1:
                    hrglapangan = 300000*jam;
                    break;
                case 2:
                    hrglapangan = 250000*jam;
                    break;
                case 3:
                    hrglapangan = 200000*jam;
                    break;
                default:
                    throw new AssertionError();
            }
        } else if (lapangan == 2) {
            switch(jenis){
                case 1:
                    hrglapangan = 250000*jam;
                    break;
                case 2:
                    hrglapangan = 200000*jam;
                    break;
                case 3:
                    hrglapangan = 150000*jam;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return hrglapangan;
    }
    
    public void setHrgLapangan(int hrglapangan){
        this.hrglapangan = hrglapangan;
    }
    
    public int getJam(){
        return jam;
    }
    
    public void setJam(int jam){
        this.jam = jam;
    }
    
    public String getSepatu(){
        return sepatu;
    }
    
    public void setSepatu(String sepatu){
        this.sepatu = sepatu;
    }
    
    public String getKostum(){
        return kostum;
    }
    
    public void setKostum(String kostum){
        this.kostum = kostum;
    }
    
    public int getHrgSepatu(){
        hrgSepatu = jam * (sepatu.equals("y") || sepatu.equals("Y") ? 50000 : 0);
        return hrgSepatu;
    }
    
    public int getHrgKostum(){
        hrgKostum = jam * (kostum.equals("y") || kostum.equals("Y") ? 45000 : 0);
        return hrgKostum;
    }
    
    public int getTotal(){
        total = hrgKostum+hrgSepatu+hrglapangan;
        return total;
    }

    public void setKembalian(int kembalian){
        this.kembalian = kembalian - total;
    }
    
    public int getKembalian(){
        return kembalian;
    }
    
    public void setNamaPenyewa(String namaPenyewa){
        this.namaPenyewa = namaPenyewa;
    }
    
    public String getNamaPenyewa(){
        return namaPenyewa;
    }
}
