/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PembayaranParkir;

/**
 *
 * @author aditb
 */
import java.util.Scanner;


public abstract class Kendaraan {
    private String platNomor;
    private double jamPalkir;

    public String getPlatnomor() {
        return platNomor;
    }

    public void setPlatnomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public double getjamParkir() {
        return jamPalkir;
    }

    public void setjamParkir(double jamPalkir) {
        this.jamPalkir = jamPalkir;
    }

    abstract double hitungTotalBiaya();
}