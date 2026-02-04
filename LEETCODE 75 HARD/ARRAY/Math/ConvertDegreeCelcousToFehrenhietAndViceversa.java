package Math;

public class ConvertDegreeCelcousToFehrenhietAndViceversa {
    public static void main(String [] args) {
        float cel = 0;
        float fah = 0;

        fehToCel(77);
        System.out.println("in celcius = " +  celToFeh(27));
        System.out.println("in Fehrenhiet  = " +  fehToCel(77));
    }
    public static float celToFeh(float cel) {
        float fah = (cel * 9f / 5f) + 32f;
        return fah;
    }
    public static float fehToCel(float fah) {
        float cel = (fah - 32f) * 5f / 9f;
        return cel;
    }
}
