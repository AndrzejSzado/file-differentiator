public class Extension {
    private static final int[] GIF_FIRST_BYTES = {71,73,70,56,57,97};
    private static final int[] JPG_FIRST_BYTES = {255,216,255,224};

    public static int[] getGifFirstBytes() {
        return GIF_FIRST_BYTES;
    }

    public static int[] getJpgFirstBytes() {
        return JPG_FIRST_BYTES;
    }
}
