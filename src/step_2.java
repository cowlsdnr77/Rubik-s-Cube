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
}
