public class InOrder {
    public static void main(String[] args) {
        // range
        int min = 0;
        int max = 10;

        // init. vars
        int genNum = min - 1; // minus 1 so the code runs at least once
        int newMin;

        do {
            // stores as new min
            newMin = genNum;

            // gens random num in range
            genNum = (int) (Math.random() * (max - min + 1)) + min;

            // checks if greater than new min and in range
            if (genNum >= newMin && genNum <= max) {
                System.out.println(genNum);
            }

        } while (genNum >= newMin && genNum <= max);
    }
}
