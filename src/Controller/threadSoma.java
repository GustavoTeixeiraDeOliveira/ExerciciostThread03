package Controller;

public class threadSoma extends Thread{
	private int matrix[][];
	private int indice;
	
	public threadSoma(int[][] matrix, int indice) {
			this.matrix = matrix;
			this.indice = indice;
			
	}
	
	
	
	@Override
	public void run(){
		 int somar = somar(matrix, indice);
		System.out.println("Soma: "+ somar + " Inidice: "+ indice);
	}
	
	public int somar(int[][] matrix, int indice) {
		int somar = 0;
		for(int i = 0; i<5; i++) {
			somar = somar + matrix[indice][i];
		}
		
		return somar;
	}
}
