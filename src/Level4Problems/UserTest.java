package Level4Problems;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.rank());
        user.incrementProgress(-8);
        System.out.println(user.progress);

    }

}
