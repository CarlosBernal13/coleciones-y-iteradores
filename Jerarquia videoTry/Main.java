import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //create the instances
        Jugador jugador=new Jugador("Tauro", 56, "Guerrero");
        Jugador jugador1=new Jugador("Dorse", 10, "Mago");
        Jugador jugador2=new Jugador("Lancelot", 9, "Arquero");
        Enemigo enemigo=new Enemigo("Minotauro", 7, "Esqueleto");
        Enemigo enemigo1=new Enemigo("Clovedeo", 3, "Dragón");
        Enemigo enemigo2=new Enemigo("Pelayo", 12, "Orco");
        // Create a figure player and add the figures
        ObtenerPersonaje<Personaje> jugadorGrande = new ObtenerPersonaje<>();
        jugadorGrande.agregarPersonaje(enemigo);
        jugadorGrande.agregarPersonaje(enemigo1);
        jugadorGrande.agregarPersonaje(enemigo2);
        jugadorGrande.agregarPersonaje(jugador);
        jugadorGrande.agregarPersonaje(jugador1);
        jugadorGrande.agregarPersonaje(jugador2);
        // Show the characteristics of the figures
        System.out.println("Personaje sin ordenar");
        jugadorGrande.mostrarPersonaje();
        //order the characters
        jugadorGrande.ordenarNombre();
        System.out.println("Personajes con orden por Nombre");
        // show the characters with the showCharacter method
        jugadorGrande.mostrarPersonaje();
        Personaje buscaPersonaje = new Jugador("Tauro", 56, "Guerrero");
        String resultadoBusqueda = jugadorGrande.buscarPersonaje(buscaPersonaje);
        System.out.println(resultadoBusqueda);
        // Using an iterator to loop through the figures
        Iterator<Personaje> it = jugadorGrande.getIterator();
        System.out.println("Recorriendo a los personajes con un iterador:");
        while (it.hasNext()) {
            //the values ​​are saved in person every time you go through the ArrayList
            Personaje personita = it.next();
            System.out.println("Nombre del Personaje: " + personita.nombre);
        }

    }
}
