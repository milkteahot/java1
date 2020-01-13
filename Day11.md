# Day11

+ ArrayList


```java
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void setList(ArrayList list, String[] str) {
        for(int i=0;i<str.length;i++){
            list.add(str[i]);
            showList(list);
        }
    }

    public static void showList(ArrayList list) {
        for(int i=0;i<list.size();i++){
            System.out.print(i+ ":"+list.get(i) + ",");
        System.out.println();
        }
        public static void main(String [] args) throws InterruptedException{
            String [] str1 = {"aaa","bbb","ccc","ddd","eee"};
            String [] str2 = {"111","222","333","444","555"};

            ArrayList <String> teamA = new ArrayList<String>();
            ArrayList <String> teamB = new ArrayList<String>();

            setList(teamA, str1);
            setList(teamB, str2);

            int num=0;
            Random r = new Random();
            num = r.nextInt();

            while(true) {
                if(teamA.isEmpty() == true) break;
                num = (int) (Math.random()*100);

                num = num%teamA.size();
                teamA.remove(num);
                System.out.println(num + "를 제거합니다.");

                showList(teamA);
                Thread.sleep(1000);
            }
        }
    }
}

```