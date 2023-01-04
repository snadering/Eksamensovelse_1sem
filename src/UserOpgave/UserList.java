package UserOpgave;

import java.util.ArrayList;

public class UserList {

   private ArrayList<User> listOfUsers = new ArrayList<>();

    public UserList() {
    }

    public void addUser(User user){

        for (User u : listOfUsers){
           if(u.getEmail().equalsIgnoreCase(user.getEmail())){
               return;
           }
        }
        listOfUsers.add(user);
    }

    public void printList(){

        for (User user : listOfUsers){
            System.out.println(user);
        }
    }


}
