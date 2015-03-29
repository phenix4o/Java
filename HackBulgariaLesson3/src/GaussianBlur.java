import java.net.CookieHandler;

public class GaussianBlur implements MatrixOperation {
	private Pixel pix;

	public GaussianBlur() {
		pix = new Pixel(0, 0, 0);
	}

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		// TODO Auto-generated method stub
		int m = matrix.length;
		int n = matrix[0].length;
		Pixel pix = new Pixel(0, 0, 0);
		float[][] kernel = { { 1 / 16f, 1 / 8f, 1 / 16f },
				{ 1 / 8f, 1 / 4f, 1 / 8f }, { 1 / 16f, 1 / 8f, 1 / 16f } };
		int sumR = 0;
		int sumG = 0;
		int sumB = 0;
		int kernCenterX = (int) Math.floor(kernel.length / 2);
		int kernCenterY = (int) Math.floor(kernel[0].length / 2);
		int coordX = x + (m - kernCenterX);
		int coordY = y + (n - kernCenterX);
		for (int i = 0; i < kernel.length; i++) {
			int mm = kernel.length - 1 - i;
			for (int j = 0; j < kernel[0].length; j++) {
				int nn = kernel[0].length - 1 - n;
				sumR += matrix[coordX][coordY].getR() * kernel[mm][nn];
				sumG += matrix[coordX][coordY].getG() * kernel[mm][nn];
				sumB += matrix[coordX][coordY].getB() * kernel[mm][nn];
			}
		}
		pix = new Pixel(sumR, sumG, sumB);
		return pix;
	}

}
