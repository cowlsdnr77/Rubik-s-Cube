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

STEP-3
-showVerticalSide 메소드
          1)큐브의 위와 아래 단면을 콘솔창에 출력
-showHorizontalSide 메소드
          1)큐브의 뒤,오른쪽,앞,왼쪽 단면을 콘솔창에 차례대로 출력
-showCube 메소드
          1)모든 큐브의 단면을 콘솔창에 출력
          2)         위
              뒤 오른쪽  앞  왼쪽
                     밑
             =>출력 순서
-moveOrder 메소드
          1)입력받은 배열을 ArrayList에 저장
          2)'으로 회전 명령을 나눈다. 
          3)숫자로 회전 명령을 추가한다. =>i번째 값이 숫자라면 i-1번째 값을 숫자-1번 만큼 ArrayList에 추가한다.
-uMoveLeft 메소드
          1)U 동작, 가장 윗부분을 왼쪽 방향으로 회전
          2)front,right,back,left는 큐브 단면의 Arr[0] 행이 회전한다.
          3)top은 큐브 단면 Arr 전체가 회전한다.
-uMoveRight 메소드
          1)U' 동작, 가장 윗부분을 오른쪽 방향으로 회전
          2)front,left,back,right는 큐브 단면의 Arr[0] 행이 회전한다.
          3)top은 큐브 단면 Arr 전체가 회전한다.
-dMoveRight 메소드
          1)D 동작, 가장 아랫부분을 오른쪽 방향으로 회전
          2)front,left,back,right는 큐브 단면의 Arr[2] 행이 회전한다.
          3)bottom은 큐브 단면 Arr 전체가 회전한다. 
-dMoveLeftt 메소드
          1)D' 동작, 가장 아랫부분을 왼쪽 방향으로 회전
          2)front,right,back,left는 큐브 단면의 Arr[2] 행이 회전한다.
          3)bottom은 큐브 단면 Arr 전체가 회전한다. 
-fMoveRight 메소드
          1)F 동작, 가장 앞 부분을 오른쪽 방향으로 회전
          2)top,bottom은 큐브 단면의 Arr[2] 행이 회전한다. 
          3)left는 큐브 단면의 Arr[i][2] 열, right는 큐브 단면의 Arr[i][0] 열이 회전한다.
          4)front는 큐브 단면 Arr 전체가 회전한다. 
-fMoveLeft 메소드
          1)F' 동작, 가장 앞 부분을 왼쪽 방향으로 회전
          2)top,bottom은 큐브 단면의 Arr[2] 행이 회전한다. 
          3)left는 큐브 단면의 Arr[i][2] 열, right는 큐브 단면의 Arr[i][0] 열이 회전한다.
          4)front는 큐브 단면 Arr 전체가 회전한다.  
-BMoveLeft 메소드
          1)B 동작, 가장 아랫부분을 왼쪽 방향으로 회전
          2)top,bottom은 큐브 단면의 Arr[0] 행이 회전한다. 
          3)left는 큐브 단면의 Arr[i][0] 열, right는 큐브 단면의 Arr[i][2] 열이 회전한다.
          4)bottom은 큐브 단면 Arr 전체가 회전한다. 
-bMoveRight 메소드
          1)B' 동작, 가장 아랫부분을 오른쪽 방향으로 회전
          2)top,bottom은 큐브 단면의 Arr[0] 행이 회전한다. 
          3)left는 큐브 단면의 Arr[i][0] 열, right는 큐브 단면의 Arr[i][2] 열이 회전한다.
          4)bottom은 큐브 단면 Arr 전체가 회전한다. 
-rMoveUp 메소드
          1)R 동작, 가장 오른쪽 부분을 위쪽 방향으로 회전
          2)front,bottom,back,top은 큐브 단면의 Arr[i][2] 열이 회전한다.
          3)right는 큐브 단면 Arr 전체가 회전한다. 
-rMoveDown 메소드
          1)R' 동작, 가장 오른쪽 부분을 아래쪽 방향으로 회전
          2)front,bottom,back,top은 큐브 단면의 Arr[i][2] 열이 회전한다.
          3)right는 큐브 단면 Arr 전체가 회전한다. 
-LMoveDown 메소드
          1)L 동작, 가장 왼쪽 부분을 아래쪽 방향으로 회전
          2)front,bottom,back,top은 큐브 단면의 Arr[i][0] 열이 회전한다.
          3)left는 큐브 단면 Arr 전체가 회전한다. 
-LMoveUp 메소드
          1)L' 동작, 가장 왼쪽 부분을 위쪽 방향으로 회전
          2)front,bottom,back,top은 큐브 단면의 Arr[i][0] 열이 회전한다.
          3)left는 큐브 단면 Arr 전체가 회전한다. 
-showRecentMove 메소드
          1)입력받은 동작별로 콘솔창에 큐브 
          2)switch 조건문 이용
-getTime 메소드
          1)실행시간 계산 및 출력
          2)System.currentTimeMillis를 이용하여 시작시간과 종료시간의 차를 구하고 이를 분과 초로 나눠 출력
-randomShuffle 메소드
          1)큐브 무작위 셔플 기능
          2)switch 조건문에서 총 12가지 동작을 1~12라는 숫자의 case에 대입한 후 조건문을 10번 수행
-completeCube 메소드
          1)큐브 완성여부 파악
          2)큐브가 완성되지 않은 부분을 발견하는 즉시 조건문을 빠져나올 수 있도록 이중 for문의 첫번째 for문에 Loop1라는 이름을 붙인다.
          3)completeCube를 리턴한다.
          3)completeCount가 3이 된다면 큐브가 완성된 것이므로 main 메소드에서 조건문을 구현한다.
-showResult 메소드
          1)프로그램 종료 또는 큐브 완성시 경과시간, 조작갯수 결과를 출력
