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
public class Cls_estudiante {

    Estudiante e;

    public Cls_estudiante(Estudiante e) {
        this.e = e;
    }

     //Estudiante p= new Estudiante();
 /*void dat_estudiante(){
       
     p.setNombre("Luis");
     p.setApellidos("Lavado");
     p.setDni("47370895");
     p.setFecha_nac(" 24-03-1991");
     p.setDirecion("Alto trujillo");
     p.setTelefono("47370895");
     p.setGenero("Masculino");
     p.setId_persona("01");
        
     System.out.println("Nombre: "+p.getNombre()+"\n Apellidos: "+p.getApellidos()+"\n DNI: "+p.getDni()+"\n Fecha de nacimiento: "+p.getFecha_nac()+"\n Dirección: "+p.getDirecion()+"\n Teléfono:  "+p.getTelefono()+"\n Genero: "+p.getGenero()+"\n Código: "+p.getId_persona());
        
     }   */
    void matricula() {
        System.out.println(e.getNombre() + "Yupi !... me estoy matriculando");
    }

    public String asistencia_clases() {
        return e.getNombre() + "Soy puntual";
    }
}
