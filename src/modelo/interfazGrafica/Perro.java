/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfazGrafica;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase que hereda de la Clase Animal e implementa la Interfaz Serializable. 
 * Define nuevos atributos e implementa el método toString().
 * @author Irene González Cantera
 * @version 1.0
 * @see Animal
 */
@SuppressWarnings("serial")
public class Perro extends Animal implements Serializable{
    
	/**
     * Atributo final de tipo String que guarda la raza de un Gato.
     */
    private final String raza;
    
    /**
     * Atributo final de tipo String que guarda el microchip de un Perro.
     */
    private final String microchip;
    
    /**
     * Constructor que inicializa un Perro con cinco parámetros.
     * Llama al constructor de tres parámetros que hereda de la Clase Animal (nombre, 
     * fecha de nacimiento y peso).
     * @param nombre : el nombre del Perro
     * @param fecha : la fecha de nacimiento del Perro
     * @param peso : el peso del Perro
     * @param raza : la raza del Perro
     * @param microchip : el microchip del Perro
     */
    public Perro(String nombre, LocalDate fecha, double peso, String raza, String microchip){
       super(nombre,fecha,peso); 
       this.raza = raza;
       this.microchip = microchip;
    }
    
    /**
     * Devuelve un String de la raza del Perro. 
     * @return String : la raza del Perro
     */
    public String getRaza() {
        return raza;
    }
    
    /**
     * Devuelve un String del mimcrochip del Perro. 
     * @return String : el microchip del Perro
     */
    public String getMicrochip() {
        return microchip;
    }
    
    /**
     * Método toString() que implementa de la Clase Animal.
     * @return Stirng : la información de un Perro (nombre, fecha de nacimiento, raza,
     * 		   peso, microchip y comentario)
     */  
    @Override
    public String toString(){
        return "\nFICHA DE PERRO:\n\tNombre: " + super.getNombre() + "\n\tRaza: " +
                this.raza + "\n\tFecha de nacimiento: " + super.getFechaNacimiento() +
                "\n\tPeso: " + super.getPeso() + "\n\tMicrochip: " + this.microchip +
                "\n\tComentario: " + super.getComentarios();
    }
    
    /*@Override
    public int getSize(){
        int sizeAnimal = super.getSize();
        return sizeAnimal + (getRaza().length()*2) + (getMicrochip().length()*2);
    } */
}
