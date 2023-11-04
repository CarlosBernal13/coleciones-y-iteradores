import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //creation of the palette type array
        // instances of PaletteWater and PaletteCremosa are created by passing values ​​to each xampo
        PaletaAgua paletaAgua=new PaletaAgua("Limon", 67, true);
        PaletaAgua paletaAgua1=new PaletaAgua("Guayaba", 20, true);
        PaletaCrema paletaCrema=new PaletaCrema("Oreo", 30, true);
        PaletaCrema paletaCrema1=new PaletaCrema("Fresa", 10.0, true);
        //create an instance that is saved in the variable paletaOne
        ObtenerPaleta<Paleta>paletaOne=new ObtenerPaleta<>();
        //add the palettes
        paletaOne.agregarPaleta(paletaCrema1);
        paletaOne.agregarPaleta(paletaCrema);
        paletaOne.agregarPaleta(paletaAgua);
        paletaOne.agregarPaleta(paletaAgua1);
        //We print the information
        System.out.println("------------------------------------");
        System.out.println("Paletas sin ordenar");
        paletaOne.mostrarPaletasCompradas();
        System.out.println("Paletas ordenadas por sabor");
        //we sort the popsicles by flavor
        paletaOne.ordenarPorSabor();
        //we show the ones that were stored
        paletaOne.mostrarPaletasCompradas();

        // Usando un iterador para recorrer las figuras
        Iterator<Paleta> iterator = paletaOne.getIterator();//an iterator called iterator is initialized
        System.out.println("Recorriendo figuras con un iterador:");
        while (iterator.hasNext()) {//a loop is created that runs through the collection
            Paleta pale = iterator.next();//the pale variable is created that stores what is in the collection 
            System.out.println("Nombre de las paletas: " + pale.sabor);
        }

    }
}
