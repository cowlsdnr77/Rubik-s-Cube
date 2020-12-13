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
}
