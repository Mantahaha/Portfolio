package Portfolio;

import java.util.Arrays;

public class ArraysExercicies {
	public static void main(String[] args) {
		
		double[] alunoNotas = new double[6];

		
		alunoNotas[0] = 5.5;
		alunoNotas[1] = 7;
		alunoNotas[2] = 8.5;
		alunoNotas[3] = 6.5;
		alunoNotas[4] = 9.5;
		alunoNotas[5] = 4.5;
		
		System.out.println(Arrays.toString(alunoNotas));
		
		System.out.println(alunoNotas[0]);

		
		
		double totalNotas = 0;
		for(int i = 0; i < alunoNotas.length; i++) {
			totalNotas += alunoNotas[i];
		}
		System.out.println(totalNotas / alunoNotas.length);
		
	}

}


