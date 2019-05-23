 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        Integer retVal;
        if(angle < 0){
            retVal = 360 + (angle%360);
        }
        else {
            retVal = angle%360;
        }
        return retVal;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer,360);
    }

    public static void main(String[] args){

    }
}
