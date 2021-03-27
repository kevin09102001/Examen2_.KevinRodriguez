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
class Interior extends tiempo {
    String matusado,tipovolante;
    int cantbotones;

    public Interior() {
    }

    public Interior(String matusado, String tipovolante, int cantbotones, int time) {
        super(time);
        this.matusado = matusado;
        this.tipovolante = tipovolante;
        this.cantbotones = cantbotones;
    }

    public Interior(String matusado, String tipovolante, int cantbotones) {
        this.matusado = matusado;
        this.tipovolante = tipovolante;
        this.cantbotones = cantbotones;
    }

    public String getMatusado() {
        return matusado;
    }

    public void setMatusado(String matusado) {
        this.matusado = matusado;
    }

    public String getTipovolante() {
        return tipovolante;
    }

    public void setTipovolante(String tipovolante) {
        this.tipovolante = tipovolante;
    }

    public int getCantbotones() {
        return cantbotones;
    }

    public void setCantbotones(int cantbotones) {
        this.cantbotones = cantbotones;
    }

    @Override
    public String toString() {
        return "Interior{" + "matusado=" + matusado + ", tipovolante=" + tipovolante + ", cantbotones=" + cantbotones + '}';
    }

    
}
