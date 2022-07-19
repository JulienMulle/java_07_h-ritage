public class Cars extends Vehicule {

    public Cars(String brand, int kilometers) {
        super(brand, kilometers);
        //TODO Auto-generated constructor stub
    }

    
    public void doStuff(){
         System.out.println("Je suis une " + this.getBrand() + "  et j'avance, vroum vroum vroum");
    }
    
   
}
