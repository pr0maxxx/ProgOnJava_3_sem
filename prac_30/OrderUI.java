package ru.maksim.ikbo2021.new_pracs.prac_30;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrderUI extends JFrame {
    TableOrdersManager tableOrderManager = new TableOrdersManager(32);
    InternetOrdersManager internetTableManager = new InternetOrdersManager();
    Order currentInternetOrder = new InternetOrder();
    Order currentTableOrder = new TableOrder();
    int SelectedTable = -1;

    OrderUI() {
        super("orderUI");
        this.setSize(new Dimension(720, 1080));
        this.setLayout(new GridLayout(3, 3));
        final JTextArea currentOrderText = new JTextArea("Order: ");
        currentOrderText.setEditable(false);
        final JTextArea allOrdersText = new JTextArea("Orders: ");
        allOrdersText.setEditable(false);
        final Map<String, Dish> dishesForOrder = new HashMap();
        dishesForOrder.put("Lazanya", new Dish("Lazanya", "Tasty lazanya", 500));
        dishesForOrder.put("Potato", new Dish("Potato", "Tasty potato", 400));
        dishesForOrder.put("Sausage", new Dish("Sausage", "Tasty sausage", 300));
        final Map<String, Drink> drinksForOrder = new HashMap();
        drinksForOrder.put("Vodka", new Drink("Vodka", "Alcohol drink", 500, DrinkTypeEnum.VODKA, 40.0D));
        drinksForOrder.put("Water", new Drink("Water", "Not alcohol drink", 400, DrinkTypeEnum.WATER, 0.0D));
        drinksForOrder.put("Tea", new Drink("Tea", "Tasty tea", 300, DrinkTypeEnum.TEA, 0.0D));
        JComboBox dishesOrderComboBox = new JComboBox(dishesForOrder.keySet().toArray());
        dishesOrderComboBox.setMaximumSize(new Dimension(200, 200));
        dishesOrderComboBox.setBackground(Color.white);
        JComboBox drinksOrderComboBox = new JComboBox(drinksForOrder.keySet().toArray());
        drinksOrderComboBox.setMaximumSize(new Dimension(200, 200));
        drinksOrderComboBox.setBackground(Color.white);
        JButton btnCreateOrder = new JButton("Add order");
        JRadioButton btnInternetOrder = new JRadioButton("Internet order");
        btnInternetOrder.setSelected(true);
        final JRadioButton btnTableOrder = new JRadioButton("Table order");
        btnTableOrder.setSelected(false);
        ButtonGroup chooseType = new ButtonGroup();
        chooseType.add(btnTableOrder);
        chooseType.add(btnInternetOrder);
        final JComboBox tables = new JComboBox(Arrays.toString(this.tableOrderManager.freeTableNumbers()).split("[\\[\\]]")[1].split(", "));
        tables.setVisible(false);
        tables.setBackground(Color.white);
        this.add(btnInternetOrder);
        this.add(tables);
        this.add(btnTableOrder);
        this.add(currentOrderText);
        this.add(btnCreateOrder);
        this.add(allOrdersText);
        this.add(dishesOrderComboBox);
        this.add(new JTextField());
        this.add(drinksOrderComboBox);
        tables.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String option = (String)((JComboBox)e.getSource()).getSelectedItem();
                OrderUI.this.SelectedTable = Integer.parseInt(option);
            }
        });
        btnTableOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(true);
                OrderUI.this.currentInternetOrder = new InternetOrder();
                currentOrderText.setText("Order: ");
            }
        });
        btnInternetOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(false);
                OrderUI.this.currentTableOrder = new TableOrder();
                currentOrderText.setText("Order: ");
            }
        });
        dishesOrderComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox)e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected()) {
                    OrderUI.this.currentTableOrder.add((MenuItem)dishesForOrder.get(option));
                } else {
                    OrderUI.this.currentInternetOrder.add((MenuItem)dishesForOrder.get(option));
                }

                JTextArea var10000 = currentOrderText;
                Object var10001 = dishesForOrder.get(option);
                var10000.append("\n" + String.valueOf(var10001) + "\n");
            }
        });
        drinksOrderComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox)e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected()) {
                    OrderUI.this.currentTableOrder.add((MenuItem)drinksForOrder.get(option));
                } else {
                    OrderUI.this.currentInternetOrder.add((MenuItem)drinksForOrder.get(option));
                }

                JTextArea var10000 = currentOrderText;
                Object var10001 = drinksForOrder.get(option);
                var10000.append("\n" + String.valueOf(var10001) + "\n");
            }
        });
        btnCreateOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentOrderText.setText("Order: ");
                if (OrderUI.this.currentTableOrder.getItems().size() != 0 || OrderUI.this.currentInternetOrder.getItems().size() != 0) {
                    String currentOrder;
                    Iterator var3;
                    MenuItem item;
                    if (btnTableOrder.isSelected()) {
                        if (OrderUI.this.SelectedTable == -1) {
                            return;
                        }

                        OrderUI.this.tableOrderManager.add(OrderUI.this.currentTableOrder, OrderUI.this.SelectedTable);
                        currentOrder = "\nOrder: ";

                        for(var3 = OrderUI.this.currentTableOrder.getItems().iterator(); var3.hasNext(); currentOrder = currentOrder + String.valueOf(item) + "\n") {
                            item = (MenuItem)var3.next();
                        }

                        currentOrder = currentOrder + "( " + OrderUI.this.SelectedTable + " )\n";
                        allOrdersText.append(currentOrder);
                        OrderUI.this.currentTableOrder = new TableOrder();
                        OrderUI.this.SelectedTable = -1;
                    } else {
                        OrderUI.this.internetTableManager.add(OrderUI.this.currentInternetOrder, new Customer("Stas", "Sidorov", 22, new Address("Moscow", 600009, "Mira", 24, 36)));
                        currentOrder = "\nOrder: \n";

                        for(var3 = OrderUI.this.currentInternetOrder.getItems().iterator(); var3.hasNext(); currentOrder = currentOrder + String.valueOf(item) + "\n") {
                            item = (MenuItem)var3.next();
                        }

                        currentOrder = currentOrder + "\n";
                        allOrdersText.append(currentOrder);
                        OrderUI.this.currentInternetOrder = new InternetOrder();
                    }

                }
            }
        });
    }

    public static void main(String[] args) {
        (new OrderUI()).setVisible(true);
    }
}
