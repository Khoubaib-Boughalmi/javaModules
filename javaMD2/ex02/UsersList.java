package ex02;

public interface UsersList {
  void addUser(User user);
  User getUserByID(int id);
  User getUserByIndex(int index);
  int getNumberOfUsers();
}