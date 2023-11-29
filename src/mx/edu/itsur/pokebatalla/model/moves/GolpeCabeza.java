/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import java.io.Serializable;

/**
 *
 * @author alejandro
 */
public class GolpeCabeza extends MovimientoFisico implements Serializable {
        public GolpeCabeza() {
        this.tipo=Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 70;
        this.precision = 100;
        this.puntosPoder = 15;
    }
}
