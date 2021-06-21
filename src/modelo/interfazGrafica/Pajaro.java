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
public class Pajaro extends Animal implements Serializable{
    
	/**
     * Atributo final de tipo String que guarda la especie de un Pajaro.
     */
    private final String especie;
    
    /**
     * Atributo final de tipo boolean que guarda true si es cantor o false si no lo es.
     */
    private boolean cantor; // 1 byte
    
    /**
     * Constructor que inicializa un Pajaro con cinco parámetros.
     * Llama al constructor de tres parámetros que hereda de la Clase Animal (nombre, 
     * fecha de nacimiento y peso).
     * @param nombre : el nombre del Pajaro
     * @param fecha : la fecha de nacimiento del Pajaro
     * @param peso : el peso del Pajaro
     * @param raza : la raza del Pajaro
     * @param venenoso : si es cantor o no el Pajaro
     */
    public Pajaro(String nombre, LocalDate fecha, double peso, String especie, boolean cantor) {
        super(nombre, fecha, peso);
        this.especie = especie;
        this.cantor = cantor;
    }

    /**
     * Devuelve un String de la especie del Pajaro. 
     * @return String : la especie del Pajaro
     */
    public String getEspecie() {
        return this.especie;
    }
    
    /**
     * Devuelve un boolean de si el Pajaro es cantor. 
     * @return boolean : true si la especie es cantor o no
     */
    public boolean isCantor() {
        return this.cantor;
    }

    /**
     * Modifica si un Pajaro es cantor o no 
     * @param venenoso : si es cantor o no el Pajaro
     */
    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }
    
    /**
     * Método toString() que implementa de la Clase Animal.
     * @return Stirng : la información de un Pajaro (nombre, fecha de nacimiento, raza,
     * 		   peso, venenoso y comentario)
     */ 
    @Override
    public String toString(){
        return "\nFICHA DE PÁJARO:\n\tNombre: " + super.getNombre() + "\n\tEspecie: " +
                this.especie + "\n\tFecha de nacimiento: " + super.getFechaNacimiento() +
                "\n\tPeso: " + super.getPeso() + "\n\tCantor: " + (this.cantor?"Si":"No") +
                "\n\tComentario: " + super.getComentarios();
    }
    
    /*@Override
    public int getSize(){
        int sizeAnimal = super.getSize();
        return sizeAnimal + (getEspecie().length()*2) + 1;
    }*/
    
}
