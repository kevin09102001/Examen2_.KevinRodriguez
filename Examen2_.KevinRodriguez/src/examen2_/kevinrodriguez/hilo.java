/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_.kevinrodriguez;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class hilo extends Thread {

    private vehiculo vehiculo;
    private boolean vive = true;
    private double x = 1;
    private double time = 1;
    private JProgressBar c;
    private JTable tabla;

    private ArrayList<Double> tiempos = new ArrayList();

    public hilo(JProgressBar c, JTable tabla) {
        this.vehiculo = vehiculo;
        this.c = c;
        this.tabla = tabla;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public JProgressBar getC() {
        return c;
    }

    public void setC(JProgressBar c) {
        this.c = c;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public ArrayList<Double> getTiempos() {
        return tiempos;
    }

    public void setTiempos(ArrayList<Double> tiempos) {
        this.tiempos = tiempos;
    }

    public void run() {

        while (vive) {
            for (int i = 0; i < tiempos.size(); i++) {
                if (i == 0) {
                    c.setString("ensamblando bateria");
                }
                if (i == 1) {
                    c.setString("ensamblando carroceria");
                }
                if (i == 2) {
                    c.setString("ensamblando interior");
                }
                if (i == 3) {
                    c.setString("ensamblando sistema de infoentretenimiento");
                }
                if (i == 4) {
                    c.setString("ensamblando asientos");
                }//fin ultimo if
                time = tiempos.get(i);
                System.out.println(time);
                while (time > 0) {
                    time = time - x;
                    c.setValue((c.getValue() + 2));
                    x++;
                    if (time <= 0) {
                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

                        tabla.setModel(modelo);
                        if (i == 0) {
                            c.setString("ensamblando bateria");
                            Object[] x = {"bateria", tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 1) {
                            c.setString("ensamblando carroceria");
                            Object[] x = {"carroceria", tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 2) {
                            c.setString("ensamblando interior");
                            Object[] x = {"interior", tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 3) {
                            c.setString("ensamblando sistema de infoentretenimiento");
                            Object[] x = {"sistema infoEtretenimiento", tiempos.get(i)};
                            modelo.addRow(x);
                        }
                        if (i == 4) {
                            Object[] x = {"asientos", tiempos.get(i)};
                            modelo.addRow(x);
                            c.setString("ensamblando asientos");
                        }//fin ultimo if

                        break;
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }//fin for
            vive = false;

        }

    }

}
