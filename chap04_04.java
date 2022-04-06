public class chap04_04 {
    //continueDemo p.119
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
//continue 는 for문 끝으로