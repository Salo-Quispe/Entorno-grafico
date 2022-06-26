import javax.swing.*;
import java.util.ArrayList;

public class Procesos {
    private static int cedula(int i){
        int cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de Cedula del Estudiante : ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE));
        return cedula;
    }
    private static String name(int i){
        String name=JOptionPane.showInputDialog(null,"Ingresa el Nombre del Estudiante: ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE);
        return name;
    }
    private static int edad(int i){
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del Estudiante : ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE));
        return edad;
    }
    private static String genero(int i){
        String genero=JOptionPane.showInputDialog(null,"Ingresa el Genero del Estudiante: ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE);
        return genero;
    }
    private static String nacionalidad(int i){
        String nacionalidad=JOptionPane.showInputDialog(null,"Ingresa la Nacionalidad del Estudiante: ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE);
        return nacionalidad;
    }
    private static String institucion(int i){
        String institucion=JOptionPane.showInputDialog(null,"Ingresa la institucion del Estudiante: ","Estudiante "+i,JOptionPane.QUESTION_MESSAGE);
        return institucion;
    }
    public ArrayList<Estudiante> estudiantes(){
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        for(int i=0;i<5;i++){
            Estudiante estudiante1 = new Estudiante(cedula(i+1),name(i+1),edad(i+1),genero(i+1),nacionalidad(i+1),institucion(i+1));
            estudiantes.add(estudiante1);
        }
        return estudiantes;
    }
    public void  mostrar(ArrayList<Estudiante> estudiantes){
        int i=1;
        for(Estudiante est: estudiantes){
            JOptionPane.showMessageDialog(null,est.toString(),">>> Estudiante "+(i),JOptionPane.INFORMATION_MESSAGE);
            i++;
        }

    }

}
