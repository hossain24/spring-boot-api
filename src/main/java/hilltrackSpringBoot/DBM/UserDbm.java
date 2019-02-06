package hilltrackSpringBoot.DBM;
import hilltrackSpringBoot.Model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("UserDbm")
public class UserDbm implements UserDB {
	
	private static Map<Integer, User> users;
	
	static {
		users = new HashMap<Integer, User>(){
			{
				put(1, new User(1, "John Kim", "Travel"));
				put(2, new User(2, "Jason Born", "Assassinataion"));
				put(3, new User(3, "Marry Julie", "Dream"));
			}
		};
	}
	
	@Override
	public Collection<User> getAllUsers(){
		return UserDbm.users.values();
	}
	
	@Override
	public User getUserById(int id) {
		return UserDbm.users.get(id);
	}

	@Override
	public void deleteUserById(int id) {
		UserDbm.users.remove(id);
	}
	
	@Override
	public void updateUser(User user) {
		User u  = users.get(user.getId());
		u.setName(user.getName());
		u.setChoice(user.getChoice());
		users.put(user.getId(), user);
	}

	@Override
	public void insertUser(User user) {
		UserDbm.users.put(user.getId(), user);		
	}

}
