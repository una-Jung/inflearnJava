package variable;

public class Var6 {

    public static void main(String[] args) {
        int a; // 선언했지만 사용을 안해서 class 파일에 없음 (자바가 최적화를 한다.)
        //System.out.println(a); //주석을 풀면 컴파일 에러 발생
    }
}
