/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author alejandro
 */
public class RayoIce extends MovimientoEspecial{
        public RayoIce() {
        this.tipo=Movimiento.TiposDeMovimiento.HIELO;
        this.potencia = 90;
        this.precision = 100;
        this.puntosPoder = 10;
    }
}
