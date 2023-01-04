package UserOpgave;

public class Opgave4 {

    public static void main(String[] args) {
        UserList userList = new UserList();

        User user1 = new User("Sander", "Roust", "sanderroust@gmail.com", "27319885");
        User user2 = new User("Torben", "Larsen", "TorbenLarsen@gmail.org");
        User user3 = new User("Torben", "Larsen", "TorbenLarsen@gmail.org");

        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.printList();

    }
}
