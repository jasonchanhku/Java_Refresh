
/**
 * Write a description of class Car2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import comp102x.IO;
import comp102x.ColorImage;
import comp102x.Canvas;
public class Car2
{
    // instance variables - replace the example below with your own
    private String owner = "NoName";
    private ColorImage carImage = new ColorImage("Car1.png");
    private double gasMileage = 10.0;
    private double gasInTank = 10.0;
    
    //default constructor
    public Car2() {}
    
    //specific constructor with one input
    public Car2(String nameOfOwner) {
        
        owner = nameOfOwner;
        carImage = new ColorImage();
    
    }
    
    // two inputs 
    
    public Car2(String nameOfOwner, double newGasMileage){
        
        owner = nameOfOwner;
        carImage = new ColorImage();
        gasMileage = newGasMileage;
    
    
    }
    
    // Methods
    public void moveForward(int dist){
        
        int rotationInDegrees = carImage.getRotation();
        int rotationInRadians = rotationInDegrees * (int) Math.PI / 180;
        carImage.setX(carImage.getX() + dist*(int)Math.cos(rotationInRadians));
        carImage.setY(carImage.getY() + dist*(int)Math.sin(rotationInRadians));
        double gasUsed = dist / 100.0 * gasMileage;
        gasInTank -= gasUsed;
        IO.outputln("Amount of gas used: " + gasUsed + "gas remaining: " + gasInTank);
        
    }
    
    public void makeTurn (int angle){
        
        carImage.setRotation(carImage.getRotation() + angle);
        
    }
    
    public void addGas(double gasToAdd){
        
        gasInTank = gasInTank + gasToAdd;
    
    
    }
    
    public void Car2Demo(){
        Canvas canvas = new Canvas();
        canvas.add(carImage, 200, 200);
    }    
    
    
    
    

}
