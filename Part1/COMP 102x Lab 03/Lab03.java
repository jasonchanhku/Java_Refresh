import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage Image = new ColorImage();
        Canvas canvas = new Canvas(Image.getWidth(), Image.getHeight());
        canvas.add(Image);
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage Image1 = new ColorImage();
        ColorImage Image2 = new ColorImage();
        Canvas canvas = new Canvas(Image1.getWidth() + Image2.getWidth(), Image1.getWidth());
        
        //adds image 1 at (0,0)
        canvas.add(Image1);
        // adds image 2 after image 1's x position
        canvas.add(Image2, Image1.getWidth(), 0);
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage Image1 = new ColorImage();
        ColorImage Image2 = new ColorImage();
        ColorImage Image3 = Image1.add(Image2);
        
        Canvas canvas = new Canvas(Image1.getWidth() + Image2.getWidth() + Image3.getWidth() + 20, Image1.getHeight());
        
        canvas.add(Image1);
        canvas.add(Image2, Image1.getWidth()+10, 0);
        canvas.add(Image3, Image1.getWidth()+10 + Image2.getWidth() + 10, 0);
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage Image1 = new ColorImage();
        ColorImage Image2 = new ColorImage();
        ColorImage Image3 = Image1.multiply(Image2);
        
        Canvas canvas = new Canvas(Image1.getWidth() + Image2.getWidth() + Image3.getWidth() +20, Image1.getWidth());
        
        canvas.add(Image1);
        canvas.add(Image2, Image1.getWidth()+10, 0);
        canvas.add(Image3, Image1.getWidth()+10 + Image2.getWidth() + 10, 0);
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
