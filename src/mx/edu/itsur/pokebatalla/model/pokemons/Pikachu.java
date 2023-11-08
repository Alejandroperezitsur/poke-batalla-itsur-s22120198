
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;


public class Pikachu extends Pokemon {

    public void atacar(Charmander charm, Movimientos movimientos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        LATIGO

        //Otros movimientos...
    }

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Pikachu(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
//Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
		Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}