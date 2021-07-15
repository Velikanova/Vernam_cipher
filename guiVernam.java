import Java2.enc.*;
import Java3.dec.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class guiVernam extends JFrame {
  private JButton encrypt;
  private JButton decipher;
  
  private JTextField outputField;
  private JTextField keyField;
  private JTextField textField;
  
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;

  
  public guiVernam(){
    super("Vernam cipher");
    
    encrypt = new JButton("Encrypt");
    decipher = new JButton("Decipher");
    
    outputField = new JTextField(20);
    textField = new JTextField(10);
    keyField = new JTextField(10);
    
    label1 = new JLabel("key: ");
    label2 = new JLabel("text: ");
    label3 = new JLabel("result: ");
    
//     textField.setToolTipText("Длиное поле");
//     keyField.setToolTipText("Длиное поле");
//     output.setToolTipText("Длиное поле");
//     keyField.setFont(new Font("Dialog", Font.PLAIN, 14)); // размер поля ввода - длина
//     keyField.setColumns(16); // размер поля ввода - ширина

    
    //Подготавливаем временные компоненты
    JPanel buttonsPanel = new JPanel(new FlowLayout());
    JPanel keyPanel = new JPanel(new FlowLayout());
    JPanel outputPanel = new JPanel();

    //Расставляем компоненты по местам
    keyPanel.add(label1);
    keyPanel.add(textField);
    keyPanel.add(label2);
    keyPanel.add(keyField);
    buttonsPanel.add(encrypt);
    buttonsPanel.add(decipher);
    outputPanel.add(label3);
    outputPanel.add(outputField);


    add(buttonsPanel, BorderLayout.CENTER);
    add(keyPanel, BorderLayout.NORTH);
    add(outputPanel, BorderLayout.PAGE_END);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ActionListener actionListener1 = new TestActionListener1();
    encrypt.addActionListener(actionListener1);
    
    ActionListener actionListener2 = new TestActionListener2();
    decipher.addActionListener(actionListener2);
}

public class TestActionListener1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        //Код, который нужно выполнить при нажатии
        String str = textField.getText();
        String key = keyField.getText();
        Java2.enc.main(str, key);

        Java2.enc res = new Java2.enc();
        outputField.setText(res.main(str, key));
        }
    }
    
public class TestActionListener2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        //Код, который нужно выполнить при нажатии
        String str = textField.getText();
        String key = keyField.getText();
        Java3.dec.main(str, key);
        
        Java3.dec res = new Java3.dec();
        outputField.setText(res.main(str, key));
        }
    }


public static void main(String[] args) {
    guiVernam app = new guiVernam();
    app.setVisible(true);
    app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна

  }
}
