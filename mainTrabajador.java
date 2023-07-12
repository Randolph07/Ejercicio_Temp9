package Ejercicio_Tem9;

public class mainTrabajador {

    publis static void main(String[] args){
        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Jhon Michael");
        trabajador.setEdad(47);
        trabajador.setTelefono("2-985-4905-495896");
        trabajador.setSalario(50329.85);

        System.out.println("El nombre de la persona es "+ trabajador.GetNombre()+ " con una edad de "
                +trabajador.getEdad()+ " su numero de telefono es "+ trabajador.getTelefono()+
                "  tiene un salario de "+ trabajador.getSalario());

    }

}
