
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueAla;
import mx.edu.itsur.pokebatalla.model.moves.DanzaLluvia;
import mx.edu.itsur.pokebatalla.model.moves.Lanzallamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author alejandro
 */
public class Moltres extends Pokemon {

    private final ArrayList<Object> habilidades;

    @Override
    public Enum[] getMovimientos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atacar(Mew mono, Movimientos movimientos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
    
    @Override
     public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Moltres esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Moltres.Movimientos movimientoAUtilizar
                = Moltres.Movimientos.values()[ordinalMovimiento];

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
