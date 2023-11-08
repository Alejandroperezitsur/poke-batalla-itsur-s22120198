
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PsycoRayo;


public class Psyduck extends Pokemon {

    public enum Movimientos {
        PSICORAYO
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Obtener el movimiento de acuerdo a su numero ordinal
		Psyduck.Movimientos movimientoAUtilizar = Psyduck.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case PSICORAYO:
                instanciaMovimiento = new PsycoRayo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        atacar(oponente, instanciaMovimiento);
    }

    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }
}