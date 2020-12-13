import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class step_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char frontArr[][] = {{'G','G','G'}, {'G','G','G'}, {'G', 'G', 'G'}};
		char backArr[][] = {{'W','W','W'}, {'W','W','W'}, {'W', 'W', 'W'}};
		char rightArr[][] = {{'O','O','O'}, {'O','O','O'}, {'O', 'O', 'O'}};
		char leftArr[][] = {{'Y','Y','Y'}, {'Y','Y','Y'}, {'Y', 'Y', 'Y'}};
		char topArr[][] = {{'B','B','B'}, {'B','B','B'}, {'B', 'B', 'B'}};
		char bottomArr[][] = {{'R','R','R'}, {'R','R','R'}, {'R', 'R', 'R'}};
		
		showCube(frontArr, backArr, rightArr, leftArr, topArr, bottomArr);
	}
	
	//큐브 위, 아래 단면 출력
	public static void showVerticalSide (char Arr[][]) {
		for(int i = 0; i < 3 ; i++) {
			System.out.print("                ");
			for(int j = 0; j < 3 ; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//큐브 뒤, 오른쪽, 앞, 왼쪽 단면 출력
	public static void showHorizontalSide (char backArr[][],char rightArr[][],char frontArr[][], char leftArr[][]) {
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 3 ; j++) {
				System.out.print(backArr[i][j] + " ");
			}
			System.out.print("     ");
			for(int j = 0; j < 3 ; j++) {
				System.out.print(rightArr[i][j] + " ");
			}
			System.out.print("     ");
			for(int j = 0; j < 3 ; j++) {
				System.out.print(frontArr[i][j] + " ");
			}
			System.out.print("     ");
			for(int j = 0; j < 3 ; j++) {
				System.out.print(leftArr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//모든 큐브 단면 출력
	public static void showCube (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		//System.out.print("          ");
		showVerticalSide(topArr);
		System.out.println("");
		showHorizontalSide(backArr,rightArr,frontArr,leftArr);
		System.out.println("");
		showVerticalSide(bottomArr);
	}
}
