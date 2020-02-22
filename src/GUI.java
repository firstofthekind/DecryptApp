import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextArea textIn;
    private JTextArea textOut;
    private JTextField textKey;
    private JButton Encrypt;
    private JButton Decrypt;
    Decrypt decrypt = new Decrypt();
    Encrypt encrypt = new Encrypt();

    public GUI() {
        setTitle("Шифратор сообщений");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        textIn = new JTextArea();
        textIn.setBounds(10, 11, 564, 140);
        getContentPane().add(textIn);
        textOut = new JTextArea();
        textOut.setBounds(10, 210, 564, 140);
        getContentPane().add(textOut);
        textKey = new JTextField();
        textKey.setBounds(60, 173, 150, 20);
        getContentPane().add(textKey);
        JLabel lblkey = new JLabel("Ключ:");
        lblkey.setBounds(10, 176, 46, 14);
        getContentPane().add(lblkey);
        JButton btnEncode = new JButton("Закодировать");
        btnEncode.addActionListener(e -> {
            String inMsg = textIn.getText();
            String inKey = textKey.getText();
            String outMsg = encrypt.encrypt(inMsg, inKey);
            textOut.setText(outMsg);

        });
        btnEncode.setBounds(260, 172, 150, 23);
        getContentPane().add(btnEncode);
        JButton btnDecode = new JButton("Раскодировать");
        btnDecode.addActionListener(e -> {
            String inMsg = textIn.getText();
            String inKey = textKey.getText();
            String outMsg = decrypt.decrypt(inMsg, inKey);
            textOut.setText(outMsg);

        });
        btnDecode.setBounds(420, 172, 150, 23);
        getContentPane().add(btnDecode);
    }


}
