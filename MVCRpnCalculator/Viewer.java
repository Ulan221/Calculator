import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;

public class Viewer extends JFrame {


  protected JTextField textField;
  protected JTextField textFieldHistory;
  JFrame frame;

  public Viewer() {
    super("RpnCalculator");
    Controller controller = new Controller(this);


    textField = new JTextField("");
    Dimension textFieldSize = new Dimension(450, 110);
    textField.setPreferredSize(textFieldSize);

    textFieldHistory = new JTextField("");
    Dimension historyTextSize = new Dimension(450, 80);
    textFieldHistory.setPreferredSize(historyTextSize);

    JButton oneBtn         = new JButton("1");
    JButton twoBtn         = new JButton("2");
    JButton threeBtn       = new JButton("3");
    JButton fourBtn        = new JButton("4");
    JButton fiveBtn        = new JButton("5");
    JButton sixBtn         = new JButton("6");
    JButton sevenBtn       = new JButton("7");
    JButton eightBtn       = new JButton("8");
    JButton nineBtn        = new JButton("9");
    JButton zeroBtn        = new JButton("0");
    JButton addBtn         = new JButton("+");
    JButton subBtn         = new JButton("-");
    JButton multBtn        = new JButton("*");
    JButton divBtn         = new JButton("\u00F7");
    JButton dotBtn         = new JButton(".");
    JButton clearBtn       = new JButton("C");
    JButton answerBtn      = new JButton("=");

    oneBtn.addActionListener(controller);
    oneBtn.setActionCommand("One");
    twoBtn.addActionListener(controller);
    twoBtn.setActionCommand("Two");
    threeBtn.addActionListener(controller);
    threeBtn.setActionCommand("Three");
    fourBtn.addActionListener(controller);
    fourBtn.setActionCommand("Four");
    fiveBtn.addActionListener(controller);
    fiveBtn.setActionCommand("Five");
    sixBtn.addActionListener(controller);
    sixBtn.setActionCommand("Six");
    sevenBtn.addActionListener(controller);
    sevenBtn.setActionCommand("Seven");
    eightBtn.addActionListener(controller);
    eightBtn.setActionCommand("Eight");
    nineBtn.addActionListener(controller);
    nineBtn.setActionCommand("Nine");
    zeroBtn.addActionListener(controller);
    zeroBtn.setActionCommand("Zero");
    addBtn.addActionListener(controller);
    addBtn.setActionCommand("Add");
    subBtn.addActionListener(controller);
    subBtn.setActionCommand("Sub");
    multBtn.addActionListener(controller);
    multBtn.setActionCommand("Mult");
    divBtn.addActionListener(controller);
    divBtn.setActionCommand("Div");
    clearBtn.addActionListener(controller);
    clearBtn.setActionCommand("Clear");
    dotBtn.addActionListener(controller);
    dotBtn.setActionCommand("Dot");
    answerBtn.addActionListener(controller);
    answerBtn.setActionCommand("Answer");

    JPanel panel = new JPanel();
    JPanel topPanel = new JPanel(new BorderLayout());

    topPanel.add(textField, BorderLayout.CENTER);
    topPanel.add(textFieldHistory, BorderLayout.NORTH);
    Font textFont = new Font("Arial", Font.PLAIN, 30);
    textField.setFont(textFont);
    textFieldHistory.setFont(textFont);
    panel.add(topPanel);

    Dimension button1PreferredSize = new Dimension(105, 90);
    oneBtn.setPreferredSize(button1PreferredSize);
    oneBtn.setFont(textFont);
    twoBtn.setFont(textFont);
    threeBtn.setFont(textFont);
    fourBtn.setFont(textFont);
    fiveBtn.setFont(textFont);
    sixBtn.setFont(textFont);
    sevenBtn.setFont(textFont);
    eightBtn.setFont(textFont);
    nineBtn.setFont(textFont);
    zeroBtn.setFont(textFont);
    dotBtn.setFont(textFont);
    addBtn.setFont(textFont);
    subBtn.setFont(textFont);
    multBtn.setFont(textFont);
    divBtn.setFont(textFont);
    clearBtn.setFont(textFont);
    answerBtn.setFont(textFont);
    panel.add(oneBtn);

    JPanel middlePanel = new JPanel(new GridLayout(4, 4, 10, 10));
    middlePanel.add(oneBtn);
    middlePanel.add(twoBtn);
    middlePanel.add(threeBtn);
    middlePanel.add(addBtn);
    middlePanel.add(fourBtn);
    middlePanel.add(fiveBtn);
    middlePanel.add(sixBtn);
    middlePanel.add(subBtn);
    middlePanel.add(sevenBtn);
    middlePanel.add(eightBtn);
    middlePanel.add(nineBtn);
    middlePanel.add(multBtn);
    middlePanel.add(clearBtn);
    middlePanel.add(zeroBtn);
    middlePanel.add(dotBtn);
    middlePanel.add(divBtn);
    panel.add(middlePanel);

    JPanel lowPanel = new JPanel(new BorderLayout());
    Dimension answerBtnSize = new Dimension(450, 80);
    answerBtn.setPreferredSize(answerBtnSize);
    lowPanel.add(answerBtn, BorderLayout.SOUTH);
    panel.add(lowPanel);

    getContentPane().add(panel);
    setBounds(600, 150, 500, 750);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public void appendToResultTextField(String text) {
      String currentText = textField.getText();
      textField.setText(currentText + text);
  }

  public void appendToHistoryTextField(String text) {
      String currentText = textFieldHistory.getText();
      textFieldHistory.setText(currentText + text);
  }
}
