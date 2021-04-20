package ui;

import javax.swing.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textTel;
    private JButton buttonSave;
    private JButton buttonRemove;

    public ContactForm(){
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
    }

}
