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
public class Cls_profesor extends Cls_persona{
    /*void datos(){
        Persona p= new Persona();
        p.setNombre("Joel");
        p.setApellidos("Pérez");
        p.setDni("47370895");
        p.setFecha_nac(" 24-03-1991");
        p.setDirecion("Alto trujillo");
        p.setTelefono("47370895");
        p.setGenero("Masculino");
        p.setId_persona("01");
        
        System.out.println("Nombre: "+p.getNombre()+"\n Apellidos: "+p.getApellidos()+"\n DNI: "+p.getDni()+"\n Fecha de nacimiento: "+p.getFecha_nac()+"\n Dirección: "+p.getDirecion()+"\n Teléfono:  "+p.getTelefono()+"\n Genero: "+p.getGenero()+"\n Código: "+p.getId_persona());
        
    }*/
    Profesor ps;

    public Cls_profesor(Profesor ps) {
        this.ps = ps;
    }
    void dictar_cls(){
        System.out.println(ps.getNombre()+"Estoy dictando el curso de LP1");
    }
    
    @Override
    public String asistencia_cls(){
        return ps.getNombre()+"Soy muy puntual";
    }
}
