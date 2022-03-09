public class Question {
        public static void main(String[] args) {
            int[] numArr = new int[10]; // 10개의 정수값을 저장 하기 위한 배열 생성

            for (int i = 0; i < numArr.length; i++) {
                System.out.print(numArr[i] = (int)(Math.random() * 10)); //0-9 의 임의의 값을  뽑는다. i=0부터 i <10 번 반복
            }
            System.out.println(); //줄바꿈을 위해 넣어줌

            for (int i = 0; i < numArr.length-1 ; i++) {
                boolean changed = false;

                for (int j = 0; j < numArr.length-1-i; j++) {
                    if(numArr[j]> numArr[j+1]){
                        int temp = numArr[j];
                        numArr[j]=numArr[j+1];
                        numArr[j+1]= temp;
                        changed = true;
                    }
                }
                if (!changed) break;

                for (int k = 0; k < numArr.length; k++) {
                    System.out.print(numArr[k]);
                }
                System.out.println();
            }
        }
    }
