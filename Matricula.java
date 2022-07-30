
package colegio;
import java.util.*;
public class Matricula {
    
    private HashMap<Integer, Estudiante> dict = new HashMap<Integer, Estudiante>();
    
    public Matricula(){
        
        dict.put(1, new Estudiante(1, "Laura", "Castro", 5)); 
        dict.put(2, new Estudiante(2, "Esteban", "Garcia", 9));     
        dict.put(3, new Estudiante(3, "Victor", "Lopez", 7));     
        dict.put(4, new Estudiante(4, "Roberto", "Morales", 4));     
        
    }    
    public void agregar(Estudiante tripulante){
        dict.put(tripulante.getCedula(), tripulante);
    }
    public void borrar(Estudiante tripulante){
        dict.remove(tripulante.getCedula());
    }
    public void actualizar(Estudiante tripulante){
        dict.replace(tripulante.getCedula(), tripulante);
    }
    
   public int sumaCreditos(){
       int totalcreditos = 0;
       for (Estudiante tripulante: dict.values()){
             totalcreditos += tripulante.getCreditos();
       }
       return totalcreditos;
   }
   public void mostrarCreditos(){
       for (Estudiante tripulante: dict.values()){
            System.out.println(tripulante.getNombre() + " " + tripulante.getCreditos());
       }
       System.out.println("Total creditos del grupo: " + sumaCreditos());
   }
   
   public boolean verificarLlave(Estudiante tripulante){
       boolean existe = dict.containsKey(tripulante.getCedula());
       return existe;
   }
  
 }
