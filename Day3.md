# Day3

```java
//배열. 
//자료형, 변수명 순서로 선언
int [] arr = new int[10];
```

* 배열 연습하기!

* 10개 입력받아서 sort 정렬하기
```java
import java.util.Arrays;
import java.util.Scanner;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("정수를 10번 입력하세요. %d번: ",i+1);
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			arr[i] = num;
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
```