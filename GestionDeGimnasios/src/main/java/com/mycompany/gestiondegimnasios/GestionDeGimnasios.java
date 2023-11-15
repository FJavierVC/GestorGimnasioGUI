
package com.mycompany.gestiondegimnasios;
/**
 *
 * @author Francisco Javier Valdez Cuellar
 * @author Jose Diego Toledo Muñoz
 * 
<<<<<<< Upstream, based on origin/master
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class GestionDeGimnasios {
    private String nombre;
    private String direccion;
    private int idSucursal;
    private String email;
    private String telefono;
    private List<Empleado> empleados;
    private List<Usuario> usuarios;

    public GestionDeGimnasios(String nombre, String direccion, int idSucursal, String email, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idSucursal = idSucursal;
        this.email = email;
        this.telefono = telefono;
        this.empleados = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void quitarEmpleado(int idEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdEmpleado() == idEmpleado) {
                empleados.remove(empleado);
                return;
            }
        }
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void quitarUsuario(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                usuarios.remove(usuario);
                return;
            }
        }
    }

    public void verInformacionUsuarios() {
        StringBuilder info = new StringBuilder("Información de Usuarios:\n\n");
        for (Usuario usuario : usuarios) {
            info.append("ID de Usuario: " + usuario.getIdUsuario() + "\n");
            info.append("Nombre: " + usuario.getNombre() + "\n");
            info.append("Membresia: " + usuario.getTipoMembresia() + "\n");
            info.append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString(), "Información de Usuarios", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void verInformacionEmpleados() {
    StringBuilder info = new StringBuilder("Información de Empleados:\n\n");
    for (Empleado empleado : empleados) {
        info.append("ID de Empleado: " + empleado.getIdEmpleado() + "\n");
        info.append("Nombre: " + empleado.getNombre() + "\n");
        info.append("Puesto: " + empleado.getPuesto() + "\n");
        info.append("\n");
    }
    JOptionPane.showMessageDialog(null, info.toString(), "Información de Empleados", JOptionPane.INFORMATION_MESSAGE);
}
    
        public void mostrarFechasMembresiaUsuario(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                // Encontramos al usuario en la lista
                Membresia membresia = new Membresia(
                    usuario.getNombre(),
                    usuario.getDireccion(),
                    usuario.getEmail(),
                    usuario.getTelefono(),
                    usuario.getIdUsuario(),
                    usuario.getTipoMembresia(),
                    usuario.getFechaRegistro()
                );
                membresia.mostrarFechasMembresia();
                return;
            }
        }
        // Mostrar un mensaje si el usuario no se encuentra
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        GestionDeGimnasios gimnasio = new GestionDeGimnasios("Toledo's Fitness", "Direccion Falsa 666", 1, "ToledosFitness@gmail.com", "222-3333-444");
        
        JOptionPane.showMessageDialog(null, "¡Bienvenido a " + gimnasio.nombre +"!");
    
        boolean continuar = true;
        while (continuar) {
            String opcion = JOptionPane.showInputDialog("Menú:\n" +
                    "1. Agregar Empleado\n" +
                    "2. Quitar Empleado\n" +
                    "3. Agregar Usuario\n" +
                    "4. Quitar Usuario\n" +
                    "5. Ver Información de Usuarios\n" +
                    "6. Ver Información de Empleados\n" +
                    "7. Informacion Membresia\n" +
                    "8. Salir");

            if (opcion == null) {
                continuar = false;
            } else {
                switch (opcion) {
                case "1":
                Empleado nuevoEmpleado = new Empleado("Nombre por defecto", "Dirección por defecto", "Email por defecto", "Teléfono por defecto", 0, 0.0, "Puesto por defecto");
                nuevoEmpleado.solicitarInformacion(); 
                gimnasio.agregarEmpleado(nuevoEmpleado);
                JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
                    break;
                case "2":
                int idEliminarEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar:"));
                gimnasio.quitarEmpleado(idEliminarEmpleado);
                JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente.");  
                    break;
                case "3":
                Usuario nuevoUsuario = new Usuario("Nombre por defecto", "Dirección por defecto", "Email por defecto", "Teléfono por defecto", 0, "Membresía por defecto", "Fecha por defecto");
                nuevoUsuario.solicitarInformacion();
                gimnasio.agregarUsuario(nuevoUsuario); 
                JOptionPane.showMessageDialog(null, "Usuario agregado correctamente.");
                    break;
                case "4":
                int idEliminarUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario a eliminar:"));
                gimnasio.quitarUsuario(idEliminarUsuario);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
                    break;
                case "5":
                    gimnasio.verInformacionUsuarios();
                    break;
                case "6":
                    gimnasio.verInformacionEmpleados();
                    break;
                 case "7":
                     int idUsuarioaMostrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario para mostrar las fechas de membresía:"));
                     gimnasio.mostrarFechasMembresiaUsuario(idUsuarioaMostrar);
                     break;
                 case "8":
                     JOptionPane.showMessageDialog(null, "Hasta pronto.");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

}