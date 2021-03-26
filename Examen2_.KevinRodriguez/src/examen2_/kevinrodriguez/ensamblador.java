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
public class ensamblador {
    public int id,edad,cantvehiculos;
    public String nombre, genero;

    public ensamblador(int id, String nombre, String genero,int edad, int cantvehiculos) {
        this.id = id;
        this.edad = edad;
        this.cantvehiculos = cantvehiculos;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantvehiculos() {
        return cantvehiculos;
    }

    public void setCantvehiculos(int cantvehiculos) {
        this.cantvehiculos = cantvehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    
    
}
