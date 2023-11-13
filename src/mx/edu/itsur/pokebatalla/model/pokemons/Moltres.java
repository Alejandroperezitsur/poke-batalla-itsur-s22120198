
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueAla;
import mx.edu.itsur.pokebatalla.model.moves.DanzaLluvia;
import mx.edu.itsur.pokebatalla.model.moves.Lanzallamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;


public class Moltres extends Pokemon {
    public enum Movimientos{
        DanzaLluvia,
        AtaqueAla,
        Lanzallamas,
    }
    public Moltres() {
        this.tipo = "FUEGO/VOLADOR";
        this.hp = 90;
        this.ataque = 100;
        this.defensa = 90;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
    }

  
    public Moltres(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, Moltres.Movimientos movimientoAUtilizar) {

         //Obtener el movimiento de acuerdo a su numero ordinal
		Moltres.Movimientos movimientoAUtilizar = Moltres.Movimientos.values()[ordinalMovimiento];

		switch (movimientoAUtilizar) {
				case IMPACTRUENO:
					instanciaMovimiento = new Impactrueno();
					break;
				case ATAQUE_RAPIDO:

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case DanzaLluvia :
                instanciaMovimiento = new DanzaLluvia();
                break;
            case AtaqueAla:
                instanciaMovimiento = new AtaqueAla();
                break;
            case Lanzallamas:
                instanciaMovimiento = new Lanzallamas();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
