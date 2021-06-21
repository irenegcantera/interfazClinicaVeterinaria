/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfazGrafica;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase abstracta que define características y comportamientos de un Animal 
 * sin implementar. Implementa la Interfaz Serializable. 
 * @author Irene González Cantera
 * @version 1.0
 */
@SuppressWarnings("serial")
public abstract class Animal implements Serializable{
    
    /**
     * Atributo tipo String que guarda el nombre del Animal. 
     */
    private final String nombre; // 2 bytes cada caracter
    
    /**
     * Atributo tipo LocalDate que guarda la fecha de nacimiento del Animal.
     */
    private final LocalDate fechaNacimiento; // 4 bytes
    
    /**
     * Atributo tipo double que guarda el peso del Animal.
     */
    private double peso; // 8 bytes
    
    /**
     * Atributo de tipo String que guarda los comentarios sobre un Animal.
     */
    private String comentarios; // 2 bytes cada caracter
    
    /**
     * Constructor que inicializa un Animal con dos parámetros.
     * @param nombre : el nombre del Animal.
     * @param fecha : la fecha de nacimiento del Animal.
     */
    public Animal(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
    }
    
    /**
     * Constructor que inicializa un Animal con tres parámetros.
     * @param nombre : el nombre del Animal.
     * @param fecha : la fecha de nacimiento del Animal.
     * @param peso : el peso del ANimal
     */
    public Animal(String nombre, LocalDate fecha, double peso){
        this(nombre,fecha);
        this.peso = peso;
    }
    
    /**
     * Devuelve un String del nombre del Animal. 
     * @return String : el nombre del Animal
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Devuelve un objeto tipo LocalDate de la fecha de nacimiento del Animal.
     * @return LocalDate : la fecha de nacimiento del Animal
     */
    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * Devuelve un double del peso del Animal.
     * @return double : el peso del Animal
     */
    public double getPeso() {
        return this.peso;
    }
    
    /**
     * Devuelve un String con los comentarios de un Animal.
     * @return String : los comentarios sobre un Animal
     */
    public String getComentarios() {
        return this.comentarios;
    }
    
    /**
     * Modifica el peso del Animal por otro que se pasa por parámetro.
     * @param peso : el peso del Animal
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Modifica los comentarios del Animal por otros que se pasan por parámetro.
     * @param comentarios : los comentarios sobre un Animal
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    /**
     * Método abstracto que será implementado por otras clases que heredarán de Animal.
     */
    @Override
    public abstract String toString();
    
    /**
     * Método que sirve para comparar si unos Animales son instancias de otras.
     * @return boolean : true si un Animal es instancia de otra y false en el caso contrario
     */
    @Override
    public boolean equals(Object o){
        if(o instanceof Animal){
            @SuppressWarnings("unused")
			Animal a = (Animal) o;
            return true;
        }
        return false;
    }
    
    /*public int getSize(){
        return (getNombre().length()*2) + 2 + 4 + 8 + (getComentarios().length()*2) + 2;
    }*/
}
