# Forex Service

## About the service

This is Forex Service will be used in the T24 Programming Series.

### Usage in Java

```java
package io.mathisi;

public class Main {

    public static void main(String[] args) {
        Forex forex = new Forex();
        double amountInLcy = 2349.45;
        String fcy1 = "USD";
        String fcy2 = "RUB";
        String fcy3 = "RWF";

        String param1 = fcy1 + "]" + amountInLcy;   // "USD]2349.45"
        double amountInUSD = forex.calculate(param1);

        String param2 = fcy2 + "]" + amountInLcy;   // "RUB]2349.45"
        double amountInRUB = forex.calculate(param2);

        String param3 = fcy3 + "]" + amountInLcy;   // "RWF]2349.45"
        double amountInRWF = forex.calculate(param3);

        System.out.println("EUR " + amountInLcy + " = USD "+ amountInUSD); //EUR 2349.45 = USD 2769.3
        System.out.println("EUR " + amountInLcy + " = RUB "+ amountInRUB); //EUR 2349.45 = RUB 211409.38
        System.out.println("EUR " + amountInLcy + " = RWF "+ amountInRWF); //EUR 2349.45 = RWF 2472796.13
    }
}
```

### Consuming the service in T24 / InfoBasic(jbc) using CALLJ

```basic
0001  PROGRAM TestCallJ
0002
0003     class_name = "io.mathisi.Forex"
0004     method_name = "calculate"
0005     param = "USD]2349.45"
0006
0007     CALLJ class_name, method_name, param SETTING amount_fcy ON ERROR
0008         err = SYSTEM(0)
0009         CRT err
0010         RETURN
0011     END
0012     CRT @(-1)
0013     CRT "EUR 2349.45 = USD ": amount_fcy     ;* EUR 2349.45 = USD 2769.3
0014
0015 END
```
