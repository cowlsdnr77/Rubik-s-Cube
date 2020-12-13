# Rubik-s-Cube

STEP-1
-moveLeft 메소드
          1) moves가 음수라면 moveRight를 -moves만큼 실행한 것과 같으므로 moveRight(Arr, length, -moves)를 리턴한다.
          2) tmp에 Arr[0] 값을 저장하고 반복문을 통해 배열의 값을 오른쪽에서 왼쪽으로 저장하고 배열의 마지막 값에 tmp를 저장한다.
          3) 이후 바뀐 Arr를 리턴한다.
-moveRight 메소드
          1) moves가 음수라면 moveLeft를 -moves만큼 실행한 것과 같으므로 moveLeft(Arr, length, -moves)를 리턴한다.
          2) tmp에 Arr[length-1] 값을 저장하고 반복문을 통해 배열의 값을 왼쪽에서 오른쪽으로 저장하고 배열의 첫번째 값에 tmp를 저장한다.
          3) 이후 바뀐 Arr를 리턴한다.
         
STEP-2
-showCube 메소드
          1)평면큐브 출력 함수
          2)이차원 배열을 반복문을 통해 차례대로 출력한다.
-moveOrder 메소드
          1)배열 Arr을 ArrayList moveArray에 저장
          2)moveArray의 값 중 '와 같다면 ' 이전 값에 '을 합친 값을 넣고 moveArray의 마지막 값(중복된 값)을 삭제한다.
-uMoveLeft 메소드
          1)U 동작, 가장 윗줄을 왼쪽으로 한 칸 밀기
          2)배열 Arr[0] 행의 오른쪽 값을 왼쪽에 저장한다.
-uMoveRight 메소드
          1)U' 동작, 가장 윗줄을 오른쪽으로 한 칸 밀기
          2)배열 Arr[0] 행의 왼쪽 값을 오른쪽에 저장한다.
-bMoveRight 메소드
          1)B 동작, 가장 아랫줄을 오른쪽으로 한 칸 밀기
          2)배열 Arr[Arr.legnth-1] 행의 왼쪽 값을 오른쪽에 저장한다.
-bMoveLeft 메소드
          1)U 동작, 가장 아랫줄을 왼쪽으로 한 칸 밀기
          2)배열 Arr[Arr.length-1] 행의 오른쪽 값을 왼쪽에 저장한다.
-rMoveUp 메소드
          1)R 동작, 가장 오른쪽 줄을 위으로 한 칸 밀기
          2)배열 Arr[i][Arr.length-1] 열의 아래쪽 값을 위쪽에 저장한다. 
-rMoveDown 메소드
          1)R' 동작, 가장 오른쪽 줄을 아래로 한 칸 밀기
          2)배열 Arr[i][Arr.length-1] 열의 위쪽 값을 아래쪽에 저장한다.
-lMoveDown 메소드
          1)L 동작, 가장 왼쪽 줄을 아래로 한 칸 밀기
          2)배열 Arr[i][0] 열의 위쪽 값을 아래쪽에 저장한다.
-lMoveUp 메소드
          1)L' 동작, 가장 왼쪽 줄을 위로 한 칸 밀기
          2)배열 Arr[i][0] 열의 아래쪽 값을 위쪽에 저장한다.        
-showRecentMove 메소드
          1)입력된 동작별로 콘솔창에 평면 큐브 출력
          2)switch 조건문 이용
