package Controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import View.*;

public class ViewController extends JFrame {
    
    
    private UserController userController = new UserController();
    private OrderController orderController = new OrderController();
    
    public ViewController() {
        orderController.tambahOrderBaju(2.0, "Kering", 3);
        //orderController.tambahOrderSelimut(2, "Setrika", 3);
    }
    
    public void loadController(UserController userController, OrderController orderController) {
        this.userController = userController;
        this.orderController = orderController;
    }

    public UserController getUserController() {
        return userController;
    }

    public OrderController getOrderController() {
        return orderController;
    }
    
    private ViewController getFrame(String viewName) {
        if(viewName.equals("login")){
            return new Login();
        } else if(viewName.equals("register")) {
            return new Register();
        } else if(viewName.equals("dashboard")) {
            return new Dashboard();
        } else
            return null;
    }
    
    public void openFrame(String name) {
        ViewController frame = getFrame(name);

        if (frame == null) {
            JOptionPane.showMessageDialog(this, "Frame tidak ditemukan!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            frame.loadController(userController, orderController);
            frame.setLocationRelativeTo(this);
            this.dispose();
            frame.setVisible(true);
        }
    }
}
