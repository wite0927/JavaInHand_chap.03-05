public class chap03_01 {
    //AddPositionDemo p.72
    public static void main(String[] args) {
        int intNum1 = 0;
        int intNum2 = intNum1++;

        System.out.println("intNum1 : " +intNum1);
        System.out.println("intNum2 : " +intNum2);

        int intNum3 = 0;
        int intNum4 = ++intNum3;

        System.out.println("intNum3 : " +intNum3);
        System.out.println("intNum4 : " +intNum4);
    }   
}
//후위 연산자는 연산 나중에!!