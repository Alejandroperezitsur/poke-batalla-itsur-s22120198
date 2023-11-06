
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

public class Entrenador {
    //Atributos
    protected List<Pokemon> pokemonsCapturados;
    
    //Metodos
    public void capturarPokemon(Pokemon pk){
        pokemonsCapturados.add(pk);
    }
    
}
