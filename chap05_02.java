public class chap05_02 {
    //ArrayCopey02Demo p.128
    public static void main(String[] args) {
        int[] sourceData = new int[]{1,2,3};
        int[] targetData = new int[3];

        System.arraycopy(sourceData, 0, targetData, 0, targetData.length);

        for(int i = 0; i<3; i++){
            System.out.println("targetData["+i+"] = " +targetData[i]);
        }
    }
}
/*
System.arrayCopy 메소드를 사용하면
(복사할 원본 배열
원본 배열 시작 위치
대상 배열
대상 배열 시작 위치
복사할 길이)
로 사용 가능
*/