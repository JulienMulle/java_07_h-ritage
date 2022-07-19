public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
        //TODO Auto-generated constructor stub
    }
    
    public void doStuff(){
        System.out.println("Je suis " + this.getBrand() + " et j'avance, glug glug");
   }
}
