import javax.swing.*;

public class Frame extends JFrame{
    Frame(JPanel pnl){
        setDefaultCloseOperation(3);
        setVisible(true);
        add(pnl);
        pack();
        setLocationRelativeTo(null);
    }
}
