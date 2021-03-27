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
class Infoentretenimiento extends tiempo {

    int cantpantalla, ancho;
    String visor;

    public Infoentretenimiento(int cantpantalla, int ancho, String visor, int time) {
        super(time);
        this.cantpantalla = cantpantalla;
        this.ancho = ancho;
        this.visor = visor;
    }

    public Infoentretenimiento(int cantpantalla, int ancho, String visor) {
        this.cantpantalla = cantpantalla;
        this.ancho = ancho;
        this.visor = visor;
    }

    public int getCantpantalla() {
        return cantpantalla;
    }

    public void setCantpantalla(int cantpantalla) {
        this.cantpantalla = cantpantalla;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    @Override
    public String toString() {
        return "Infoentretenimiento{" + "cantpantalla=" + cantpantalla + ", ancho=" + ancho + ", visor=" + visor + '}';
    }

}
