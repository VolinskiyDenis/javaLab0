package lab0;

import lab0.var1.DAY_OF_WEEK;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class var1Test {
	public static double EPS = 0.0000001;

	@Test(dataProvider = "myIntegerProvider")
	public void task1(int cm, int m){
		assertEquals(new var1().FInteger(cm), m);
	}

	@DataProvider
	public Object[][] myIntegerProvider(){
		return new Object[][]{{100, 1}, {525, 5}};
	}

	//
	@Test(dataProvider = "myBooleanProvider")
	public void task2(int A, boolean B){
		assertEquals(new var1().FBoolean(A), B);
	}

	@DataProvider
	public Object[][] myBooleanProvider(){
		return new Object[][]{{5, true}, {99_999, true}, {0, false}, {-3, false}, {-99_999, false}};
	}

	//
	@Test(dataProvider = "myIfProvider")
	public void task3(int num1, int num2){
		assertEquals(new var1().FIf(num1), num2);
	}

	@DataProvider
	public Object[][] myIfProvider(){
		return new Object[][]{{5, 6}, {99_999, 100_000}, {0, 0}, {-3, -3}, {-99_999, -99_999}};
	}

	//
	@Test(dataProvider = "myCaseProvider")
	public void task4(int n, DAY_OF_WEEK day){
		assertEquals(new var1().FDay(n), day);
	}

	@DataProvider
	public Object[][] myCaseProvider(){
		return new Object[][]{{1, DAY_OF_WEEK.MONDAY}, {5, DAY_OF_WEEK.FRIDAY}, {0, null}, {9, null}};
	}

	//
	@Test(dataProvider = "myForProvider")
	public void task5(int K, int N, String str){
		assertEquals(new var1().FFor(K, N), str);
	}

	@DataProvider
	public Object[][] myForProvider(){
		return new Object[][]{{1, 5, "1 1 1 1 1 "}, {5, 3, "5 5 5 "}, {5, 0, ""}};
	}

	//
	@Test(dataProvider = "myWhileProvider")
	public void task6(double A, double B, double res){
		assertEquals(new var1().FWhile(A, B), res, EPS);
	}

	@DataProvider
	public Object[][] myWhileProvider(){
		return new Object[][]{{5, 2, 1}, {100.9, 10.1, 10}, {9.999_999_999, 0.000_000_01, 0}};  //EPS = 0.000_000_1
	}

	//
	@Test(dataProvider = "myArrayProvider")
	public void task7(int N, int[] res){
		assertEquals(new var1().FArray(N), res);
	}

	@DataProvider
	public Object[][] myArrayProvider(){
		return new Object[][]{{5, new int[]{1, 3, 5, 7, 9}}, {9, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17}}, {-1, null}};
	}

	//
	@Test(dataProvider = "myMatrixProvider")
	public void task8(int N, int M, int[][] res){
		assertEquals(new var1().FMatrix(N, M), res);
	}

	@DataProvider
	public Object[][] myMatrixProvider(){
		int[][] result1 = {{10, 10}, {20, 20}};

		int[][] result2 = {{10, 10, 10, 10}, {20, 20, 20, 20}, {30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};

		int[][] result3 = {{10, 10, 10, 10, 10, 10, 10, 10}, {20, 20, 20, 20, 20, 20, 20, 20}, {30, 30, 30, 30, 30, 30, 30, 30}, {40, 40, 40, 40, 40, 40, 40, 40}, {50, 50, 50, 50, 50, 50, 50, 50}, {60, 60, 60, 60, 60, 60, 60, 60}, {70, 70, 70, 70, 70, 70, 70, 70}};
		return new Object[][]{{2, 2, result1}, {4, 5, result2}, {8, 7, result3}};
	}
}


