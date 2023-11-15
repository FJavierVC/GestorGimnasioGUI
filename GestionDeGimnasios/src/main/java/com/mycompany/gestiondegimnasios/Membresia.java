
package com.mycompany.gestiondegimnasios;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Membresia extends Usuario {
    public Membresia(String nombre, String direccion, String email, String telefono, int idUsuario, String tipoMembresia, String fechaRegistro) {
        super(nombre, direccion, email, telefono, idUsuario, tipoMembresia, fechaRegistro);
    }

    public LocalDate getFechaFinalizacion() {
        // Obtén la fecha de registro de usuario
        Usuario usuario = new Usuario(getNombre(), getDireccion(), getEmail(), getTelefono(), getIdUsuario(), getTipoMembresia(), getFechaRegistro());
        LocalDate fechaRegistro = LocalDate.parse(usuario.getFechaRegistro());

        // Calcula la fecha de finalización de la membresía
        LocalDate fechaFinalizacion = fechaRegistro.plusDays(30);
        return fechaFinalizacion;
    }

    public void mostrarFechasMembresia() {
        LocalDate fechaInicio = LocalDate.parse(getFechaRegistro());
        LocalDate fechaFinalizacion = getFechaFinalizacion();

        String membresiaDate = "Fecha de inicio de membresía: " + fechaInicio + "\n"
                + "Fecha de finalización de membresía: " + fechaFinalizacion;
        JOptionPane.showMessageDialog(null, membresiaDate, "Periodo Membresia", JOptionPane.INFORMATION_MESSAGE);
    }
}