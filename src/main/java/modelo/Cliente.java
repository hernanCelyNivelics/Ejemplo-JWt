/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author herna
 */
public class Cliente {
    
   private int Identificacion;
   private String Nombres;
   private String Apellidos;
   private String Direcion;
   private String Zona;
   private int Estrato;
   Medidor medidor;

    public Medidor getMedidor() {
        return medidor;
    }

    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDirecion() {
        return Direcion;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public void agregar_medidor(String Medidor)
    {        
       medidor = new Medidor();
        medidor.setSerial(Medidor);
        medidor.setEstado(1);
        medidor.setTipo("Convencional");
    }
    
}