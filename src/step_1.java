import java.util.Scanner;
public class step_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("> ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int number = input.nextInt();
		String direction = input.next().toUpperCase(); //방향 알파벳을 모두 대문자로 바꾼다
		input.close();
		String[] WordArr = word.split(""); //단어를 문자 하나씩 배열에 저장
		
		if(direction.equals("L")) {
			String[] resultArr = moveLeft(WordArr, WordArr.length, number);
			System.out.println(String.join("",resultArr));	
		} else if(direction.equals("R")) {
			String[] resultArr = moveRight(WordArr, WordArr.length, number);
			System.out.println(String.join("",resultArr));
		} else {
			System.out.println("wrong direction");
		}
	}
	
	//왼쪽 밀어내기
	static String[] moveLeft(String[] Arr, int length, int moves) {
		if(moves < 0) { //음수일 경우 R과 같다
			return moveRight(Arr, length, -moves);
		} else {
			for(int i=0 ; i < moves ; i++) {
				String tmp = Arr[0];
				for(int j=0 ; j <length-1 ; j++) {
					Arr[j] = Arr[j+1];
				}
				Arr[length-1] = tmp;
			}
			return Arr;
		}
	}
		
	//오른쪽 밀어내기
	static String[] moveRight(String[] Arr, int length, int moves) {
		if(moves < 0) { //음수일 경우 L과 같다
			return moveLeft(Arr, length, -moves);
		} else {
			for(int i=0 ; i<moves ; i++) {
				String tmp = Arr[length-1];
				for(int j=length-1 ; j>0 ; j--) {
					Arr[j] = Arr[j-1];
				}
				Arr[0] = tmp;
			}
			return Arr;
		}
	}
}
