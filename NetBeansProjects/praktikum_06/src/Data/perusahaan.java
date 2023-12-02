/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author jamet
 */
public class perusahaan {
   public String name;
   public String bidang_usaha;
   
   public class Jabatan{
       private String jbt_karyawan;
       private String bidang;
       
       public String getJbt_karyawan() {
       return jbt_karyawan;
   }
       public void getJbt_karyawan(String jbt_karyawan) {
           this.jbt_karyawan = jbt_karyawan;
       }
       
       public String getBidang() {
           return bidang;
       }
     public void getJbt_Bidang(String bidang) {
         this.bidang = bidang;
     }

        public void setBidang(String marketing) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   }
}
