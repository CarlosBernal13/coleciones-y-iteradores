// create the Rectangle class that inherits from the parent class Geometric Shape
//add the interface with the implements
class Rectangulo extends FiguraGeometrica {
    //unique attributes of the Rectangle class
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base,double altura){
        // inherits the name attribute from the parent class
        super(nombre);
        this.base=base;
        this.altura=altura;
    }
    //override the calculateArea method of the parent method
    @Override
    double calcularArea(){
        //perform the operation to calculate the area of the rectangle
        return base*altura;
    }
    @Override
    public double calcularPerimetro(){
        //perform the operation to calculate the perimeter of the rectangle
        return (base+altura)*2;
    }
}

