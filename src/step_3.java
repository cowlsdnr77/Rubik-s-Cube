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
	
	//U 동작 /가장 윗 부분을 왼쪽 방향으로 회전
	//반환값이 없는 메서드를 반환값이 있는 메서드로 바꾸는 방법
	//메서드는 단 하나의 값만 반환할 수 있지만 참조형 매개변수를 사용하는 메서드를 응용하면 여러 개의 값을 반환하는 메서드를 만들 수 있음
	public static void uMoveLeft (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpFront = {frontArr[0][0],frontArr[0][1],frontArr[0][2]};
		char[][] tmpTop = {{topArr[0][0], topArr[0][1], topArr[0][2]},
				 		   {topArr[1][0], topArr[1][1], topArr[1][2]},
				 		   {topArr[2][0], topArr[2][1], topArr[2][2]}};
		
		for(int i=0 ; i<3 ; i++) {
			//front,right,back,left 큐브 단면이 회전됨
			frontArr[0][i] = rightArr[0][i];
			rightArr[0][i] = backArr[0][2-i];
			backArr[0][2-i] = leftArr[0][i];
			leftArr[0][i] = tmpFront[i];
			
			//top 큐브단면이 회전됨
			topArr[i][0] = tmpTop[2][i];
			topArr[i][1] = tmpTop[1][i];
			topArr[i][2] = tmpTop[0][i];
		}
	}
	
	//U' 동작 //가장 윗 부분을 오른쪽 방향으로 회전
	public static void uMoveRight (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpFront = {frontArr[0][0],frontArr[0][1],frontArr[0][2]};
		char[][] tmpTop = {{topArr[0][0], topArr[0][1], topArr[0][2]},
				 		   {topArr[1][0], topArr[1][1], topArr[1][2]},
				 		   {topArr[2][0], topArr[2][1], topArr[2][2]}};
		
		for(int i=0 ; i<3 ; i++) {
			//front,left,back,right 큐브 단면이 회전됨
			frontArr[0][i] = leftArr[0][i];
			leftArr[0][i] = backArr[0][2-i];
			backArr[0][2-i] = rightArr[0][i];
			rightArr[0][i] = tmpFront[i];
			
			//top 큐브단면이 회전됨
			topArr[2-i][0] = tmpTop[0][i];
			topArr[2-i][1] = tmpTop[1][i];
			topArr[2-i][2] = tmpTop[2][i];
		}
	}
	
	//D 동작 //가장 아랫 부분을 오른쪽 방향으로 회전
	public static void dMoveRight (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpFront = {frontArr[2][0],frontArr[2][1],frontArr[2][2]};
		char[][] tmpBottom = {{bottomArr[0][0], bottomArr[0][1], bottomArr[0][2]},
		 		   		   	  {bottomArr[1][0], bottomArr[1][1], bottomArr[1][2]},
		 		   		   	  {bottomArr[2][0], bottomArr[2][1], bottomArr[2][2]}};
		
		for(int i=0 ; i<3 ; i++) {
			//front,left,back,right 큐브 단면이 회전됨
			frontArr[2][i] = leftArr[2][i];
			leftArr[2][i] = backArr[2][2-i];
			backArr[2][2-i] = rightArr[2][i];
			rightArr[2][i] = tmpFront[i];
			
			//bottom 큐브 단면이 회전됨
			bottomArr[2-i][0] = tmpBottom[0][i];
			bottomArr[2-i][1] = tmpBottom[1][i];
			bottomArr[2-i][2] = tmpBottom[2][i];
		}
	}
	
	//D' 동작 //가장 아랫 부분을 왼쪽 방향으로 회전
	public static void dMoveLeft (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpFront = {frontArr[2][0],frontArr[2][1],frontArr[2][2]};
		char[][] tmpBottom = {{bottomArr[0][0], bottomArr[0][1], bottomArr[0][2]},
		 		   		   	  {bottomArr[1][0], bottomArr[1][1], bottomArr[1][2]},
		 		   		   	  {bottomArr[2][0], bottomArr[2][1], bottomArr[2][2]}};
		for(int i=0 ; i<3 ; i++) {
			//front,right,back,left 큐브 단면이 회전됨
			frontArr[2][i] = rightArr[2][i];
			rightArr[2][i] = backArr[2][2-i];
			backArr[2][2-i] = leftArr[2][i];
			leftArr[2][i] = tmpFront[i];
			
			//bottom 큐브 단면이 회전됨
			bottomArr[i][0] = tmpBottom[2][i];
			bottomArr[i][1] = tmpBottom[1][i];
			bottomArr[i][2] = tmpBottom[0][i];
		}
	}
	
	//F 동작 //가장 앞 부분을 오른쪽 방향으로 회전
	public static void fMoveRight (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpTop = {topArr[2][0],topArr[2][1],topArr[2][2]};
		char[][] tmpFront = {{frontArr[0][0], frontArr[0][1], frontArr[0][2]},
							 {frontArr[1][0], frontArr[1][1], frontArr[1][2]},
							 {frontArr[2][0], frontArr[2][1], frontArr[2][2]}};

		for(int i=0 ; i<3 ; i++) {
			//top,left,bottom,right 큐브 단면이 회전됨
			topArr[2][i] = leftArr[2-i][2];
			leftArr[2-i][2] = bottomArr[2][2-i];
			bottomArr[2][2-i] = rightArr[i][0];
			rightArr[i][0] = tmpTop[i];
			
			//front 큐브 단면이 회전됨
			frontArr[i][0] = tmpFront[2][i];
			frontArr[i][1] = tmpFront[1][i];
			frontArr[i][2] = tmpFront[0][i];
		}
	}
	
	//F' 동작 //가장 앞 부분을 왼쪽 방향으로 회전
	public static void fMoveLeft (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpTop = {topArr[2][0],topArr[2][1],topArr[2][2]};
		char[][] tmpFront = {{frontArr[0][0], frontArr[0][1], frontArr[0][2]},
							 {frontArr[1][0], frontArr[1][1], frontArr[1][2]},
							 {frontArr[2][0], frontArr[2][1], frontArr[2][2]}};

		for(int i=0 ; i<3 ; i++) {
			//top,right,bottom,left 큐브 단면이 회전됨
			topArr[2][i] = rightArr[i][0];
			rightArr[i][0] = bottomArr[2][2-i];
			bottomArr[2][2-i] = leftArr[2-i][2];
			leftArr[2-i][2] = tmpTop[i];
			
			//front 큐브 단면이 회전됨
			frontArr[2-i][0] = tmpFront[0][i];
			frontArr[2-i][1] = tmpFront[1][i];
			frontArr[2-i][2] = tmpFront[2][i];
		}
	}
	
	//B 동작 //가장 뒷 부분을 왼쪽 방향으로 회전
	public static void bMoveLeft (char frontArr[][],char backArr[][],char rightArr[][],char leftArr[][],char topArr[][],char bottomArr[][]) {
		char[] tmpTop = {topArr[0][0],topArr[0][1],topArr[0][2]};
		char[][] tmpBack = {{backArr[0][0], backArr[0][1], backArr[0][2]},
							 {backArr[1][0], backArr[1][1], backArr[1][2]},
							 {backArr[2][0], backArr[2][1], backArr[2][2]}};

		for(int i=0 ; i<3 ; i++) {
			//top,right,bottom,left 큐브 단면이 회전됨
			topArr[0][i] = rightArr[i][2];
			rightArr[i][2] = bottomArr[0][2-i];
			bottomArr[0][2-i] = leftArr[2-i][0];
			leftArr[2-i][0] = tmpTop[i];
			
			//back 큐브 단면이 회전됨
			backArr[2-i][0] = tmpBack[0][i];
			backArr[2-i][1] = tmpBack[1][i];
			backArr[2-i][2] = tmpBack[2][i];
		}
	}
	
}
