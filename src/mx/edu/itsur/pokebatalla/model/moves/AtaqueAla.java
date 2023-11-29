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

public class AtaqueAla extends MovimientoFisico implements Serializable{
        public AtaqueAla() {
        this.tipo=TiposDeMovimiento.VOLADOR;
        this.potencia = 60;
        this.precision = 100;
        this.puntosPoder = 35;
    }
}
