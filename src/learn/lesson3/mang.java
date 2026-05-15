package lesson3;
import java.util.Arrays;

public class mang {
    static void main() {
        // int i = 10;
        int []a = new int[3];
        a[0]=2;
        a[1]=3;
        a[0]=4;
        
        System.out.println(Arrays.toString(a));


        int []b = {6,7,8};
        for(int i=0; i<= b.length-1;i++){
            System.out.println(b[i]);
        }

    }
    

}
