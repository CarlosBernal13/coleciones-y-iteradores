//se importan las clases
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
// Definition of the GetPalette class parameterized with a type T that extends Palette
import java.util.Iterator;
public class ObtenerPaleta<T extends Paleta> {
    //Declaration and creation of a list "palette" that stores objects of type T
    private List<T> paleta= new ArrayList<>();
    // Method to add a palette to the palette list
    public void agregarPaleta(T paletita){
        paleta.add(paletita);
    }
    // Method to display information about purchased pallets
    public void mostrarPaletasCompradas(){
        for(T paletaa:paleta){
            paletaa.mostrarInformacion();
            paletaa.cambiarPrecio(0.0);
            System.out.println("Paleta con Ingredientes extras y precio final");
            paletaa.condimentos();
            paletaa.mostrarInformacion();
            System.out.println("------------------------------------");
        }
    }
    //create the OrderByFlavor method
    public void ordenarPorSabor(){
        //order the arrayList according to flavor
        Collections.sort(paleta,(Paleta a,Paleta b)->a.sabor.compareTo(b.sabor));
    }
    //create a getIterator() method
    public Iterator<T>getIterator(){
       //we return the array by going through it with an Iterator
        return paleta.iterator();
    }
}

