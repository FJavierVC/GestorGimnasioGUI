package com.mycompany.gestiondegimnasios;

import javax.swing.JOptionPane;

public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;
    private String puesto;

    public Empleado(String nombre, String direccion, String email, String telefono, int idEmpleado, double salario, String puesto) {
        super(nombre, direccion, email, telefono);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.puesto = puesto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }
        public boolean validarEmail(String email) {
        String patronEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(patronEmail);
    }

    @Override
    public void solicitarInformacion() {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        } while (nombre == null || nombre.trim().isEmpty()); 


        nombre = capitalizarNombre(nombre);
        
        String email;
        do {
            email = JOptionPane.showInputDialog("Ingrese el email del empleado:");
        } while (!validarEmail(email));  // Validar el email antes de salir del bucle

        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del empleado:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado:");
        int idEmpleado;
do {
    String idEmpleadoStr = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
    try {
        idEmpleado = Integer.parseInt(idEmpleadoStr);
        if (idEmpleado <= 0) {
            JOptionPane.showMessageDialog(null, "El ID del empleado debe ser un número positivo.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID del empleado debe ser un número válido.");
        idEmpleado = -1; // Valor inválido para repetir el bucle
    }
} while (idEmpleado <= 0);

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");

        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setEmail(email);
        this.setTelefono(telefono);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.puesto = puesto;
        //asddfg
        
    }
}