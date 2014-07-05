/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.am.soluciones.web.marquezexamenparcial;

import java.util.ArrayList;


public class GeneradorCalificaciones {
    
     public static ArrayList<Evaluacion> arrayUsuario(){
        ArrayList<Evaluacion> calificacion= new ArrayList<Evaluacion>();
        
        Evaluacion cal1=new Evaluacion("Petra", 5.8f);
        Evaluacion cal2=new Evaluacion("Jose", 7.4f);
        Evaluacion cal3=new Evaluacion("Roberta",8.6f);
        
        calificacion.add(cal1);
        calificacion.add(cal2);
        calificacion.add(cal3);
        
        return calificacion;
     } 
}
