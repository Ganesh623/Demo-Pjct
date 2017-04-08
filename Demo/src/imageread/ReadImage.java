package imageread;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
java.awt.image.BufferedImage
import javax.imageio.ImageIO;
public class ReadImage {

	public static void main(String[] args) {
		Image image=null;
		try{
		URL u= new URL("https://www.w3schools.com/css/trolltunga.jpg");
		image = ImageIO.read(u);
		} catch(IOException e){
		e.printStackTrace();
		}

	}

}
