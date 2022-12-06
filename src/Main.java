import kata6.WhichAreIn;

public class Main {
    public static void main(String[] args) {
        WhichAreIn wai = new WhichAreIn();

        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        for (String s:
                wai.inArray(a1, a2)) {
            System.out.println(s);
        }

        System.out.println("What's hi? Give me rent!");
    }
}