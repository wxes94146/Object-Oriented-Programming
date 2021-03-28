public class Assignment_ch05_1 {
    public static void main(String[] args) {
        double result = 0;
        int denominator = 1;
        int term = 0;

        for (int i = 1; i <= 200000; i++) {
            if ((i % 2) != 0) {
                result = result + ((double) 4 / denominator); //Positive part of infinite series
                denominator = denominator + 2;
            }
            else {
                result = result - ((double) 4 / denominator); //negative part of infinite series
                denominator = denominator + 2;
            }
            
            if (result > 3.14159 && result < 3.14160) { 
                term = i;
                break;
            }

            System.out.printf("%f\n", result);
        }
        
        System.out.printf("The terms have to use before first get a value that begins with 3.14159: %d", term);
    }
}