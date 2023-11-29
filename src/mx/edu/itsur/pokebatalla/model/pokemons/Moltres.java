package mx.edu.itsur.pokebatalla.model.Pokemons;


import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.OndaIgnea;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;



/**
 *
 * @author alejandro perez vazquez
 */
public class Moltres extends Pokemon implements Serializable{
     public enum Movimientos{
        DanzaLluvia,
        AtaqueAla,
        Lanzallamas,
    }

    public Moltres() {
        tipo = "FUEGO";
        hp = 90;
        ataque = 100;
        defensa = 90;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Moltres(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
      @Override
        public Enum[] getMovimientos() {
            return Moltres.Movimientos.values();
        }
        @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        Moltres.Movimientos movimientoAUtilizar = Moltres.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case AtaqueAla:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case DanzaLluvia:
                instanciaMovimiento = new OndaIgnea();
                break;
                case Lanzallamas:
                instanciaMovimiento = new Latigo();
                break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
    
}