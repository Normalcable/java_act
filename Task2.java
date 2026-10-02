//Create all of the primitives (except long and double) with different values. 
//Concatenate them into a string and print it to the screen so it will print: H3110 wOrld 2.0 true

public class Task2 {
    public static void main(String[] args) {
        int i = 3110;
        char c = 'H';
        short s = 12;
        byte b = 7;
        boolean bl = true;
        float f = 2.0f;

        String output = "" + c + i + " wOrld " + f + " " + bl;

        System.out.println(output);
    }
}