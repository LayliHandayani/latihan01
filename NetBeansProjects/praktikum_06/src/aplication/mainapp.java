/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplication;

import Data.karyawan;
import Data.perusahaan;
import Data.kendaraan;
import Util.ImpTransportasi;


/**
 *
 * @author jamet
 */
public class mainapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var p=new perusahaan();
        p.name="sarana prima jaya";
        p.bidang_usaha="Garmen";
        System.out.println("NAMA PERUSAHAAN = " + p.name);
        System.out.println("BIDANG USAHA = " + p.bidang_usaha);
        
        System.out.println("==========Data Karyawan==========");
        var k=new karyawan();
        k.setId(1 );
        k.setName("Layli Handayani");
        k.setAlamat("praya, lombok tengah");
        System.out.println("ID = " + k.getId());
        System.out.println("NAMA = " + k.getName());
        System.out.println("ALAMAT = " + k.getAlamat());
        
        System.out.println("==========jabatan pegawai==========");
        perusahaan.Jabatan j=p.new Jabatan();
        j.getJbt_karyawan("Manager");
        j.setBidang("marketing");
        System.out.println("Jabatan = " + j.getJbt_karyawan());
        System.out.println("Bidang pekerjaan = " + j.getBidang());
        
        System.out.println("==========Alat Transportasi=========");
        var trans=new ImpTransportasi();
        trans.insert();
        trans.tampil();
          
    }
    
}
