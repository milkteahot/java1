# Day13

```java
File file =new File("d:\\data.log");
                PrintWriter out=null;
                
                try {
                    out=new PrintWriter(file);
                } catch (FileNotFoundException e1) {
                    System.out.println("화일만들고 쓰기 실패래요");
                }                
                out.println(   textArea.getText()  );
                out.close();

```