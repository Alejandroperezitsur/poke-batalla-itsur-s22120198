/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alejandro
 */
package mx.edu.itsur.pokebatalla.model.moves;

import java.io.Serializable;

public class Amnesia extends MovimientoEstado implements Serializable {
        public Amnesia() {
        this.tipo=Movimiento.TiposDeMovimiento.PSIQUICO;
        this.potencia = 0;
        this.precision = 0;
        this.puntosPoder = 20;
    }
}
