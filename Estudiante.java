
package colegio;

public class Estudiante {
        
        private int cedula;
        private String nombre;
        private String apellido;
        private int creditos;

    public Estudiante(int cedula, String nombre, String apellido, int creditos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.creditos = creditos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
           
}
