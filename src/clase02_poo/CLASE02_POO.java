/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02_poo;

/**
 *
 * @author alumno05
 */
public class CLASE02_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e= new Estudiante();
        System.out.println("En la Matricula: \n");
        e.setNombre("Luigi:");
        e.setApellidos("Lavado: ");
        
    Cls_estudiante ce= new Cls_estudiante(e);
    ce.matricula();
        System.out.println(ce.asistencia_clases());
        
        Profesor ps= new Profesor();
        System.out.println("Llegando ala clase: \n");
        ps.setNombre("Joel Pérez: ");
        Cls_profesor cp= new Cls_profesor(ps);
        System.out.println(cp.asistencia_cls());
        cp.dictar_cls();
    }
    
}
