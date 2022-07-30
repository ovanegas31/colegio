package colegio;

import java.util.*;

public class Colegio {

    public static void main(String[] args) {

        Matricula mat = new Matricula();

        Scanner entrada = new Scanner(System.in);
        String operacion = entrada.nextLine();
        String[] vector = entrada.nextLine().split(" ");

        Estudiante tripulante = new Estudiante(Integer.parseInt(vector[0]),
                vector[1], vector[2], Integer.parseInt(vector[3]));

        if (operacion.equals("AGREGAR") && !mat.verificarLlave(tripulante)) {
            mat.agregar(tripulante);
            mat.mostrarCreditos();
        } else if (operacion.equals("BORRAR") && mat.verificarLlave(tripulante)) {
            mat.borrar(tripulante);
            mat.mostrarCreditos();
        } else if (operacion.equals("ACTUALIZAR") && mat.verificarLlave(tripulante)) {
            mat.actualizar(tripulante);
            mat.mostrarCreditos();
        } else {
            System.out.println("ERROR EN LOS DATOS");
        }

    }

}
