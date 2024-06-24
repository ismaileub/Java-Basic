public class BitwiseOperators {
    
        public static void main(String[] args) {
            int a = 60; // 60 = 0011 1100
            int b = 13; // 13 = 0000 1101
    
            // Bitwise AND
            int andResult = a & b; // 12 = 0000 1100
            System.out.println("a & b = " + andResult);
    
            // Bitwise OR
            int orResult = a | b; // 61 = 0011 1101
            System.out.println("a | b = " + orResult);
    
            // Bitwise XOR
            int xorResult = a ^ b; // 49 = 0011 0001
            System.out.println("a ^ b = " + xorResult);
    
            // Bitwise Complement
            int complementResult = ~a; // -61 = 1100 0011
            System.out.println("~a = " + complementResult);
    
            // Left Shift
            int leftShiftResult = a << 2; // 240 = 1111 0000
            System.out.println("a << 2 = " + leftShiftResult);
    
            // Right Shift
            int rightShiftResult = a >> 2; // 15 = 0000 1111
            System.out.println("a >> 2 = " + rightShiftResult);
    
            // Unsigned Right Shift
            int unsignedRightShiftResult = a >>> 2; // 15 = 0000 1111
            System.out.println("a >>> 2 = " + unsignedRightShiftResult);
        }
    
    
    
}
