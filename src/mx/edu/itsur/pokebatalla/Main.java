
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Horsea;
import mx.edu.itsur.pokebatalla.model.pokemons.Mew;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        
                
        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO);
        
        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO);
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO);
        
        Mew mono = new Mew();
        Horsea caballo = new Horsea();
        Moltres ave = new Moltres();
        
        System.out.println("->Mew se encuentra en el ring con Moltres y ataca");
        mono.atacar(ave, Mew.Movimientos.Amnesia);
        
        System.out.println("->Moltres se molesto por ese tremendo golpe y responde  ");
        ave.atacar(mono, Moltres.Movimientos.Lanzallamas);
     
        System.out.println("->Horsea se enojo porque golpearon a su amigo mono e interviene en la pelea...");
        caballo.atacar(ave, Horsea.Movimientos.Cascada);
    }
    
}
