public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double remainingArea = area - (extraBuckets * areaPerBucket);

        if (remainingArea <= 0) {
            return 0;  // No need for more buckets
        }

        return (int) Math.ceil(remainingArea / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));    // Output: 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5));     // Output: 4
        System.out.println(getBucketCount(7.25, 4.3));           // Output: 4
    }
}
