package com.mycompany.gestiondegimnasios;

public class Pago {
    private String fecha;
    private double monto;
    private String metodoPago;

    public Pago(String fecha, double monto, String metodoPago) {
        this.fecha = fecha;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
