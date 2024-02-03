public class UserApp {
    public static void main(String[] args) {

        User user = new User.UserBuilder()

                .age(21)
                .firstName("Jenzel")
                .lastName("Serapio")
                .email("jenzel.serapio@neu.edu.ph")
                .address("249 Coloong 2 Valenzuela City")
                .phone("09954679197")


                .build();

        System.out.println("First Name " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email Address: " + user.email);
        System.out.println("Home Address: " + user.address);
        System.out.println("Phone Number: " + user.phone);
        System.out.println("Age: " + user.age);

    }
}