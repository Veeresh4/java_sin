public class BloodDonate {
    public static void main(String[] args){
        int age = 18;
        int weight = 55;
        if(age >= 18){
            if(weight >= 50){
                System.out.println("You can donate blood");
            }
        else{
            System.out.println("Not eligible to donate blood");
        }
    }
    else{
            System.out.println("You must have 18 year old");
        }
    }    
}
