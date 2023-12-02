package mx.edu.itsur.pokebatalla.model.Pokemons;


import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.OndaIgnea;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;



/**
 *
 * @author alejandro perez vazquez
 */
public class Mew extends Pokemon {
     public enum Movimientos{
        Amnesia,
        Terremoto,
        RayoIce,
    }

    public Mew() {
        tipo = "PSIQUICO";
        hp = 100;
        ataque = 100;
        defensa = 100;
        nivel = 1;
        precision = 5;
    }

    //Constructor alterno 1
    public Mew(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
      @Override
        public Enum[] getMovimientos() {
            return Mew.Movimientos.values();
        }
        @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        Mew.Movimientos movimientoAUtilizar = Mew.Movimientos.values()[ordinalMovimiento];
        switch (movimientoAUtilizar) {
            case Amnesia:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case RayoIce:
                instanciaMovimiento = new OndaIgnea();
                break;
                case Terremoto:
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