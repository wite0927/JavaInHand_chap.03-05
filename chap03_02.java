public class chap03_02 {
    //charAddDemo p.84
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1 + 1);
        char c2 = (char)(c1+1);
        System.out.println(c2);
        char c3 = 'a'+1;
        System.out.println(c3);
    }
}
//byte - (short, char) - int - long - float - double 순으로 형변환