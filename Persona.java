package Ejercicio_Tem9;

public class Persona {

    private int edad ;
    static private String nombre;
    private String telefono;


    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String GetNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}