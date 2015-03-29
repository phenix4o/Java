public class ReduceBrightness implements MatrixOperation {
	private Pixel pix;

	public ReduceBrightness() {
		// TODO Auto-generated constructor stub
		pix = new Pixel(0, 0, 0);
	}

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		// TODO Auto-generated method stub

		if (matrix[x][y].getR() * 2 > 255) {
			pix.setR(matrix[x][y].getR() * 2);
		}
		if (matrix[x][y].getG() * 2 <= 255) {
			pix.setG(matrix[x][y].getG() * 2);
		}
		if (matrix[x][y].getB() * 2 <= 255) {
			pix.setB(matrix[x][y].getB() * 2);
		}

		return pix;
	}

}
