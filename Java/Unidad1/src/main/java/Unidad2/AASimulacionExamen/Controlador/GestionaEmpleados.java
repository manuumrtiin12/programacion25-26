package main.java.Unidad2.AASimulacionExamen.Controlador;

import main.java.Unidad2.AASimulacionExamen.Modelo.*;

public class GestionaEmpleados {

    public static void main(String[] args) {


            Empleado[] empleados = new Empleado[5];

            Departamento departamento = new Departamento("Informática", empleados);

            Administrativo admin = new Administrativo("111A", "Carlos", 1150);
            Operario operario = new Operario("222B", "Ana", 1100);
            Contable contable = new Contable("333C", "Luis", 1350);
            JefeDepartamento jefe = new JefeDepartamento("444D", "Marta", 1500);

            jefe.setAnyosAntiguedad(10);

            empleados[0] = admin;
            empleados[1] = operario;
            empleados[2] = contable;
            empleados[3] = jefe;



            System.out.println("---- ORDENADOS POR NOMBRE ----");
            System.out.println(departamento.toString());



            System.out.println("---- ORDENADOS POR SUELDO ----");
            System.out.println(departamento.toStringSueldo());



            System.out.println("---- ACTUALIZANDO SUELDO DE ANA (10%) ----");
            operario.ActualizarSueldo(10);

            System.out.println(departamento.toStringSueldo());


    }
}