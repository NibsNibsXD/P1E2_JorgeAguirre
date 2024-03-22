/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2p1_jorge_aguirre;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jorge Aguirre
 */
public class Examen2P1_Jorge_Aguirre {
    
    public static ArrayList<Empleado> empleados = new ArrayList();
    public static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        while(!salir){
            System.out.println("Sistema de recursos Humanos");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. mostrar todos los empleado");
            System.out.println("4. modificar empleado");
            System.out.println("5. Retirar empelado");
            System.out.println("6. Listar empleados por departamento");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                    agregarEmpleado();
                    break;
                    
            }
           
        }
    
    }
    
    private static void agregarEmpleado(){
        System.out.println("\n Agregar nuevo Empleado");
        
        System.out.println("Ingrese el nombre del empleado");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el puesto del empleado");
        String puesto = scanner.nextLine();
        
        System.out.println("Ingrese el salario del empleado");
        double salario = scanner.nextDouble();
        scanner.nextLine(); //Aqui solo quiero limpiar el buffer
        
        System.out.println("Ingrese el departamento del empleado");
        String departamento = scanner.nextLine();
        
        Empleado nuevoEmpleado = new Empleado(nombre, puesto, salario, departamento);
        empleados.add(nuevoEmpleado);
        
        System.out.println("Empleado agregado tendra el sigueinte ID: " + nuevoEmpleado.getNumIdent());
        
    }
    
    
}




/*
Desarrolle un programa que simule un sistema de recursos humanos de una empresa:

El programa debe ser capaz de:

Agregar empleados al sistema: permitiendo ingresar detalles como nombre, puesto, salario, y departamento al que pertenecen.

Buscar empleados:por nombre, número de identificación.

Mostrar una lista con todos los empleados registrados en la empresa. Utiliza una estructura de datos adecuada para almacenar la información de los empleados, como un ArrayList.

Modificar la información de los empleados: esta opción permitirá al usuario elegir en un submenú qué atributos del empleado desea cambiar, como el salario, el puesto, el departamento, etc.

Registrar el retiro de un empleado: el programa deberá mostrar la lista de empleados y permitir al usuario retirar a un empleado específico de la empresa(elimina al empleado de la lista).

Listar empleados por departamento: El usuario ingresará el nombre de un departamento y el programa deberá mostrar los empleados que hay en ese departamento, si no hay ningún empleado en ese departamento el programa deberá mostrar un mensaje diciendo "Departamento vacío"

Cada empleado deberá tener los siguientes atributos:

Número de identificación (generado automáticamente, sera un número entre 20 y 150).
Nombre del empleado.
Puesto que ocupa.
Salario.
Departamento al que pertenece.


*/