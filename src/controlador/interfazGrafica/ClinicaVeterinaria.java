/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.interfazGrafica;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import modelo.interfazGrafica.*;

/**
 * Clase que contiene los m�todos que da funcionalidad a la interfaz gr�fica.
 * @author Irene Gonz�lez Cantera
 */
public class ClinicaVeterinaria {
    
	/**
	 * Atributo de tipo RamdomAccessFile.
	 */
    private static RandomAccessFile flujoClinica;
    
    /**
     * Atributo de n�mero entero que contiene el n�mero de registros.
     */
    private static int numeroRegistros;
    
    /**
     * Atributo de n�mero entero que contiene el tama�o de un registro.
     */
    private static int sizeRegistro = 100;
    
    /**
     * Devuelve el n�mero de registros.
     * @return int : el n�mero de registros que hay en el archivo
     */
    public static int getNumeroRegistros() {
        return numeroRegistros;
    }  
    
    /**
     * Devuelve el flujo.
     * @return RandomAccessFile : el flujo de entrada y salida en la interfaz gr�fica
     */
    public static RandomAccessFile getFlujoClinica() {
		return flujoClinica;
	}
	
    /**
     * M�todo que abre el flujo con el modo de acceso lectura/escritura despu�s de comprobar si
     * el archivo File existe y se trata de un fichero. Tambi�n calcula el n�mero de registros 
     * que hay en el documento. Lanza una excepci�n si no archivo no es un fichero.
     * @param archivo
     * @throws IOException
     */
    public static void abrirArchivoClinica(File archivo) throws IOException{
        if(archivo.exists() && !archivo.isFile()){
            throw new IOException(archivo.getName() + " no es un archivo.");
        }
        flujoClinica = new RandomAccessFile(archivo,"rw");
    }
    
    /**
     * M�todo que cierra el flujo. Lanza una excepci�n si hay problemas a la hora de cerrarlo.
     * @throws IOException
     */
    public static void cerrarArchivoClinica() throws IOException{
        flujoClinica.close();
    }
    
    /**
     * M�todo que inserta los datos de un Animal (nombre, fecha de nacimiento, peso y comentarios)
     * al final del �ltimo registro. Lanza una excepci�n.
     * @param animal
     * @throws IOException
     * @see Animal
     */
    public static void insertarAnimal(Animal animal) throws IOException{
    	flujoClinica.writeChars("\n");
        flujoClinica.seek(flujoClinica.length());
        flujoClinica.writeUTF(animal.getNombre());
        flujoClinica.writeUTF(animal.getFechaNacimiento().toString());
        flujoClinica.writeUTF("@" + String.valueOf(animal.getPeso()));
        flujoClinica.writeUTF("@" + animal.getComentarios() + "@");
    }
    
    /**
     * M�todo que inserta los datos de un animal de tipo Gato despu�s de llamar la funci�n
     * insertarAnimal(Animal animal). Lanza una excepci�n de entrada y salida.
     * @param gato
     * @throws IOException
     * @see Gato
     */
    public static void insertarGato(Gato gato) throws IOException{
        insertarAnimal(gato);
        flujoClinica.writeUTF("Gato" + "@");
        flujoClinica.writeUTF(gato.getRaza() + "@");
        flujoClinica.writeUTF(gato.getMicrochip());
        flujoClinica.writeChars("\n");  
    }
    
    /**
     * M�todo que inserta los datos de un animal de tipo Perro despu�s de llamar la funci�n
     * insertarAnimal(Animal animal). Lanza una excepci�n de entrada y salida.
     * @param perro
     * @throws IOException
     * @see Perro
     */
    public static void insertarPerro(Perro perro) throws IOException{
        insertarAnimal(perro);
        flujoClinica.writeUTF("Perro" + "@");
        flujoClinica.writeUTF(perro.getRaza() + "@");
        flujoClinica.writeUTF(perro.getMicrochip());
        flujoClinica.writeChars("\n");
    }
    
     /**
      * M�todo que inserta los datos de un animal de tipo Pajaro despu�s de llamar la funci�n
      * insertarAnimal(Animal animal). Lanza una excepci�n de entrada y salida.
      * @param pajaro
      * @throws IOException
      * @see Pajaro
      */
     public static void insertarPajaro(Pajaro pajaro) throws IOException{
        insertarAnimal(pajaro);
        flujoClinica.writeUTF("Pajaro" + "@");
        flujoClinica.writeUTF(pajaro.getEspecie() + "@");
        flujoClinica.writeBoolean(pajaro.isCantor());
        flujoClinica.writeChars("\n");
    }
    
     /**
      * M�todo que inserta los datos de un animal de tipo Reptil despu�s de llamar la funci�n
      * insertarAnimal(Animal animal). Lanza una excepci�n de entrada y salida.
      * @param reptil
      * @throws IOException
      * @see Reptil
      */
    public static void insertarReptil(Reptil reptil) throws IOException{
        insertarAnimal(reptil);
        flujoClinica.writeUTF("Reptil" + "@");
        flujoClinica.writeUTF(reptil.getEspecie() + "@");
        flujoClinica.writeBoolean(reptil.isVenenoso());
        flujoClinica.writeChars("\n");
    }

    /*public static boolean buscarPorNombre(String nombre) throws IOException{
    	String cadena = "";
    	System.out.println(numeroRegistros);
    	while((cadena = ClinicaVeterinaria.flujoClinica.readLine()) != null) {
    		System.out.println(cadena);
            if(nombre.equals(cadena.trim())){
                return true;
             }
    	}
         return false;
    }
    
    public static boolean buscarPorTipoAnimal(String tipoAnimal) throws IOException{
        if(tipoAnimal == null){
            return false;
        }else{
            for (int i = 0; i < getNumeroRegistros(); i++) {
                flujoClinica.seek(i * sizeRegistro);
                String tAnimalRegistro = flujoClinica.readUTF().toLowerCase();
                if(tipoAnimal.toLowerCase() == tAnimalRegistro){
                    flujoClinica.toString();
                }else{
                    return false;
                }
            }
            return true;
        }
    }*/
}
