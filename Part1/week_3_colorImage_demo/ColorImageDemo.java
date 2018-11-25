import comp102x.ColorImage;
import comp102x.Canvas;

/**
 * A simple demo on ColorImage.
 */
public class ColorImageDemo
{

    private Canvas canvas = new Canvas();   // Create a canvas for ColorImage
    private ColorImage image1 = new ColorImage("Car1.png"); // Default image

    //  Define two constructors for ColorImageDemo
    public ColorImageDemo() {
        canvas.add(image1, 0, 0);       // Display ColorImage at (0,0) position
    }

    public ColorImageDemo(int xPos, int yPos) {
        image1 = new ColorImage( );     // Create a new ColorImage from user file
        canvas.add(image1, xPos, yPos); // Display ColorImage at (xPos,yPos) position
    }

    // Rotate the image clockwise by degrees
    public void setRotateDemo(int degrees) {
        image1.setRotation(degrees);
    }

    // Get the degrees in clockwise rotation of the image
    public int getRotateDemo() {
        return image1.getRotation();
    }

    // Scale the image by scaleFactor
    public void scaleDemo(double scaleFactor) {
        image1.setScale(scaleFactor);
    }

    // Move the image to position (x, y) on the canvas
    public void translateDemo(int x, int y) {
        image1.setX(x);
        image1.setY(y);
    }
}
