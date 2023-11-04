// create the PaletteWater class that inherits the attributes and methods of the Palette class
//the topins interface is implemented
class PaletaAgua extends Paleta {
    //the Waterbase attribute is created
    protected boolean baseAgua;
    public PaletaAgua(String sabor,double precio,boolean baseAgua){
        //inherits flavor and price attributes from the Palette class
        super(sabor, precio);
        this.baseAgua=baseAgua;
    }
    //methods of the interface and the abstract class are overridden
    // create the method showBaseAgua
    public void mostrarBaseAgua(){
        System.out.println("Es base agua " +baseAgua);
    }
    //add an extra method called addPlugin
    public void agregarComplemento(String complemento){
        System.out.println("se han agregado: "+ complemento +" a tu paleta");

    }
    //override the changePrice method
    @Override
     void cambiarPrecio(double cantidad){
        super.cambiarPrecio(cantidad+2.0);
    }
    // show the information
    @Override 
    void mostrarInformacion(){
        System.out.println("Sabor: "+sabor);
        System.out.println("Precio: $"+precio);
    }
    // show the information about the condiments
    @Override
    public void condimentos(){
        System.out.println("Se agrego chamoy");
    }
}
