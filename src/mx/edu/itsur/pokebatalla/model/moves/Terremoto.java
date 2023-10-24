/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author alejandro
 */
public class Terremoto extends MovimientoFisico {
        public Terremoto() {
        this.tipo=TiposDeMovimiento.TIERRA;
        this.potencia = 100;
        this.precision = 100;
        this.puntosPoder = 10;
    }
}
