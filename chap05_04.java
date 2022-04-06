import java.util.Arrays;

public class chap05_04 {
    //ArraysDemo p.140
    public static void main(String[] args) {
        int[] a = {1,2,3,5,4};
        int index = -1;

        String str = Arrays.toString(a);
        System.out.println(str);
        //배열을 [~~~] 형태로 변환

        index = Arrays.binarySearch(a, 3);
        System.out.println(index);
        //3 값을 가진 요소가 몇번째인지

        int[] b = {1,2,3,5,4};
        int[] c = {1,2,3,4,5};
        boolean isEquals = false;
        isEquals = Arrays.equals(a, b);
        System.out.println(isEquals);
        isEquals = Arrays.equals(a, c);
        System.out.println(isEquals);
        //배열이 동일한지

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //배열을 정렬

        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
        //배열을 0으로 다 채움
    }
}
