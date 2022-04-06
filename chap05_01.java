import java.util.Scanner;

public class chap05_01 {
    //ScoreAverageDemo p.126
    public static void main(String[] args) {
        int[] scores = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            scores[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i=0; i<5; i++){
            sum += scores[i];
        }

        int avg = sum / scores.length;
        System.out.println("AVG : "+avg);
        scanner.close();
    }
}
/*
int[] scores 를 통해 참조 변수를 선언
.length 하면 배열의 길이
*/