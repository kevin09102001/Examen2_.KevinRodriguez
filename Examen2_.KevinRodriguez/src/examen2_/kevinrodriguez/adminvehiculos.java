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
public class adminvehiculos {
      private ArrayList<vehiculo> listaautos = new ArrayList();
    private File archivo = null;

    public adminvehiculos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<vehiculo> getListaautos() {
        return listaautos;
    }

    public void setListaautos(ArrayList<vehiculo> listaautos) {
        this.listaautos = listaautos;
    }

    public void setPersona(vehiculo p) {
        this.listaautos.add(p);
    }

    @Override
    public String toString() {
        return "listaautos=" + listaautos;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (vehiculo t : listaautos) {
                bw.write(t.getVin() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getBatería() + ";");
                bw.write(t.getCarrocería() + ";");
                bw.write(t.getInterior() + ";");
                bw.write(t.getSistemainfoentretenimiento() + ";");
                 bw.write(t.getAsientos()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaautos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaautos.add(new vehiculo(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
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
