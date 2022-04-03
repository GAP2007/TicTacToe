import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.MouseInputListener;



public class Panel extends JPanel{
    boolean XRule = true;
    JButton[] buttons = new JButton[9];
    Font f;
    JLabel winLabel; 
    
    Panel(){
        f = new Font("Courier", Font.BOLD, 60);
        setPreferredSize(new Dimension(500, 500));
        setLayout(new GridLayout(3, 3, 20, 10));
        
          


        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            add(buttons[i]);
            Play(buttons[i]);
        }
    }
    public void setWiner(String Winer){
        JLabel label = new JLabel();
        add(label);
        label.setBounds(250, 250 , 100, 100);
        label.setText("Winer is :" + Winer);
    }
    public void Play(JButton btn){
        btn.addMouseListener(new MouseInputListener() {
            
            @Override
            public void mouseClicked(MouseEvent arg0) {
                if(XRule){
                    XRule = false;
                    ChangeButtonTo(btn, "X");
                    CheckForWin();
                }
                else{
                    ChangeButtonTo(btn, "O");
                    XRule = true;
                    CheckForWin();
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent arg0) {
                
            }
            
            @Override
            public void mouseExited(MouseEvent arg0) {
                
            }
            
            @Override
            public void mousePressed(MouseEvent arg0) {
                
            }
            
            @Override
            public void mouseReleased(MouseEvent arg0) {
                
            }

            @Override
            public void mouseDragged(MouseEvent arg0) {
                
            }

            @Override
            public void mouseMoved(MouseEvent arg0) {
                
            }
            
        });
    }
    public void ChangeButtonTo(JButton btn,String Mark){
        btn.setFont(f);
        btn.setText(Mark);
    }
    public void CheckForWin(){
        if(buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X" 
        || buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X"
        || buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X"
        || buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X"
        || buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X"
        || buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X"
        || buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X"){
            setWiner("X");
        }
        if(buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O" 
        || buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O"
        || buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O"
        || buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O"
        || buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O"
        || buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O"
        || buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O"){
            setWiner("O");
       }
       if(buttons[0] != null && buttons[1] != null && buttons[2] != null && buttons[3] != null && buttons[4] != null && buttons[5] != null && buttons[6] != null && buttons[7] != null && buttons[8] != null){
            setWiner("No One it's a Tie");
       }
        
    }
}
