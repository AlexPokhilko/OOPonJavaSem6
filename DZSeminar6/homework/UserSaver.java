package homework;

public class UserSaver {
    public void save(User user){
            Persister persister = new Persister(user);
            persister.save();
    }
}
