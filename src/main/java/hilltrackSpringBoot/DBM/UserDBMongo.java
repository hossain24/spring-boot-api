package hilltrackSpringBoot.DBM;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import hilltrackSpringBoot.Model.User;

@Repository
@Qualifier("mongoDB")
public class UserDBMongo implements UserDB{

	Connection mongoconnection;
	
	@Override
	public Collection<User> getAllUsers() {
		return new ArrayList<User>(){
			{
				add(new User(1, "Daniel Craig", "Innovation"));
			}
		};
	}

	@Override
	public User getUserById(int id) {
		return null;
	}

	@Override
	public void deleteUserById(int id) {
				
	}

	@Override
	public void updateUser(User user) {
				
	}

	@Override
	public void insertUser(User user) {
				
	}

}
