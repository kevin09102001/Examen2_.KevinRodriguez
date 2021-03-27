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
class tiempo {
     private int time;

    public tiempo(int time) {
        this.time = time;
    }

    public tiempo() {
    }

    public int gettime() {
        return time;
    }

    public void settime(int tiempo) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "time=" + time ;
    }
}
