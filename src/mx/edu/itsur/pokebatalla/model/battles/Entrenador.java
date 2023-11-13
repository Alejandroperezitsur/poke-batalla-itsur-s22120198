
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import java.util.Scanner;
import mx.edu.itsur.pokebatalla.model.pokemons.Horsea;
import mx.edu.itsur.pokebatalla.model.pokemons.Mew;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author alejandro
 */
public class Entrenador {
    
    //Atributos
		protected String nombre;
		protected List<Pokemon> pokemonsCapturados;
                protected List<Pokemon> pokemonsDisponibles;
		protected Pokemon pokemonActual;  //Representa el pokemon activo para batalla.
    private Pokemon pokemon;

                public Entrenador(String nombre){
                    this.nombre = nombre;
                }
                public String getNombre(){
                    return nombre;
                }
                public void asignarPokemon(Scanner scanner, List<Pokemon> pokemon){
                    System.out.println(nombre + ", elija su Pokemon: ");
                    
                    //Mostrar la lista de pokemon disponibles
                    for(int i = 0; i<pokemonsDisponibles.size(); i++){
                        System.out.println(i + ", "+pokemonsDisponibles.get(i));
                    }
                    System.out.println("Elija el numero del Pokemon: ");
                    int indicePokemon = scanner.nextInt();
                    
                    //Obtener el Pokemon elegido por el entrenador
                    Pokemon pokemonElegido = pokemonsDisponibles.get(indicePokemon);
                    
                    this.pokemon = pokemonElegido;
                }

    public Pokemon getPokemonActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mostrarPokemonesDisponibles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void elegirPokemon(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void capturarPokemon(Pikachu a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void capturarPokemon(Mew b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void capturarPokemon(Horsea c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void capturarPokemon(Moltres d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
    
    
    
    
}
