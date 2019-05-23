 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger fact = BigInteger.valueOf(1);
        if(value < 0){
            fact = null; // factorial of a negative makes no sense
        }
        else {
            for(int i=1; i<=value; i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }
        }
            
        return fact;
    }
    

}
