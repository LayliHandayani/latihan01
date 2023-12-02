/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;


import Data.kendaraan;


/**
 *
 * 
 *
 * @author jamet
 */
public class ImpTransportasi implements Transportasi {
   kendaraan kd=new kendaraan(); 
   
   @Override
   public void insert() {
       kd.setJenis("Roda dua");
       kd.setMerek("beatstrite");
       kd.setfeul("PERTALITE");
   }
   @Override
   public void tampil(){
   System.out.println("jenis kendaraan = " + kd.getJenis());
   System.out.println("merek kendaraan = " + kd.getMerek ());
   System.out.println("BBBM yang digunakan = " + kd.getFeul());
} 
}