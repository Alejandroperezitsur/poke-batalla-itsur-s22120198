/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
 import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.pokemons.Horsea;
import mx.edu.itsur.pokebatalla.model.pokemons.Mew;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;


/**
 *
 * @author alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        
        
        Pikachu a = new Pikachu("JUAN");
        Mew b = new Mew("PACO");
        Horsea c = new Horsea("CENTA");
        Moltres d = new Moltres("AVE");
        
         Entrenador en1 = new Entrenador("PIEDRA");
        en1.capturarPokemon(a);
        en1.capturarPokemon(b);

        Entrenador en2 = new Entrenador("PAPEL");
        en2.capturarPokemon(c);
        en2.capturarPokemon(d);

        Batalla v = new Batalla(en1, en2);
        v.desarrollarBatalla();
        
        
        
    }
    
}
