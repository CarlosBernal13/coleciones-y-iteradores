// inherits from parent class naming Character using extends and interface implements
 class Enemigo extends Personaje{
     //create an additional attribute called type
     private String tipo;
     public Enemigo(String nombre,int nivel,String tipo){
         //inherits the name and level of the Character class
         super(nombre,nivel);
         this.tipo=tipo;
     }
     //create the scream() method
     public void gritar(){
         System.out.println(nombre +" "+tipo+ " gruñeee !!grrrrrrrra!!");
     }
     //abstract methods and interfaces are overwritten
     @Override
     void atacar(){
         System.out.println(nombre+" ataca"+ tipo);
     }
     @Override
     public void volar(){
         System.out.println(nombre+" VOLANDO");
     }
     @Override
     public void arrebatar(){
         System.out.println(nombre+ " Arrebatando poderes");
     }
     @Override
     public void morder(){
         System.out.println(nombre+ " mordiendo");
     }
     @Override
     public void correr(){
         System.out.println(nombre+" corriendo");
     }
}
