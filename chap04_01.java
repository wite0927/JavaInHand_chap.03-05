public class chap04_01 {
    //MistakeIfDemo p.109
    public static void main(String[] args) {
        int score = 81;
        char grade = 'F';

        if(score > 60){
            grade = 'D';
        }else if(score>90){
            grade = 'A';
        }else if(score>80){
            grade = 'B';
        }else if(score>70){
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println("grade : "+grade);
    }
}
//위와 같이 if문의 순서를 잘못하면 원하는 결과가 안나올 수도 있다!