package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty pixpar = new PixelParty();
	pixpar.setColor(0, 255, 0);
	pixpar.drawCircle(200, 200, 50);
	pixpar.saveImage();
	pixpar.displayImage();
}
}
