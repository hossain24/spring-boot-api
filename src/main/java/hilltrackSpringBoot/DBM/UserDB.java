package hilltrackSpringBoot.DBM;

import java.util.Collection;

import hilltrackSpringBoot.Model.User;

public interface UserDB {

	Collection<User> getAllUsers();

	User getUserById(int id);

	void deleteUserById(int id);

	void updateUser(User user);

	void insertUser(User user);

}