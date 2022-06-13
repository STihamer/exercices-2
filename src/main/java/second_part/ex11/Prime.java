package second_part.ex11;

import java.util.ArrayList;
import java.util.List;

public class Prime {


    public void checkPrime(Integer integer){
        for(int i = 2; i<=integer; i++){
          Integer counter = 0;
            for(int j = 2; j <=i; j++){
                if(i%j  == 0){
                    counter++;
                }
            }
            if(counter == 1){
                System.out.print(i + " ");
            }
        }
    }
}
