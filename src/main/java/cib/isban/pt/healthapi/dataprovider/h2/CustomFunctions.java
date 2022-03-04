package cib.isban.pt.healthapi.dataprovider.h2;

public class CustomFunctions {
    
    public static void sleep(Integer seconds) {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        while (t2 - t1 < (1000 * seconds)) {
            t2 = System.currentTimeMillis();
        }
    }

}
