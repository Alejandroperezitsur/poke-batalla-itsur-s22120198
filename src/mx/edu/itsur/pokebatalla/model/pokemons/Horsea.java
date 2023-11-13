
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.Cascada;
import mx.edu.itsur.pokebatalla.model.moves.GolpeCabeza;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Proteccion;

public class Horsea extends Pokemon {

    private final ArrayList<Object> habilidades;

    @Override
    public Enum[] getMovimientos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atacar(Moltres ave, Movimientos movimientos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public enum Movimientos{
        Proteccion,
        GolpeCabeza,
        Cascada,
    }
    public Horsea() {
        this.tipo = "AGUA";
        this.hp = 30;
        this.ataque = 40;
        this.defensa = 70;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
    }

    public Horsea(String nombre){
        this();
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Horsea esta agotado y no puede realizar mas movimientos.");
            return;
        }

        //Obtener el movimiento de acuerdo a su numero ordinal
        Horsea.Movimientos movimientoAUtilizar
                = Horsea.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;      
        
        switch (movimientoAUtilizar) {
            case Proteccion:
                instanciaMovimiento = new Proteccion();
                break;
            case GolpeCabeza:
                instanciaMovimiento = new GolpeCabeza();
                break;
            case Cascada:
                instanciaMovimiento = new Cascada();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}
