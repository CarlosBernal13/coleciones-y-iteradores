//create the abstract class
abstract class FiguraGeometrica implements Figura {
    //class attribute
    protected String nombre;
    //create the constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    //Method calculateArea()
    abstract double calcularArea();
}


