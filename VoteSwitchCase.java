public class VoteSwitchCase {
    public static void main(String [] args) {
        int age = 41;
        switch(age){
            case 21:
            System.out.println("Your are eligible to vote");
            break;
            case 17:
            System.out.println("Your not eligible to vote");
            break;
            default:
            System.out.println("Invalid");
        }
    }
}
