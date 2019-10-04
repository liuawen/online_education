package v1ch02.Welcome;

/**
 * This program displays a greeting for the reader.
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2019-10-04 13:04
 */
public class Welcome {
    public static void main(String[] args){
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
