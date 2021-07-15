/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesion.grupo13;

/**
 *
 * @author INVER. HERNANDEZ
 */
public class ProfesionGrupo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor d= new Doctor();
        Deportista p= new Deportista();
        
        System.out.println("Individuo 1");
        d.imprimirinformacion();
       
        
        System.out.println("Individuo 2");
        p.imprimirinformacion(); 
    }
    
}
