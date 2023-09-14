public class RemoveSpacesStr {
    public static void main(String[] args) {
        String str = "Remove spaces";
        str = str.replaceAll("\\s+","");
        System.out.println(str);
    }
}