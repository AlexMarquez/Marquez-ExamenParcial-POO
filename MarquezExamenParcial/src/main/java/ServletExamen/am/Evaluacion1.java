/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServletExamen.am;


public class Evaluacion1 {
    
     String nombre;
    Float calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public Evaluacion1(String nombre, Float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    
}
