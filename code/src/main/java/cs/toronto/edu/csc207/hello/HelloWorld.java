package cs.toronto.edu.csc207.hello;
import javax.swing.*;


/** Introductory Hello World program demonstrating the basics of Java. */
public class HelloWorld {

  /**
   * Entry point — prints a greeting to standard output.
   *
   * @param args command-line arguments (unused).
   */
  public static void main(String[] args) {
    JPanel namePanel = new JPanel();
    namePanel.setLayout(new BoxLayout(namePanel,BoxLayout.Y_AXIS));
    namePanel.add(new JLabel("Name:"));
    JTextField nameField = new JTextField(10);
    namePanel.add(nameField);

    JPanel rarityPanel = new JPanel();
    rarityPanel.setLayout(new BoxLayout(rarityPanel,BoxLayout.Y_AXIS));
    rarityPanel.add(new JLabel("Rarity:"));
    JTextField rarityField = new JTextField(10);
    rarityPanel.add(rarityField);

    JButton createButton = new JButton("Add to wishlist");
    JPanel mainPanel = new JPanel();
    mainPanel.add(namePanel);
    mainPanel.add(rarityPanel);
    mainPanel.add(createButton);

    JFrame frame = new JFrame("Hatchimal Creator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(mainPanel);
    frame.pack();
    frame.setVisible(true);

  }
}
