/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranPalkir;

/**
 *
 * @author aditb
 */
public class Motor extends Kendaraan {
    @Override
    double hitungTotalBiaya() {
        return getjamPalkir()* 2000;
    }
}