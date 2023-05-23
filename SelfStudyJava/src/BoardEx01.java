public class BoardEx01 {
    public static void main(String[] args) {
        String content = "글 내용입니다. 어쩌구 저쩌구 ~~바보야";
        //금지어
        String word = "바보";

        //바보라는 말을 함
        if(content.indexOf("바보")>-1){
            //금지어 발견
            System.out.println("금지어 발견 글쓰기 중단");
        } else {
            System.out.println("글 쓰기 진행");
        }
        //금지어 사용 x -> 글쓰기 진행 o -> 금지어가 **로 바뀜
        System.out.println(content.replace("바보","**"));
    }
}
