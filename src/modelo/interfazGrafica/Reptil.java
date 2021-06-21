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
public class Reptil extends Animal implements Serializable{
    
	/**
     * Atributo final de tipo String que guarda la especie de un Reptil.
     */
    private final String especie;
    
    /**
     * Atributo final de tipo boolean que guarda true si es venoso o false si no lo es.
     */
    private boolean venenoso;
    
    /**
     * Constructor que inicializa un Reptil con cinco parámetros.
     * Llama al constructor de tres parámetros que hereda de la Clase Animal (nombre, 
     * fecha de nacimiento y peso).
     * @param nombre : el nombre del Reptil
     * @param fecha : la fecha de nacimiento del Reptil
     * @param peso : el peso del Reptil
     * @param raza : la raza del Reptil
     * @param venenoso : si es venenoso o no el Reptil
     */
    public Reptil(String nombre, LocalDate fecha, double peso, String especie, boolean venenoso) {
        super(nombre, fecha, peso);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    /**
     * Devuelve un String de la especie del Reptil. 
     * @return String : la especie del Reptil
     */
    public String getEspecie() {
        return this.especie;
    }
    
    /**
     * Devuelve un boolean de si el Reptil es venenoso. 
     * @return boolean : true si la especie es veneneosa o no
     */
    public boolean isVenenoso() {
        return this.venenoso;
    }

    /**
     * Modifica si un Reptil es venenoso o no 
     * @param venenoso : si es venenoso o no el Reptil
     */
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    /**
     * Método toString() que implementa de la Clase Animal.
     * @return Stirng : la información de un Reptil (nombre, fecha de nacimiento, raza,
     * 		   peso, venenoso y comentario)
     */ 
    @Override
    public String toString(){
        return "\nFICHA DE PERRO:\n\tNombre: " + super.getNombre() + "\n\tEspecie: " +
                this.especie + "\n\tFecha de nacimiento: " + super.getFechaNacimiento() +
                "\n\tPeso: " + super.getPeso() + "\n\tVenenoso: " + (this.venenoso?"Si":"No") +
                "\n\tComentario: " + super.getComentarios();
    }
    
    /*@Override
    public int getSize(){
        int sizeAnimal = super.getSize();
        return sizeAnimal + (getEspecie().length()*2) + 1;
    }*/
    
}
