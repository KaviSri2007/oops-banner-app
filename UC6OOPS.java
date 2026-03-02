public class BannerApp {

    // Helper method for Letter O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  ***  "),
                String.join("", " *   * "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " *   * "),
                String.join("", "  ***  ")
        };
    }

    // Helper method for Letter P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", " *    *"),
                String.join("", " *    *"),
                String.join("", " ***** "),
                String.join("", " *     "),
                String.join("", " *     "),
                String.join("", " *     ")
        };
    }

    // Helper method for Letter S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  *****"),
                String.join("", " *     "),
                String.join("", " *     "),
                String.join("", "  *****"),
                String.join("", "       *"),
                String.join("", "       *"),
                String.join("", " ***** ")
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Print banner using loop (7 lines)
        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}