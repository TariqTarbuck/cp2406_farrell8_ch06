// DebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
public class DebugSix2
{
    public static void main(String args[])
    {
        int letter = 0;
        int a;
        final int MIN = 65;
        final int MAX = 122;
        final int STOPLINEONE = 85;
        final int STOPLINETWO = 122;
        for(a = MIN; a <= MAX; a++)
            letter = (char)a;
        System.out.print("  " + letter);
        if((a == STOPLINEONE) & (a == STOPLINETWO))
            System.out.println();
        System.out.println("\nEnd of application");
    }
}