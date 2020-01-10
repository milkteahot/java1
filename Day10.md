# Day10

멤버변수의 타입은 클래스도 가능하다.

다형성
대포 ms;
public void 공격하기(대포 ms){}

인터페이스를 이용한 다중상속과 다형성
오버라이딩

강강결합
가장 좋은 건 약결합 : has
나한테 노트북이 있다. (변수 노트북)
Data data = new Data();

합성: IData data; //기능만 가지게 한다.

Interface IData {
	public String getMsg();
}

-3개이상타입
-공격하기 동작 정의
-독자적인 속성과 기능 정의

* 클래스 인터페이스 ppt 읽고 정리하기
