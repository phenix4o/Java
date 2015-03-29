public class Grayscale implements MatrixOperation {
	private Pixel pix;

	public Grayscale() {
		pix = new Pixel(0, 0, 0);
	}

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {

		float value = matrix[x][y].getR() / 3 + matrix[x][y].getG() / 3
				+ matrix[x][y].getR() / 3;
		pix = new Pixel(value, value, value);
		return pix;
	}

}
