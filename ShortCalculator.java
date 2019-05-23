 


public class ShortCalculator {
    
    public short shortSum(short a, short b){
        return (short) Math.abs(a + b);
    }
    
    public short shortDiffernce(short a, short b){
        return (short)Math.abs(a - b);
    }
    
    public short shortProduct(short a, short b){
        return (short)Math.abs(a * b);
    }
    
    public short shortQuotient(short a, short b){
        return (short)Math.abs(a / b);
    }
    
    public short shortRemainder(short a, short b){
        return (short)Math.abs(a%b);
    }
}
