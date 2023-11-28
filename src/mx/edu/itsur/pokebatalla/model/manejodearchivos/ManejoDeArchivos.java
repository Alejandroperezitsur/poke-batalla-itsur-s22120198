package mx.edu.itsur.pokebatalla.model.manejodearchivos;

import java.io.*;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;

/**
 *
 * @author alejandro perez vazquez
 */

public class ManejoDeArchivos {

    public static final String NOMBRE_DEL_ARCHIVO_PARTIDA = "Partida.pokemon";

    public static void escribirPartida(Batalla x) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(NOMBRE_DEL_ARCHIVO_PARTIDA))) {
            escritorDeObjetos.writeObject(x);
        } catch (IOException ex) {
        }
    }

    public static Batalla leerPartida() {
        Batalla leer = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(NOMBRE_DEL_ARCHIVO_PARTIDA))) {
            leer = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
        }
        return leer;
    }
    
    public static void borrarPartida() {
    File archivo = new File(NOMBRE_DEL_ARCHIVO_PARTIDA);
    if (archivo.exists()) {
        archivo.delete();
        System.out.println("Partida anterior eliminada.");
    }
}
}
