package lab0;

public class var1 {

	public enum DAY_OF_WEEK{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public int getInteger(int cm){
		return cm / 100;
	} //Дано расстояние L в сантиметрах. используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).

	public boolean getBoolean(int A){
		return A > 0;
	} //Дано целое число A. Проверить истинность высказывания: «Число A является положительным».

	public int getIf(int num){
		if(num > 0)
			return num+1;
		return num;
	}//Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его.
	// Вывести полученное число.

	public DAY_OF_WEEK getDay(int n){
		switch(n){
			case 1: return DAY_OF_WEEK.MONDAY;
			case 2: return DAY_OF_WEEK.TUESDAY;
			case 3: return DAY_OF_WEEK.WEDNESDAY;
			case 4: return DAY_OF_WEEK.THURSDAY;
			case 5: return DAY_OF_WEEK.FRIDAY;
			case 6: return DAY_OF_WEEK.SATURDAY;
			case 7: return DAY_OF_WEEK.SUNDAY;
		}
		throw new RuntimeException();
	}//Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу
	// (1 — «понедельник», 2 — «вторник» и т. д.).

	public int[] getFor(int K, int N){
		if(N <= 0) throw new RuntimeException();
		int[]arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = K;
		return arr;
	}//Даны целые числа K и N (N > 0). Вывести N раз число K.

	public double getWhile(double A, double B){
		if(A < B)
			throw new RuntimeException();
		do{
			A -= B;
		}while(A > B);
		return A;
	}//Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество
	// отрезков длины B (без наложений). Не используя операции умножения и деления, найти длину незанятой части отрезка A.

	public int[] getArray(int N){
		if(N <= 0)
			throw new RuntimeException();
		int[] array = new int[N];
		for(int i = 0; i < N; i++)
			array[i]=(i+1)*2-1;
		return array;
	}//Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N
	// содержащий N первых положительных нечетных чисел: 1, 3, 5, … .

	public static int[][]getMatrix(int N, int M){
		if(N <= 0 && M <= 0)
			throw new RuntimeException();
		int[][] matrix = new int[M][N];
		for(int i = 0; i < M; i++)
			for(int j = 0; j < N; j++)
				matrix[i][j] = (i+1) * 10;
		return matrix;
	}//Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M ґ N
	// у которой все элементы I-й строки имеют значение 10·I (I = 1, …, M).
}
