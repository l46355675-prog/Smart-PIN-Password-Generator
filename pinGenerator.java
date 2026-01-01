import java.util.*;  

public class pinGenerator {  

    public static void main(String[] args) {  
        Scanner choice = new Scanner(System.in);  
        Random r = new Random();  

        System.out.println("Pin Code Generator");  
        System.out.println("M: make a code, E: exit");  
        String Ans = choice.nextLine();  

        if (Ans.equalsIgnoreCase("M")) {  

            System.out.println("How long do you want the pin: ");  
            int pool = choice.nextInt();  
            choice.nextLine();

            System.out.println("Want letter Y/N: ");  
            String letter = choice.nextLine();  

            System.out.println("Want numbers Y/N: ");  
            String numbers = choice.nextLine();  

            System.out.println("Want SpecialChar Y/N: ");  
            String specialChar = choice.nextLine();  

            if(pool <= 5) {  
                System.out.println("Not strong");  
            }  

            System.out.println("How many codes you want: ");
            int opt = choice.nextInt();
            choice.nextLine();

            for(int i = 0; i < opt; i++ ) {
                String code = ""; // reset code for each PIN
                for (int j = 0; j < pool; j++) {
                    if (letter.equalsIgnoreCase("y")) {
                        char letters = (char) ('a' + r.nextInt(26));
                        code += letters;
                    }
                    if (numbers.equalsIgnoreCase("y")) {
                        int num = r.nextInt(10);
                        code += num;
                    }
                    if (specialChar.equalsIgnoreCase("y")) {
                        String specials = "!@#$%^&*";
                        char sp = specials.charAt(r.nextInt(specials.length()));
                        code += sp;
                    }
                }
                System.out.println("Generated PIN: " + code);
            }

        } else {  
            System.out.println("Bye...");  
            System.exit(0);  
        }  
    }  
}