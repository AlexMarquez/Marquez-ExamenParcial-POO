/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.am.soluciones.web.marquezexamenparcial;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ("/servicio-calificaciones")

public class ControllerExamen {
    
    @RequestMapping (value= "/Array", method=RequestMethod.GET, headers= {"Accept=Application/json"})
    public @ResponseBody
    ArrayList<Evaluacion> arrayUsuario(){
        
        return GeneradorCalificaciones.arrayUsuario();
    }
    
    //http://localhost:8092/MarquezExamenParcial/servicio/servicio-calificaciones/Array
    
}
