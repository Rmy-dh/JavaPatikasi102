**WordFrequency**
``` 

     Input:   Enter your sentence: Frequency describes the number of waves that pass a fixed place in a given amount of time.
     Output:  waves->1
              a->2
              given->1
              amount->1
              pass->1
              in->1
              describes->1
              frequency->1
              the->1
              number->1
              that->1
              of->2
              fixed->1
              place->1
              time->1
     
```
**ReplaceAll()**
* string.replaceAll(String regex, String replacement)

```java
   public class Main {
  public static void main(String[] args) {
    String str1 = "Java123-is456fun.";
    String regex = "[^a-zA-Z0-9]";
    System.out.println(str1.replaceAll(regex, " "));
    //Output:Java123 is456fun
    regex="[a-zA-Z0-9]";
    System.out.println(str1.replaceAll(regex, " "));
    //Output:-        .
    regex="123";
    System.out.println(str1.replaceAll(regex, " "));
    //Output:Java -is456fun.
    regex="\\d+";                
    System.out.println(str1.replaceAll(regex, " "));
    //Output:Java -is fun.
    regex="\\s+";                //space    
    System.out.println(str1.replaceAll(regex, " "));   
    //Output:Java123-is456fun.  
    
  }
}
```
