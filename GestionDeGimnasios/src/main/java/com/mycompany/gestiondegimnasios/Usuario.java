package com.mycompany.gestiondegimnasios;
import javax.swing.JOptionPane;


public class Usuario extends Persona {
    private int idUsuario;
    private String tipoMembresia;
    private String fechaRegistro;

    public Usuario(String nombre, String direccion, String email, String telefono, int idUsuario, String tipoMembresia, String fechaRegistro) {
        super(nombre, direccion, email, telefono);
        this.idUsuario = idUsuario;
        this.tipoMembresia = tipoMembresia;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public boolean validarFormatoFecha(String fecha) {

    String patronFecha = "\\d{4}-\\d{2}-\\d{2}";

    if (fecha.matches(patronFecha)) {

        return true;
    } else {

        return false;
    }
}
    @Override
    public void solicitarInformacion() {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
        } while (nombre == null || nombre.trim().isEmpty());  // Validar que el nombre no esté vacío

        nombre = capitalizarNombre(nombre);
        
        String telefono;
do {
    telefono = JOptionPane.showInputDialog("Ingrese el teléfono del usuario (10 dígitos):");
    if (telefono != null && !telefono.trim().isEmpty() && telefono.length() != 10) {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener exactamente 10 dígitos.");
    }
} while (telefono != null && !telefono.trim().isEmpty() && telefono.length() != 10);

        int idUsuario;
do {
    String idUsuarioStr = JOptionPane.showInputDialog("Ingrese el ID del usuario:");
    try {
        idUsuario = Integer.parseInt(idUsuarioStr);
        if (idUsuario <= 0) {
            JOptionPane.showMessageDialog(null, "El ID del usuario debe ser un número positivo.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID del usuario debe ser un número válido.");
        idUsuario = -1; // Valor inválido para repetir el bucle
    }
} while (idUsuario <= 0);
        
        String tipoMembresia = JOptionPane.showInputDialog("Ingrese el tipo de membresía del usuario:");
        
        String fechaRegistro;
        
        do {
        
            fechaRegistro = JOptionPane.showInputDialog("Ingrese la fecha de registro del usuario (yyyy-MM-dd):");
        
        } while (!validarFormatoFecha(fechaRegistro));
        
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.idUsuario = idUsuario;
        this.tipoMembresia = tipoMembresia;
        this.fechaRegistro = fechaRegistro;
    }
}