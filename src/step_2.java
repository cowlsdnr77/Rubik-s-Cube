import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class step_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cubeArr[][] = {{'R','R','W'}, {'G','C','W'}, {'G', 'B', 'B'}};
		String moveInput;
		showCube(cubeArr);
		
		while(true) {
			System.out.print("CUBE> ");
			Scanner input = new Scanner(System.in);
			moveInput = input.next();
			if(moveInput.equals("Q")) {
				System.out.println("Bye~");
				input.close();
				break;
			} else {
				String[] moveArr = moveInput.split("");
				ArrayList<String> moveArray = moveOrder(moveArr);
				System.out.println("");
			}
		}
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
	
	//입력 arraylist에 담기
	//ArrayList의 값 중 '와 같다면 그 이전 값에 '를 합친 값을 넣고 ArrayList의 마지막 값(중복된 값)을 삭제
	public static ArrayList<String> moveOrder (String Arr[]) {
		ArrayList<String> moveArray = new ArrayList<>(Arrays.asList(Arr));
		for(int i=1 ; i <moveArray.size(); i++) {
			if(moveArray.get(i).equals("'")) { 
				moveArray.set(i-1, moveArray.get(i-1)+moveArray.get(i));
				for(int j=i ; j<moveArray.size()-1 ; j++) {
					moveArray.set(j, moveArray.get(j+1));
				}
				moveArray.remove(moveArray.size()-1);
			}
		}
		return moveArray;
	}
	
	//U 동작 //가장 윗줄을 왼쪽으로 한 칸 밀기
	public static char[][] uMoveLeft (char Arr[][]) {
		char tmp = Arr[0][0];
		for(int i=0 ; i < Arr[0].length-1 ; i++) {
			Arr[0][i] = Arr[0][i+1];
		}
		Arr[0][Arr[0].length-1] = tmp;
		return Arr;
	}
		
	//U' 동작 //가장 윗줄을 오른쪽으로 한 칸 밀기
	public static char[][] uMoveRight (char Arr[][]) {
		char tmp = Arr[0][Arr.length-1];
		for(int i=Arr[0].length-1 ; i > 0 ; i--) {
			Arr[0][i] = Arr[0][i-1];
		}
		Arr[0][0] = tmp;
		return Arr;
	}
	
	//B 동작 //가장 아랫줄을 오른쪽으로 한 칸 밀기
	public static char[][] bMoveRight (char Arr[][]) {
		char tmp = Arr[Arr.length-1][Arr.length-1];
		for(int i=Arr.length-1 ; i > 0 ; i--) {
			Arr[Arr.length-1][i] = Arr[Arr.length-1][i-1];
		}
		Arr[Arr.length-1][0] = tmp;
		return Arr;
	}
		
	//B' 동작 //가장 아랫줄을 왼쪽으로 한 칸 밀기
	public static char[][] bMoveLeft (char Arr[][]) {
		char tmp = Arr[Arr.length-1][0];
		for(int i=0 ; i < Arr.length-1 ; i++) {
			Arr[Arr.length-1][i] = Arr[Arr.length-1][i+1];
		}
		Arr[Arr.length-1][Arr[0].length-1] = tmp;
		return Arr;
	}
	
	//R 동작 //가장 오른쪽 줄을 위로 한 칸 밀기
	public static char[][] rMoveUp (char Arr[][]) {
		char tmp = Arr[0][Arr.length-1];
		for(int i=0 ; i < Arr.length-1 ; i++) {
			Arr[i][Arr.length-1] = Arr[i+1][Arr.length-1];
		}
		Arr[Arr.length-1][Arr.length-1] = tmp;
		return Arr;
	}
		
	//R' 동작 //가장 오른쪽 줄을 아래로 한 칸 밀기
	public static char[][] rMoveDown (char Arr[][]) {
		char tmp = Arr[Arr.length-1][Arr.length-1];
		for(int i=Arr.length-1 ; i > 0 ; i--) {
			Arr[i][Arr.length-1] = Arr[i-1][Arr.length-1];
		}
		Arr[0][Arr.length-1] = tmp;
		return Arr;
	}
}
