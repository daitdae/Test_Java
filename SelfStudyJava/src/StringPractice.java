public class StringPractice {
    public static void main(String[] args) {
        String str = "안녕하세요, 홍길동입니다.";

        int result1 = str.indexOf('홍'); //7 '홍'이라는 문자가 있는곳
        System.out.println(result1);

        result1 = str.indexOf("홍길동");
        System.out.println(result1); //7 시작글자 '홍'의 위치를 반환함
        
        result1 = str.indexOf("아길동");
        System.out.println(result1); //-1 없는 문자, 문자열

    }
}
