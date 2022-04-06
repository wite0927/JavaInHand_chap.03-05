import java.util.Scanner;

public class chap05_03 {
    //VariableArrayAverageDemo p.134
    public static void main(String[] args) {
        int[][] scores = new int[3][];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){
            System.out.println("반당 학생수("+(i+1)+"반) :");
            int size = scanner.nextInt();
            scores[i] = new int[size];
        }

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j <scores[i].length; j++){
                System.out.println((i+1)+"반"+(j+1)+ "번 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i <scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                sum += scores[i][j];
            }
        }
        
        int totalNum = 0;
        for(int i = 0; i <scores.length; i++){
                totalNum += scores[i].length;
        }

        int avg = sum / totalNum;
        System.out.println("TotalNum : "+totalNum);
        System.out.println("Sum : "+sum);
        System.out.println("AVG : "+avg);
        scanner.close();
    }
}
