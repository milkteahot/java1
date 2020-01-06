# Day6

+ 동물 [] farm2 = {stu, dog1, dog2, bird, but, whale, oct};

```java
//C style
for(int i=0; i<farm2.length;i++) {
	if(farm2[i] != null) //
	farm2[i].놀기();
	}
		
//exception style
for(int i=0; i<farm2.length;i++) {
	try {
		farm2[i].먹기(); //본질적인 일을 먼저 하게 한다.
	}catch(NullPointerException e) {
		System.out.println("null 공간, 객체없음!");
	}
}
```

+ 상속은 is-a 관계에서만 사용한다.
+ 미용실

1) 미용사는 사람이다.
2) 손님은 사람이다.

미용실
________
미용사들: 미용사[];
손님들: 손님[];
_________


	