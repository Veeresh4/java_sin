public class VowelsConsStr {
    public static void main(String[] args) {
        String str = "veeresh";
        int VowelCount = 0;
        int ConsonantCount= 0;
        str = str.toLowerCase();
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    VowelCount++;
                } else {
                    ConsonantCount++;
                }
            }
        }
        System.out.println(VowelCount);
        System.out.println(ConsonantCount);
    }
}
