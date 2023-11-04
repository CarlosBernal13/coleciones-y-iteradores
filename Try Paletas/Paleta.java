//Palette abstract class name
abstract class Paleta implements Topins{
    // class attributes
    protected String sabor;
    protected double precio;
    // create the constructor
    public Paleta(String sabor,double precio){
        //this exception is created to notify when a price has not been entered to the palette
        if(precio<=0){
            throw new IllegalArgumentException("no se ha ingreso el precio de la paleta");
        }
        this.sabor=sabor;
        this.precio=precio;
    }
    abstract void mostrarInformacion();

     // create the method changePrice()
     void cambiarPrecio(double cantidad){
        precio+=cantidad;
    }
}