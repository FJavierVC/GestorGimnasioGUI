package com.mycompany.gestiondegimnasios;


public abstract class Persona {
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;

    public Persona(String nombre, String direccion, String email, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract void solicitarInformacion();

    public String capitalizarNombre(String nombre) {
        String[] palabras = nombre.split(" ");
        StringBuilder nombreFormateado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                String primeraLetra = palabra.substring(0, 1).toUpperCase();
                String resto = palabra.substring(1).toLowerCase();
                nombreFormateado.append(primeraLetra).append(resto).append(" ");
            }
        }

        return nombreFormateado.toString().trim();
    }


}