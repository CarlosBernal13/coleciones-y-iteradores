import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo", 10.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 12.0, 6.0);
        Triangulo triangulo = new Triangulo("Triángulo", 9.0, 6.0, 4.0, 7.0);

        Figuras<FiguraGeometrica> figuras = new Figuras<>();
        figuras.agregarFigura(circulo);
        figuras.agregarFigura(rectangulo);
        figuras.agregarFigura(triangulo);

        System.out.println("Figuras sin ordenar:");
        figuras.mostrarFiguras();
        //we order the figures by area with the OrderBy Area method
        figuras.ordenarPorArea();

        System.out.println("Figuras ordenadas por área:");
        // show all the figures
        figuras.mostrarFiguras();
        //this figure is looking for and what type of figure is it 
        FiguraGeometrica buscaFigura = new Circulo("Círculo Búsqueda", 1.0);
        String resultadoBusqueda = figuras.buscarTipoFigura(buscaFigura);
        System.out.println(resultadoBusqueda);

        // Using an iterator to loop through the figures
        Iterator<FiguraGeometrica> iterator = figuras.getIterator();
        System.out.println("Recorriendo figuras con un iterador:");
        while (iterator.hasNext()) {
            // traverse the arrayList position by position
            FiguraGeometrica figura = iterator.next();
            System.out.println("Nombre de la Figura: " + figura.nombre);
        }
    }
}
