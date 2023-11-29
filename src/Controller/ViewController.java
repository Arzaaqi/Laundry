package Controller;

import Logic.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import View.*;

public class ViewController extends JFrame {

    private UserController userController = new UserController();
    private OrderController orderController = new OrderController();

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
        return switch (viewName) {
            case "login" ->
                new Login();
            case "register" ->
                new Register();
            case "dashboard" ->
                new Dashboard();
            case "dashboard_customer" ->
                new DashboardCus();
            case "order_status" ->
                new OrderStatus();
            case "menu_item" ->
                new MenuItem();
            default ->
                null;
        };
    }

    private void openFrame(ViewController frame) {
        if (frame == null) {
            JOptionPane.showMessageDialog(this, "Frame tidak ditemukan!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            frame.loadController(userController, orderController);
            frame.setLocationRelativeTo(this);
            frame.afterOpen();
            this.dispose();
            frame.setVisible(true);
        }
    }

    public void openFrame(String viewName) {
        ViewController frame = getFrame(viewName);
        openFrame(frame);
    }

    public void openFrame(Order order) {
        ViewController frame = new OrderDetail(order);
        openFrame(frame);
    }

    public void openFrame(LogicKeranjang keranjang) {
        ViewController frame = new ViewKeranjang(keranjang);
        openFrame(frame);
    }

    public void afterOpen() {

    }
}
