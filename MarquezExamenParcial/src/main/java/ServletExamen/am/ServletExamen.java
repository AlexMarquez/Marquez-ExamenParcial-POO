/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServletExamen.am;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletExamen extends HttpServlet {

   
    protected void doGET(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          
        
 //  ServicioEvaluacion1 m=new ServicioEvaluacion1();
   
   //     Evaluacion1 x=new Evaluacion1();
     //   x.setEvaluacion1(Evaluacion1);
        
     //   request.setAttribute("resultados",x);
        RequestDispatcher despachador=request.getRequestDispatcher("/presentacion.jsp");
        despachador.forward(request, response);
      
    

    }

}
