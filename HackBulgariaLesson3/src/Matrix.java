
public class Matrix {
	private Pixel[][] matrix;
	private Pixel[][] result;
	public Matrix(Pixel[][] matrix){
		this.matrix = matrix;
		this.result = matrix;
	}
	public void operate(MatrixOperation operation){
		for(int x = 0;x<getMatrix().length;x++){
			for(int y = 0;y<getMatrix()[0].length;y++){
				result[x][y] = operation.withPixel(x, y, matrix);
			}
		}
	}
	public Pixel[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(Pixel[][] matrix) {
		this.matrix = matrix;
	}
	public String toStringRed(){
		for(int x = 0;x<getMatrix().length;x++){
			for(int y = 0;y<getMatrix()[0].length;y++){
				return String.valueOf(result[x][y].getR()); 
			}
		}
		return null;
	}
	public String toStringGreen(){
		for(int x = 0;x<getMatrix().length;x++){
			for(int y = 0;y<getMatrix()[0].length;y++){
				return String.valueOf(result[x][y].getG()); 
			}
		}
		return null;
	}
	public String toStringBlue(){
		for(int x = 0;x<getMatrix().length;x++){
			for(int y = 0;y<getMatrix()[0].length;y++){
				return String.valueOf(result[x][y].getB()); 
			}
		}
		return null;
	}
}
