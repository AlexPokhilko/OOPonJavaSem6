package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
//        user.report();
//        user.save();

        UserReporter userReporter = new UserReporter();
        userReporter.report(user);
        UserSaver userSaver = new UserSaver();
        userSaver.save(user);
    }
}