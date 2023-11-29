
package mx.edu.itsur.pokebatalla.model.moves;

import java.io.Serializable;

/**
 *
 * @author alejandro
 */
public class Latigo extends MovimientoEstado implements Serializable{

    public Latigo() {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 30;        
    } 
    
}