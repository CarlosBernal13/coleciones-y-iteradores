//the abstract class is created
abstract class Personaje implements HabilidadesMagicas,Habilidadesfisicas{
    // create the variables to be filled
    protected String nombre;
    protected int nivel;
    // create the constructor
    public Personaje(String nombre,int nivel){
        if(nivel<1){
            throw new IllegalArgumentException("El nivel no puede ser menor que 1");
        }
        this.nombre=nombre;
        this.nivel=nivel;
    } 
    // create the attack() method abstract
    abstract void atacar();
}