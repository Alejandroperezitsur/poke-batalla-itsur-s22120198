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
public class OndaIgnea extends MovimientoEspecial implements Serializable {
         public OndaIgnea() {
        this.tipo = Movimiento.TiposDeMovimiento.FUEGO;
        this.potencia = 95;
        this.precision = 90;
        this.puntosPoder = 16;   
}
}