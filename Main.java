package busreservation;


public class Main {
    public static void main(String[] args) {
        LoginSignup loginSignup = new LoginSignup();
        UserOperation userOperation = new UserOperation();
        AdminOperations adminOperations = new AdminOperations();
//        Signing up into the portal
        System.out.println(loginSignup.signup("sai",528639417,"sai@gamil","siva","csp","ap","1234567890"));
        System.out.println(loginSignup.signup("sathvik",52863417,"sathvik@gaml","siva","csp","ap","1234567890"));
        System.out.println(loginSignup.signup("shankar",528639417,"shankar@gamil","siva","csp","ap","1234567890"));
//        Logging in into the portal
        System.out.println(loginSignup.login("sai@gamil","1234567890"));
        System.out.println(loginSignup.login("sai@gaml","1234567890"));
//        Creating new bus details
        adminOperations.createBus("AP 21 CG 3281","self","AP","Delhi");
        adminOperations.createBus("AP 71 CG 1234","driver","UP","HYD");
//        updating username
        userOperation.updateUserName("sai@gamil","sathvik");
//        displaying the updated username
        System.out.println(userOperation.findUser("sai@gamil"));

    }
}
