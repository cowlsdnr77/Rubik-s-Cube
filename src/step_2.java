import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class step_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cubeArr[][] = {{'R','R','W'}, {'G','C','W'}, {'G', 'B', 'B'}};
		showCube(cubeArr);
	}
	
	//큐브 출력 함수
	public static void showCube (char Arr[][]) {
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 3 ; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();
	}
}
