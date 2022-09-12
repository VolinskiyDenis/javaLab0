package lab0;

public class var1 {

	public enum DAY_OF_WEEK{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public int FInteger(int cm){
		return cm / 100;
	}

	public boolean FBoolean(int A){
		if(A > 0)
			return true;
		return false;
	}

	public int FIf(int num){
		if(num > 0)
			return num+1;
		return num;
	}

	public DAY_OF_WEEK FDay(int n){
		switch(n){
			case 1: return DAY_OF_WEEK.MONDAY;
			case 2: return DAY_OF_WEEK.TUESDAY;
			case 3: return DAY_OF_WEEK.WEDNESDAY;
			case 4: return DAY_OF_WEEK.THURSDAY;
			case 5: return DAY_OF_WEEK.FRIDAY;
			case 6: return DAY_OF_WEEK.SATURDAY;
			case 7: return DAY_OF_WEEK.SUNDAY;
		}
		return null;
	}

	public String FFor(int K, int N){
		StringBuilder str = new StringBuilder(N*2);
		for(int i = 0; i < N; i++)
			str.append(K + " ");
		return str.toString();
	}

	public double FWhile(double A, double B){
		if(A < B)
			return 0;
		do{
			A -= B;
		}while(A > B);
		return A;
	}

	public int[] FArray(int N){
		if(N <= 0)
			return null;
		int[] array = new int[N];
		for(int i = 0; i < N; i++)
			array[i]=(i+1)*2-1;
		return array;
	}

	public static int[][]FMatrix(int N, int M){
		if(N <= 0 && M <= 0)
			return null;
		int[][] matrix = new int[M][N];
		for(int i = 0; i < M; i++)
			for(int j = 0; j < N; j++)
				matrix[i][j] = (i+1) * 10;
		return matrix;
	}
}
