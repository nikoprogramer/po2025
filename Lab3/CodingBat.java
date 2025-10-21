public class CodingBat {
    public static void main(String[] args) {
        CodingBat test = new CodingBat();
        test.sleepIn(true, false);
        test.nearHundred(105);
        int[] n = {7, 4, 4, 5};
        test.countEvens(n);
        test.helloName("Nikodem");

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        } else if (!weekday && vacation) {
            return true;
        } else if (weekday && vacation){
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        int m = 100;
        int o = 200;
        if(Math.abs(m - n) <= 10 || Math.abs(o - n) <= 10) {
            return true;
        }
        return false;
    }

    public int countEvens(int[] nums) {
        int n = 0;
        for (int i : nums) {
            if ((i % 2) == 0) {
                ++n;
            }
        }
        return n;
    }

    public String helloName(String name) {
        String word = "Hello " + name;
        String excl = "!";
        String wordf = word + excl;
        return wordf;
    }


}