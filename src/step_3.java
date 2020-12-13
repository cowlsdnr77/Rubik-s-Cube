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
		String moveInput;
		
		showCube(frontArr, backArr, rightArr, leftArr, topArr, bottomArr);
		
		while(true) {
			System.out.print("\nCUBE> ");
			Scanner input = new Scanner(System.in);
			moveInput = input.next(); //엔터 두번 쳐야함
			if(moveInput.equals("Q")) {
				input.close();
				break;
			} else {
				String[] moveArr = moveInput.split("");
				ArrayList<String> moveArray = moveOrder(moveArr);
			}
		}
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
	
	//입력받은 배열을 arraylist에 담기
	public static ArrayList<String> moveOrder (String Arr[]) {
		ArrayList<String> moveArray = new ArrayList<>(Arrays.asList(Arr));
		
		//'으로 회전 명령 나누기
		for(int i=1 ; i <moveArray.size() ; i++) {
			if(moveArray.get(i).equals("'")) {
				moveArray.set(i-1, moveArray.get(i-1)+moveArray.get(i));
				for(int j=i ; j<moveArray.size()-1 ; j++) {
					moveArray.set(j, moveArray.get(j+1));
				}
				moveArray.remove(moveArray.size()-1);
			}
		}
		
		//회전횟수(숫자)만큼 회전 명령을 추가한다
		for(int i=1 ; i<moveArray.size(); i++) {
			if(Character.isDigit(moveArray.get(i).charAt(0))) {
				int tmp = Integer.parseInt(moveArray.get(i));
				moveArray.set(i, moveArray.get(i-1));
				for(int j=1 ; j<tmp-1 ; j++) {
					moveArray.add(i, moveArray.get(i-1));
				}
			}
		}
		return moveArray;
	}
}
