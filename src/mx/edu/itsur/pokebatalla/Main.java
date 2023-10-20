/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Horsea;
import mx.edu.itsur.pokebatalla.model.pokemons.Mew;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
  
        Charmander charmanderSalvaje = new Charmander() ;
        
        
        
        
        Pikachu pikachuSalvaje = new Pikachu();
        pikachuSalvaje.setNombre("Pedro");
        Pikachu miPikachu = pikachuSalvaje;
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        Horsea horseaSalvaje = new Horsea();
        horseaSalvaje.setNombre("Juan");
        Horsea miHorsea = horseaSalvaje;
        miHorsea.atacar(pikachuSalvaje);
        miHorsea.atacar(pikachuSalvaje, "RAYO BURBUJA");
        
        Mew mewSalvaje = new Mew();
        Mew miMew = mewSalvaje;
        mewSalvaje.setNombre("Beto");
        miMew.atacar(pikachuSalvaje);
        miMew.atacar(pikachuSalvaje, "AMNESIA");
        
        Molter molterSalvaje = new Molter();
        molterSalvaje.setNombre("Paco");
        Molter miMolter = molterSalvaje;
        miMolter.atacar(pikachuSalvaje);
        miMolter.atacar(pikachuSalvaje, "ONDA IGNEA");
        
        
        
        
       
        
        
        
    }

    private static class Molter {

        public Molter() {
        }

        private void atacar(Pikachu pikachuSalvaje) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void atacar(Pikachu pikachuSalvaje, String onda_ignea) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setNombre(String paco) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
