package View;
import java.util.Random;

import Controller.threadSoma;
public class main {

	public static void main(String[] args) {
		int matrix[][] = new int[3][5];
		for(int i = 0; i < 3;i++){
			for(int s = 0; s< 5; s++){

				Random num =  new Random();
				matrix[i][s] = num.nextInt(100);
			}

		}
		for(int i = 0; i < 3;i++){
		  threadSoma threadSoma = new threadSoma(matrix, i);
		  threadSoma.start();
		}

	}

}
