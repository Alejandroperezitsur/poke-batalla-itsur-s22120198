/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author FJML1983
 */
public class Movimiento extends Pokemon {
    
    
    enum tiposDeMovimiento{
        //Primera Generacion
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generacion...
        
    }
            
    protected tiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;
    
    
    
    
    
    public void utilizar(Pokemon usuario, Pokemon objetivo){
        
    }
    
    
}
