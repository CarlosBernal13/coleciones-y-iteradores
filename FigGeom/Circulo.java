// create the Circle class that inherits from the parent class Geometric Shape 
//add the interface with the implements
class Circulo extends FiguraGeometrica {
    //unique attributes of the Circle class
    private double radio;
    public Circulo(String nombre, double radio){
        // inherits the name attribute from the parent class
        super(nombre);
        this.radio=radio;
    }
    //override the calculateArea method of the parent method
    @Override
    double calcularArea(){
        if(radio==0){
            throw new IllegalArgumentException("No se pudo crear un circulo");
        }
        //perform the operation to calculate the area of the circle
       return Math.PI*radio*radio;
    }
    @Override
    public double calcularPerimetro(){
        //perform the operation to calculate the perimeter of the circle
        return Math.PI*(radio+radio);
    }
}

