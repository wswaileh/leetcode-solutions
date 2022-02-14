/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1 && isBadVersion(1))
            return 1;
        int low = 1;
        int high = n;
        while (low <= high) {
            int center = (low + high) >>> 1;
            if (isBadVersion(center)) {
                high = center - 1;
            } else {
                low = center + 1;
            }
        }
        return low;
    }
}