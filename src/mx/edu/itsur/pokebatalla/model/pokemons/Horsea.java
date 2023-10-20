
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;

public class Horsea extends Pokemon {
    public Horsea() {
        this.tipo = "AGUA";
        this.hp = 30;
        this.ataque = 40;
        this.defensa = 70;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("RAYO BURBUJA");
        this.habilidades.add("HIDROBOMBA");
    }

    public Horsea(String nombre){
        this();
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("RAYO BURBUJA")){
            System.out.println("Realizando RAYO BURBUJA");
        }else if(habilidad.equals("HIDROBOMBA")){
            System.out.println("Realizando HIDROBOMBA");            
        }
    }
}
