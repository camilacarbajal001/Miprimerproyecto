/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Punto Digital
 */
public class Paquetedeproyectos{
    int CodPaquetedeProyectores;
    String Destinatario;
    String destino;
    float costoEnvio;
    boolean enTransito;

    public Paquetedeproyectos(int CodPaquetedeProyectores, String Destinatario, String destino, float costoEnvio, boolean enTransito) {
        this.CodPaquetedeProyectores = CodPaquetedeProyectores;
        this.Destinatario = Destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
        this.enTransito = enTransito;
    }

    public int getCodPaquetedeProyectores() {
        return CodPaquetedeProyectores;
    }

    public void setCodPaquetedeProyectores(int CodPaquetedeProyectores) {
        this.CodPaquetedeProyectores = CodPaquetedeProyectores;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }
    
 
}
