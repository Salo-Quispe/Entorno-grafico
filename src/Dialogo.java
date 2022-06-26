import javax.swing.*;
import java.util.ArrayList;

public class Dialogo {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes;
        Procesos procesos = new Procesos();
        estudiantes=procesos.estudiantes();
        procesos.mostrar(estudiantes);
    }
}
