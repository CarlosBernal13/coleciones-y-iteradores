 // inherits from parent class naming Character using extends and interface implements
 class Jugador extends Personaje {
    //create an additional attribute called class
     private String clase;
     public Jugador(String nombre,int nivel,String clase){
         //inherits the name and level of the Character class
         super(nombre,nivel);
         this.clase=clase;
     }
    // create the method useSpecialAbility()
    public void usarHabilidadEspecial(){
        System.out.println( clase+" "+nombre+" use special ability ");
    }
    //abstract methods and interfaces are overwritten
    @Override
     void atacar(){
         System.out.println(nombre+" ataca"+ clase);
     }
     @Override
     public void morder(){
         System.out.println(nombre+ " mordiendo");
     }
     @Override
     public void correr(){
         System.out.println(nombre+" corriendo");
     }
     @Override
     public void volar(){
         System.out.println(nombre+" VOLANDO");
     }
     @Override
     public void arrebatar(){
         System.out.println(nombre+ " Arrebatando poderes");
     }
}
