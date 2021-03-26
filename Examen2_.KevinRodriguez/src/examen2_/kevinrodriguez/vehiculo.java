/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_.kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class vehiculo {
    public int vin,asientos;
    public String color, batería, carrocería, interior, sistemainfoentretenimiento;
     Bateria bateria;
    Carroceria carroceria;
    Interior interio;
    Infoentretenimiento  infoentretenimiento;
    Asientos asiento;

    public vehiculo(int vin, String color, String batería, String carrocería, String interior, String sistemainfoentretenimiento, int asientos) {
        this.vin = vin;
        this.color = color;
        this.batería = batería;
        this.carrocería = carrocería;
        this.interior = interior;
        this.sistemainfoentretenimiento = sistemainfoentretenimiento;
        this.asientos = asientos;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBatería() {
        return batería;
    }

    public void setBatería(String batería) {
        this.batería = batería;
    }

    public String getCarrocería() {
        return carrocería;
    }

    public void setCarrocería(String carrocería) {
        this.carrocería = carrocería;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getSistemainfoentretenimiento() {
        return sistemainfoentretenimiento;
    }

    public void setSistemainfoentretenimiento(String sistemainfoentretenimiento) {
        this.sistemainfoentretenimiento = sistemainfoentretenimiento;
    }
    
    
}
