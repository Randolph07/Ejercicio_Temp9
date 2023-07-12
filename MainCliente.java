package Ejercicio_Tem9;

public class MainCliente {

    public static void main(String[] args){

        //codigo de la clase cliente
        Cliente cliente = new Cliente();
        cliente.setEdad(37);
        cliente.setNombre("Miguel Anguel");
        cliente.setTelefono("903-9794-498759");
        cliente.setCredito(23456.87);


        System.out.println("El nombre de la persona es "+ cliente.GetNombre()+ " con una edad de "
                +cliente.getEdad()+ " su numero de telefono es "+ cliente.getTelefono()+
                "  tiene un credito de "+ cliente.getCredito());

    }




}
