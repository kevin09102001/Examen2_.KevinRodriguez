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
class Carroceria extends tiempo{
    String tipo;
    int capacidad;

    public Carroceria(String tipo, int capacidad, int time) {
        super(time);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Carroceria(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }

    
}

    
