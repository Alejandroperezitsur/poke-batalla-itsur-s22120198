
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;


public class Moltres extends Pokemon {
    public Moltres() {
        this.tipo = "FUEGO/VOLADOR";
        this.hp = 90;
        this.ataque = 100;
        this.defensa = 90;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ONDA IGNEA");
        this.habilidades.add("ATAQUE AEREO");
    }

  
    public Moltres(String nombre){
        this(); 
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ONDA IGNEA")){
            System.out.println("Realizando ONDA IGNEA");
        }else if(habilidad.equals("ATAQUE AEREO")){
            System.out.println("Realizando ATAQUE AEREO");            
        }
    }
}
