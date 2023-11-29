/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import java.io.Serializable;

/**
 *
 * @author alejandro perez vazquez
 */
public class Rugido extends MovimientoFisico implements Serializable{
     public Rugido() {
        this.tipo = Movimiento.TiposDeMovimiento.NORMAL;
        this.potencia = 0;
        this.precision = 0;
        this.puntosPoder = 32;

    }     
}
