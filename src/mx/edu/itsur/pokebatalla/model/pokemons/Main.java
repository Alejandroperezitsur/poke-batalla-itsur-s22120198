package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;
import mx.edu.itsur.pokebatalla.model.Battles.Entrenador;

/**
 *
 *  * @author alejandro perez vazquez
 */
public class Main implements Serializable {

    public static void main(String[] args) {
        //Unidad 5 

        Pikachu a = new Pikachu("EDD");
        Mew b = new Mew("ED");
        Moltres c = new Moltres("EDDY");
        Horsea d = new Horsea("GOTA");
        Charmander e = new Charmander("HOJA");

        Entrenador en1 = new Entrenador("TACO");
        en1.capturarPokemon(a);
        en1.capturarPokemon(e);

        Entrenador en2 = new Entrenador("TAKI");
        en2.capturarPokemon(b);
        en2.capturarPokemon(c);

        Batalla x = new Batalla(en1, en2);
        x.desarrollarBatalla();

        
    }

}
