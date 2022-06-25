// Java program to find if x is a
// perfect square.
class GFG {
 
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
           
            // Find floating point value of
            // square root of x.
            int sr = (int)Math.sqrt(x);
           
            // if product of square root
            // is equal, then
            // return T/F
 
            return ((sr * sr) == x);
        }
        return false;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int x = 2502;
 
        if (isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}