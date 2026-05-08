public class inputandConcatenatePractice {
    public static void main(String[] args) {
        String firstName = "Rahul";
        String lastName = "Kumar";
        String name = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(name.toUpperCase());
        System.out.println(fullName.toUpperCase());
    }
}