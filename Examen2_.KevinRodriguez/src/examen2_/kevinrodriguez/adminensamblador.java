/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_.kevinrodriguez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class adminensamblador {
     private ArrayList<ensamblador> listaensamblador = new ArrayList();
    private File archivo = null;

    public adminensamblador(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<ensamblador> getensamblador() {
        return listaensamblador;
    }

    public void setListaautos(ArrayList<ensamblador> listaensamblador) {
        this.listaensamblador = listaensamblador;
    }

    public void setPersona(ensamblador p) {
        this.listaensamblador.add(p);
    }

    @Override
    public String toString() {
        return "listaensanvlador=" + listaensamblador;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (ensamblador t : listaensamblador) {
                bw.write(t.getId()+ ";");
                bw.write(t.getNombre()+ ";");
                bw.write(t.getGenero()+ ";");
                bw.write(t.getEdad()+ ";");
                bw.write(t.getCantvehiculos()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaensamblador = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaensamblador.add(new ensamblador(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
