// create the Triangle class that inherits from the parent class Geometric Shape
//add the interface with the implements
public class Triangulo extends FiguraGeometrica {
    //unique attributes of the Triangle class
    private double baseTriangulo;
    private double alturaTriangulo;
    private double lado1;
    private double lado2;
    public Triangulo(String nombre, double baseTriangulo, double alturaTriangulo,double lado1, double lado2) {
        // inherits the name attribute from the parent class
        super(nombre);
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
        this.lado1=lado1;
        this.lado2=lado2;
    }
    //override the calculateArea method of the parent method
    @Override
     double calcularArea() {
        double divisor=2;
        //perform the operation to calculate the area of the triangle
        // add the exception to not being able to divide by zero
        if(divisor==0){
            throw new ArithmeticException("No se puede hacer la division entre cero");
        }
        return  (baseTriangulo * alturaTriangulo)/divisor;
    }
    @Override
    // create an exception of type throws IllegalArgumentException
    // check that it is possible to create a triangle
    public double calcularPerimetro() throws IllegalArgumentException{
        if(baseTriangulo<=0||lado1<=0||lado2<=0||(baseTriangulo + lado1 <= lado2) || 
        (baseTriangulo + lado1 <= lado2) || (lado1 + lado2 <= baseTriangulo)){
           // a message is sent to the user that the data entered does not form a triangle 
                throw new IllegalArgumentException("Los lados del triángulo no forman un triángulo válido");
            }
           //perform the operation to calculate the triangle area
        return baseTriangulo+lado1+lado2;
        }   
    }

