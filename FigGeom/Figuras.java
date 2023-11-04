//import the classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Figuras<T extends FiguraGeometrica> {
    private List<T> figuras;
    //create the arrayList
    public Figuras() {
        figuras = new ArrayList<>();
    }
    //add the figures to the arrayList
    public void agregarFigura(T figura) {
        figuras.add(figura);
    }
    //we show the characteristics of the figures
    public void mostrarFiguras() {
        for (T figura : figuras) {
            System.out.println("Tipo de Figura: " + figura.getClass().getSimpleName());
            System.out.println("Nombre de la Figura: " + figura.nombre);
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
    //create the orderByArea method
    public void ordenarPorArea() {
        //we use sort to sort
        Collections.sort(figuras, (f1, f2) -> {
            //create two variables to be compared
            double area1 = f1.calcularArea();
            double area2 = f2.calcularArea();
            //return the comparison of the two variables
            return Double.compare(area1, area2);
        });
    }
    //we look for the type of Figure
    public String buscarTipoFigura(FiguraGeometrica figura) {
        for (T f : figuras) {
            if (f.getClass().equals(figura.getClass())) {
                return "Tipo de Figura encontrado: " + f.getClass().getSimpleName();
            }
        }
        return "Tipo de Figura no encontrado";
    }
    //create a generic method of type Iterator
    public Iterator<T> getIterator() {
        //return the arrayList
        return figuras.iterator();
    }
}
