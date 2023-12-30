/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranParkir;

/**
 *
 * @author aditb
 */
public class Mobil extends Kendaraan {
    @Override
    double hitungTotalBiaya() {
        return getjamParkir()* 4000;
    }
}