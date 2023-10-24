
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Amnesia;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.RayoIce;
import mx.edu.itsur.pokebatalla.model.moves.Terremoto;

public class Mew extends Pokemon{
    public enum Movimientos{
        Amnesia,
        Terremoto,
        RayoIce,
    }
    public Mew() {
        this.tipo = "PSIQUICO";
        this.hp = 100;
        this.ataque = 100;
        this.defensa = 100;
        this.nivel = 1;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
    }

    public Mew(String nombre){
        this(); 
        this.nombre = nombre;
    }

     public void atacar(Pokemon oponente, Mew.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case Amnesia:
                instanciaMovimiento = new Amnesia();
                break;
            case Terremoto:
                instanciaMovimiento = new Terremoto();
                break;
            case RayoIce:
                instanciaMovimiento = new RayoIce();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
