/*
 * 자료형
 *  정수형
 *    byte  (1byte)  -128 ~ 127 (파일, 네트워크상에서 이용)
 *    short (2byte)  -32768 ~ 32767 (사용빈도가 없다)
 *    int	(4byte)  -21억4천 ~ 21억4천
 *      => 일반 정수 (default=> int)
 *    long  (8byte)  -2^63 ~ 2^62
 *      ******* int vs. long => 100L(l)
 *  실수형
 *    float (4byte) : 소수점이하 6자리
 *    double(8byte) : 소수점이하 15자리
 *      => 일반 실수 (default=> double)
 *      ******* float vs. double => 10.5F(f), 10.5D(d)
 *        D(d)는 생략 가능
 *  문자형
 *    char  (2byte) : 문자 한 개를 표현 'A','홍'
 *      0~65535 => 각국의 언어를 표현할 수 있따. (UNICODE)
 *  논리형
 *    boolean (1byte) : true, false
 *      ==> 조건사용
 * ===============================> 데이터 저장시 메모리 크기를 결정할 때 사용
 * 
 * ==> 데이터 저장 방법
 *  1) 단일 데이터 저장하는 메모리의 별칭 : 변수
 *     변수 : 변하는 값(어제든지 필요시마다 변경해서 사용이 가능)
 *     상수 : 변하지 않는 값(final, 고정값이 필요할 때)
 *     
 *     => 변수 사용범
 *        메모리 크기선언     변수명 설정     =  값
 *           int       a    =  10
 *           *** 같은 블럭상에서{} 같은 이름의 변수는
 *               사용할 수 없다.
 *               
 *        선언 후에 나중에 값을 대입
 *        int a;
 *        a=10;
 *        int a,b,c;
 *        a=1, b=2, c=3;
 *        int a=10, b=20, c=30; (단, 같은 형이여야 한다.)
 *     
 *      => 변수명 만들기 (식별자)
 *        1) 알파벳이나 한글로 시작 (단, 알파벳은 대소문자 구분)
 *        2) 숫자로 시작은 불가하다.(중간에 들어가는 숫자는 가능)
 *        3) 특수문자 $, _ 두가지만 사용가능
 *        4) keyword(예약어)는 사용 불가
 *           자바에서 이미 사용중인 단어 int, long, public, private, class..........
 *        5) 변수의 길이는 제한이 없다 (3~7자)
 *      ***** 문법은 아닌데..
 *        약속된 부분 (자바 개발자끼리의)
 *        1) 클래스명은 대문자 (첫문자) ex) Main....
 *        2) 변수, 메소드 (첫문자) 소문자로   ex) a, b, kor.....
 *  	  3) 두개이상의 단어를 이용할 때 두번째 시작은 대문자   ex)mainClass, fileName...... (헝거리언식 표현법, camel)
 *     
 *     => 자료형의 변환
 *        자료형의 크기
 *        
 *             byte < short < int < long < float < double
 *                    char
 *         *자료형을 작게 만든다. 
 *          (int)10.5 => (double => int)
 *                         8byte    4byte
 *           강제형변환(down-casting, explicit casting)
 *         
 *         **자료형을 크게 만든다.
 *          (double)10 => (int => double)
 *                         4byte  8byte
 *          ===> 자동형변환 (연산 수행시마다)
 *               'A' + 1
 *           1) 'A' => 65
 *           2) 65+1 => 66
 *      
 *       ==> int a = 10000000000
 *                   -----------
 *                    1번째로 인식
 *              ----
 *              2번쨰 인식 => 정수형 범위를 넘으므로 에러. 따라서
 *              
 *           int a = 10000000000L 로 수정
 *           그럼. 마지막 명령인 int 형에서 걸림. long을 int에 담으라늬!! long이 8byte인데 int 4byte에 넣게되면 데이터 손실이 발생한다.
 *           따라서 
 *           int를 long으로 변경한
 *           long a = 10000000000L이 맞는 표현이 된다.
 *      
 *      ==> int 이하 (byte, short, char) => 연산결과값은 int
 *          byte+byte = int
 *          char+char = int
 *          short+short = int
 *      ==> 나머지는 큰 데이터형을 따라 간다.
 *          int+byte = int
 *          int + long = long
 *          double + int = double
 *          float + int = float
 *                             
 *  2) 다중 데이터 저장하는 메모리의 
 */
public class 자바자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 128;
		byte b = (byte)a;
		System.out.println(b);
		*/
		byte byteValue=127;
		short shortValue=32767;
		int intValue=2140000000;
		long longValue=3000000000000000000L;
		float floatValue=10.5F;
		double doubleValue=10.5D;
		char charValue='홍';
		boolean booleanValue=true;
		System.out.println("byteValue="+byteValue);
		System.out.println("shortValue="+shortValue);
		System.out.println("intValue="+intValue);
		System.out.println("longValue="+longValue);
		System.out.println("floatValue="+floatValue);
		System.out.println("doubleValue="+doubleValue);
		System.out.println("charValue="+charValue);
		System.out.println("booleanValue="+booleanValue);
		
		int a=10;
		int b=~a;
		System.out.println(b);
	}
}
