
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;

public class Mew extends Pokemon{
    public Mew() {
        this.tipo = "PSIQUICO";
        this.hp = 100;
        this.ataque = 100;
        this.defensa = 100;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("AMNESIA");
        this.habilidades.add("SELLO PSIQUICO");
    }

    public Mew(String nombre){
        this(); 
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("AMNESIA")){
            System.out.println("Realizando AMNESIA");
        }else if(habilidad.equals("SELLO PSIQUICO")){
            System.out.println("Realizando SELLO PSIQUICO");            
        }
    }
}
