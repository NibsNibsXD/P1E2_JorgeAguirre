/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p1_jorge_aguirre;

import java.util.Random;




/**
 *
 * @author Jorge Aguirre
 */
public class Empleado {
    private static final Random random = new Random();
    private final int numeroIdentificador;
    private String nombre;
    private String puesto;
    private double salario;
    private String departamento;
    
    public Empleado(String nombre, String puesto, double salario, String departamento){
        this.numeroIdentificador = 20 + random.nextInt(131); //llegando hasta 150
        this.nombre = nombre;
        this.puesto = puesto;
        this.departamento = departamento;        
    }
    
    //Aqui ira los metodos get & set
    public int getNumIdent(){
        return numeroIdentificador;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuest(String puesto){
        this.puesto = puesto;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    
}
