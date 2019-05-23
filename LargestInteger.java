 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer largest;
        if(integers[0] > integers[1]){
            if(integers[0] > integers[2]){
                largest = 0;
            }
            else {
                largest = 2;
            }
        }
        else {
            if(integers[1] > integers[2]){
                largest = 1;
            }
            else {
                largest = 2;
            }
        }
        return integers[largest];
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return Math.max(integers[0],Math.max(integers[1],integers[2]));
    }
}
