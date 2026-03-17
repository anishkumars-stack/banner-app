public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize the banner array in one step
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", " ***** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*      ", "     *"),
            String.join(" ", "*     *", "*     *", "*      ", "     *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}