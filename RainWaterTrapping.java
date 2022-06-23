public class RainWaterTrapping {
    public static void main(String[] args) {
        int bars[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int leftbarsmax[] = new int[bars.length];// ye hi mera prefixmax hoga
        int rightbarsmax[] = new int[bars.length];// ye hi mera suffixmax hoga
        // first we find the leftbarsmax
        leftbarsmax[0] = bars[0];// set the first element in the prefix max
        for (int i = 1; i < leftbarsmax.length; i++) {
            leftbarsmax[i] = Math.max(leftbarsmax[i - 1], bars[i]);
        }
        // similarly we find rightbarsmax which means suffixmax so, we do a reverse loop
        System.out.println("Prefix max");
        for (int pre : leftbarsmax) {
            System.out.print(pre + " ");
        }
        System.out.println();
        rightbarsmax[rightbarsmax.length - 1] = bars[bars.length - 1];// set then last element in the suffix max
        // loop mei humne -2 isliye kiya kyoki -1 to hum pehle initialize karte hue kar
        // dioya tha that's whay we do -2
        for (int i = rightbarsmax.length - 2; i >= 0; i--) {// minus 2 isliye kardiya kyoki hume piche jana padejgaa naa
            rightbarsmax[i] = Math.max(rightbarsmax[i + 1], bars[i]);
        }
        System.out.println("Suffix Max");
        for (int suf : rightbarsmax) {
            System.out.print(suf + " ");
        }
        System.out.println();
        // ye jo hai pre or suf iski koi need nahi ye to sirf humne samajne ke liye
        // print karaya hai
        int amountofwater = 0;
        for (int i = 0; i < bars.length; i++) {
            // sabse pehle hume ye batana padega ki hamare pass current pillar kya hai
            // current pillar nikalne ke baad fir mei iske baat karunga ki iske left mei kya
            // hai or iske right mei kya hai
            int currentpillar = bars[i];
            int barminheight = Math.min(leftbarsmax[i], rightbarsmax[i]);// isse mujhe ye pata chal gaya ki dono mei se
                                                                         // minimum konsa hai
            if (barminheight > currentpillar) {
                amountofwater += barminheight - currentpillar;
            }
        }
        System.out.println("The amount of water is " + amountofwater);
    }
}
