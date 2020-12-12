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
