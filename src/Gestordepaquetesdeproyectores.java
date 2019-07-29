
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Punto Digital
 */
public class Gestordepaquetesdeproyectores {
        ArrayList<Paquetedeproyectos> paquetes= new ArrayList<>();
        String nombredeempresa;

    public Gestordepaquetesdeproyectores(String nombredeempresa) {
        this.nombredeempresa = nombredeempresa;
    }

    public ArrayList<Paquetedeproyectos> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquetedeproyectos> paquetes) {
        this.paquetes = paquetes;
    }

    public String getNombredeempresa() {
        return nombredeempresa;
    }

    public void setNombredeempresa(String nombredeempresa) {
        this.nombredeempresa = nombredeempresa;
    }
        
        
    
}
