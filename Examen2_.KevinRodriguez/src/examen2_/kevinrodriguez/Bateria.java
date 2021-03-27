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
class Bateria extends tiempo {

    String material;
    int autonomia;

    public Bateria(String material, int autonomia, int time) {
        super(time);
        this.material = material;
        this.autonomia = autonomia;
    }

    public Bateria(String material, int autonomia) {
        this.material = material;
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Bateria{" + "material=" + material + ", autonomia=" + autonomia + '}';
    }
}
