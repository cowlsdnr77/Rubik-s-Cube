import java.util.Scanner;
public class step_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int number = input.nextInt();
		String direction = input.next().toUpperCase(); //방향 알파벳을 모두 대문자로 바꾼다
		input.close();
		String[] WordArr = word.split(""); //단어를 문자 하나씩 배열에 저장
	}
}
