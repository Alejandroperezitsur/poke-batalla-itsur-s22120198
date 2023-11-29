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
public class Horsea extends Pokemon implements Serializable{
    public enum Movimientos{
        Proteccion,
        GolpeCabeza,
        Cascada,
    }

    public Horsea() {
        tipo = "AGUA";
        hp = 38;
        ataque = 40;
        defensa = 70;
        nivel = 1;
        precision = 3;
    }

    //Constructor alterno 1
    public Horsea(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
      @Override
        public Enum[] getMovimientos() {
                return Horsea.Movimientos.values();
        }
        @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        Horsea.Movimientos movimientoAUtilizar = Horsea.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case Cascada:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case GolpeCabeza:
                instanciaMovimiento = new OndaIgnea();
                break;
                case Proteccion:
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