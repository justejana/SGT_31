public class MathClass {
    public static void main(String[] args) {
        float num = 5.154f;
        System.out.println(num);

       //Rounding down
        System.out.println(Math.floor(num));

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding according to Math principles
        System.out.println(Math.round(num));

        //Absolute value
        System.out.println(Math.abs(num));

        //Power
        System.out.println(Math.pow(2,2));

       //Square root
        System.out.println(Math.sqrt(64));

        //Finding Max value between 2 values
        System.out.println(Math.max(100, 103.6));

        // Finding min value between 2 values
        System.out.println(Math.min(55,43));

        /// Random number
        System.out.println((int) (Math.random() * 10));

        //Casting
        System.out.println((int) 99.989);

        System.out.println((10 + 5) * 2);
    }
}
