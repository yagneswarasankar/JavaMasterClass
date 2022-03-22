package chapters.chapter5.LogicBased.PaintJob;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerbucket,int extraBuckets){
        if(width <=0 || height <=0 || areaPerbucket <=0 || extraBuckets <0){
            return -1;
        }
        return( (int)Math.ceil((((width * height)/areaPerbucket) - extraBuckets)));

    }

    public static int getBucketCount(double width, double height, double areaPerbucket){

        if(width <=0 || height <=0 || areaPerbucket <=0){
            return -1;
        }
        return (int)Math.ceil(((width * height)/areaPerbucket));
    }

    public static int getBucketCount(double area, double areaPerbucket){

        if(area <=0 || areaPerbucket <=0){
            return -1;
        }
        return (int)Math.ceil((area/areaPerbucket));
    }


    }

    /*
    EDDIES solution:
    public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        // if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(width*height/areaPerBucket);
        return getBucketCount(width, height, areaPerBucket, 0); // call first method
    }

    public static int getBucketCount(double area, double areaPerBucket){
        // if(area<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(area/areaPerBucket);
        return getBucketCount(area, 1, areaPerBucket, 0); // call first method where width*height = area is the same as area*1 = area
    }
}
     */

/**
 * Aswin's Solution:
 * public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
 *     if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) return -1;
 *     return (int)Math.ceil((height*width)/areaPerBucket)-extraBuckets;
 * }
 * public static int getBucketCount(double width,double height,double areaPerBucket){
 *     return getBucketCount(width, height, areaPerBucket,0);
 * }
 * public static int getBucketCount(double area,double areaPerBucket){
 *     return getBucketCount(area,1,areaPerBucket);//area=width*height
 * }
 */


