import java.util.Scanner;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

public class Batalla {
    // Atributos
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    // Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    // Métodos
    public void desarrollarBatalla() {
        while (!batallaFinalizada) {
            System.out.println("Turno " + turno);
            
            // Ambos entrenadores eligen Pokémon
            elegirPokemon(turno);

            // Mostrar información de la batalla
            mostrarInfoBatalla();

            // Turno actual: entrenador en turno elige movimiento
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            // Cambiar de Pokémon si se desea
            cambiarPokemonSiEsNecesario(entrenadorEnTurno);

            // Mostrar movimientos disponibles y permitir al entrenador en turno elegir un movimiento
            mostrarMovimientosDisponibles(pokemonEnTurno);
            int movimientoElegido = elegirMovimiento();

            // Realizar el movimiento seleccionado
            realizarMovimiento(entrenadorEnTurno, movimientoElegido);

            // Verificar si la batalla ha terminado
            verificarFinDeBatalla();

            // Cambiar el turno
            cambiarTurno();
        }
    }

    private void elegirPokemon(int turno) {
        Entrenador entrenador = (turno == 1) ? entrenador1 : entrenador2;
        Scanner scanner = new Scanner(System.in);

        System.out.println(entrenador.getNombre() + ", elige tu Pokémon:");
        entrenador.mostrarPokemonesDisponibles();
        int opcion = scanner.nextInt();

        entrenador.elegirPokemon(opcion);
    }

    private void mostrarInfoBatalla() {
        System.out.println("Batalla entre " + entrenador1.getNombre() + " y " + entrenador2.getNombre());
        System.out.println(entrenador1.getNombre() + ": " + entrenador1.getPokemonActual());
        System.out.println(entrenador2.getNombre() + ": " + entrenador2.getPokemonActual());
    }

    private void cambiarPokemonSiEsNecesario(Entrenador entrenador) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres cambiar de Pokémon? (Sí/No)");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("Sí")) {
            entrenador.mostrarPokemonesDisponibles();
            int opcion = scanner.nextInt();
            entrenador.elegirPokemon(opcion);
        }
    }

    private void mostrarMovimientosDisponibles(Pokemon pokemon) {
        System.out.println("Movimientos de " + pokemon.getNombre() + ":");
        pokemon.mostrarMovimientos();
    }

    private int elegirMovimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige un movimiento (1, 2, 3, ...):");
        return scanner.nextInt();
    }

    private void realizarMovimiento(Entrenador entrenador, int movimiento) {
        Pokemon pokemonEnTurno = entrenador.getPokemonActual();
        pokemonEnTurno.atacar(movimiento);

        System.out.println(entrenador.getNombre() + " usó " + pokemonEnTurno.getUltimoMovimientoUtilizado() +
                " y causó " + pokemonEnTurno.getUltimoDanioCausado() + " de daño.");
    }

    private void verificarFinDeBatalla() {
        if (entrenador1.getPokemonActual().estaDerrotado()) {
            System.out.println(entrenador2.getNombre() + " ha ganado la batalla!");
            batallaFinalizada = true;
        } else if (entrenador2.getPokemonActual().estaDerrotado()) {
            System.out.println(entrenador1.getNombre() + " ha ganado la batalla!");
            batallaFinalizada = true;
        }
    }

    private void cambiarTurno() {
        turno = (turno == 1) ? 2 : 1;
    }
}

