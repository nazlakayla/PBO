import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PemesananMakanan extends JFrame {
    private JTextField nameField, addressField, phoneField;
    private JCheckBox steakBox, spaghettiBox, pizzaBox;
    private JTextField totalField;
    private JTextArea orderArea;
    private JButton addButton;

    private final int STEAK_PRICE = 100000;
    private final int SPAGHETTI_PRICE = 40000;
    private final int PIZZA_PRICE = 80000;

    public PemesananMakanan() {
        setTitle("Aplikasi Pemesanan Makanan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("APLIKASI PEMESANAN");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(20));

        JPanel middlePanel = new JPanel(new GridLayout(1, 2, 20, 0));

        JPanel customerPanel = createCustomerPanel();
        middlePanel.add(customerPanel);

        JPanel menuPanel = createMenuPanel();
        middlePanel.add(menuPanel);

        mainPanel.add(middlePanel);
        mainPanel.add(Box.createVerticalStrut(20));

        JPanel totalPanel = createTotalPanel();
        mainPanel.add(totalPanel);
        mainPanel.add(Box.createVerticalStrut(20));

        JPanel orderPanel = createOrderPanel();
        mainPanel.add(orderPanel);

        add(mainPanel);
        pack();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setBackground(Color.LIGHT_GRAY);
    }

    private JPanel createCustomerPanel() {
        JPanel customerPanel = new JPanel(new GridBagLayout());
        customerPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Data Customer"
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        customerPanel.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        customerPanel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        customerPanel.add(new JLabel("Alamat:"), gbc);
        gbc.gridx = 1;
        addressField = new JTextField(20);
        customerPanel.add(addressField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        customerPanel.add(new JLabel("No Telp:"), gbc);
        gbc.gridx = 1;
        phoneField = new JTextField(20);
        customerPanel.add(phoneField, gbc);

        return customerPanel;
    }

    private JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Pilih Menu"
        ));

        steakBox = new JCheckBox("Steak");
        spaghettiBox = new JCheckBox("Spaghetti");
        pizzaBox = new JCheckBox("Pizza");

        ItemListener menuListener = e -> updateTotal();
        steakBox.addItemListener(menuListener);
        spaghettiBox.addItemListener(menuListener);
        pizzaBox.addItemListener(menuListener);

        menuPanel.add(steakBox);
        menuPanel.add(spaghettiBox);
        menuPanel.add(pizzaBox);

        return menuPanel;
    }

    private JPanel createTotalPanel() {
        JPanel totalPanel = new JPanel();
        totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));

        JPanel totalFieldPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel totalLabel = new JLabel("TOTAL BAYAR");
        totalFieldPanel.add(totalLabel);

        JPanel blackFieldPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        totalField = new JTextField(15);
        totalField.setEditable(false);
        totalField.setBackground(Color.BLACK);
        totalField.setForeground(Color.YELLOW);
        totalField.setHorizontalAlignment(JTextField.RIGHT);
        totalField.setText("0");
        blackFieldPanel.add(totalField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addButton = new JButton("TAMBAH");
        addButton.setBorder(new LineBorder(Color.BLACK, 1, true));
        addButton.addActionListener(e -> addOrder());
        buttonPanel.add(addButton);

        totalPanel.add(totalFieldPanel);
        totalPanel.add(Box.createVerticalStrut(3));
        totalPanel.add(blackFieldPanel);
        totalPanel.add(Box.createVerticalStrut(5));
        totalPanel.add(buttonPanel);

        return totalPanel;
    }

    private JPanel createOrderPanel() {
        JPanel orderPanel = new JPanel(new BorderLayout());
        orderPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Data Penjualan"
        ));

        orderArea = new JTextArea(10, 40);
        orderArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(orderArea);
        orderPanel.add(scrollPane, BorderLayout.CENTER);

        return orderPanel;
    }

    private void updateTotal() {
        int total = 0;
        if (steakBox.isSelected()) total += STEAK_PRICE;
        if (spaghettiBox.isSelected()) total += SPAGHETTI_PRICE;
        if (pizzaBox.isSelected()) total += PIZZA_PRICE;
        totalField.setText(String.valueOf(total));
    }

    private void addOrder() {
        StringBuilder order = new StringBuilder();
        order.append("Nama: ").append(nameField.getText()).append("\n");
        order.append("Alamat: ").append(addressField.getText()).append("\n");
        order.append("Telp: ").append(phoneField.getText()).append("\n");
        order.append("---------------------------------\n");
        order.append("Pesanan:\n");

        if (steakBox.isSelected()) {
            order.append("- Steak (").append(STEAK_PRICE).append(")\n");
        }
        if (spaghettiBox.isSelected()) {
            order.append("- Spaghetti (").append(SPAGHETTI_PRICE).append(")\n");
        }
        if (pizzaBox.isSelected()) {
            order.append("- Pizza (").append(PIZZA_PRICE).append(")\n");
        }

        order.append("---------------------------------\n");
        order.append("Total Bayar:\n");
        order.append("    Rp. ").append(totalField.getText()).append("\n\n");

        orderArea.append(order.toString());

        // Reset form
        nameField.setText("");
        addressField.setText("");
        phoneField.setText("");
        steakBox.setSelected(false);
        spaghettiBox.setSelected(false);
        pizzaBox.setSelected(false);
        totalField.setText("0");
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new PemesananMakanan().setVisible(true);
        });
    }
}