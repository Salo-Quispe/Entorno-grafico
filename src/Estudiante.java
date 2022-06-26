public class Estudiante {
    private int cedula;
    private String name;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String institucion;

    public Estudiante(int cedula, String name, int edad, String genero, String nacionalidad, String institucion) {
        this.cedula = cedula;
        this.name = name;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.institucion = institucion;
    }

    public int getCedula() {
        return cedula;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getInstitucion() {
        return institucion;
    }

    @Override
    public String toString() {
        return "\nNumero de Cedula >>"+getCedula()+"\nNombre >> "+getName()+"\nEdad >> "+getEdad()+"\nGenero >> "+getGenero()
                +"\nNacionalidad >> " +getNacionalidad() +"\nInstitucion >> "+getInstitucion();
    }
}
