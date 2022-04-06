public class chap04_03 {
    //forDemo p.113
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("1~10 합(for) : "+sum);

        sum = 0;
        int i = 1;
        while(i<=10){
            sum += i;
            i++;
        }
        System.out.println("1~10 합(while) : "+sum);

        sum = 0;
        i = 1;
        do{
            sum += i;
            i++;
        }while(i<=10);
        System.out.println("1~10 합(dowhile) : "+sum);
    }
}
//for(string item : List){
//    System.out.println(item);
//} 도 가능