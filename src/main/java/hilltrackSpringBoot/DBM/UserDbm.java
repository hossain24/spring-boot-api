package hilltrackSpringBoot.DBM;
import hilltrackSpringBoot.Model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class UserDbm {
	
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
	
	public Collection<User> getAllUsers(){
		return this.users.values();
	}
	
	public User getUserById(int id) {
		return this.users.get(id);
	}

	public void deleteUserById(int id) {
		this.users.remove(id);
	}
	
	public void updateUser(User user) {
		User u  = users.get(user.getId());
		u.setName(user.getName());
		u.setChoice(user.getChoice());
		users.put(user.getId(), user);
	}

	public void insertUser(User user) {
		this.users.put(user.getId(), user);		
	}

}
