package Controller;

import java.util.Optional;
import java.util.ArrayList;
import Logic.*;

public class UserController {

    private ArrayList<User> userList;
    private User currentUser;

    public UserController() {
        userList = new ArrayList<User>();
        addEmployee("admin", "123");
    }

    public Optional<User> getCurrentUser() {
        return Optional.ofNullable(currentUser);
    }

    public void addEmployee(String nama, String nomorTelepon) {
        currentUser = new User(nama, nomorTelepon, "pegawai");
        userList.add(currentUser);
    }

    public void addCustomer(String nama, String nomorTelepon) {
        currentUser = new User(nama, nomorTelepon, "pelanggan");
        userList.add(currentUser);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User login(String nama, String nomorTelepon) {
        for (User user : userList) {
            if (user.getName().equals(nama) && user.getPhoneNumber().equals(nomorTelepon)) {
                currentUser = user;
                return user;
            }
        }
        return null;
    }

    public void logout() {
        this.currentUser = null;
    }
}
