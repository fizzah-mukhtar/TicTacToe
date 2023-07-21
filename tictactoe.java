import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class tictactoe extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    public tictactoe() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    private void gameScore()
    {
        jlblplayerX.setText(String.valueOf(xCount));
        jlblplayerO.setText(String.valueOf(oCount));
    }
    private void choose_a_player()
    {
        if (startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
                startGame = "X";
        }
    }
     public void winningGame()
    {
        String b1 = jButton1.getText();
         String b2 = jButton2.getText();
          String b3 = jButton3.getText();
          

          String b4 = jButton4.getText();
         String b5 = jButton5.getText();
          String b6 = jButton6.getText();
          
          String b7 = jButton7.getText();
         String b8 = jButton8.getText();
          String b9 = jButton9.getText();
          
          
          if (b1 ==("X") && b2 ==("X") && b3 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton1.setBackground(Color.YELLOW);
              jButton2.setBackground(Color.YELLOW);
              jButton3.setBackground(Color.YELLOW);
           }
         if (b4 ==("X") && b5 ==("X") && b6 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton4.setBackground(Color.CYAN);
              jButton5.setBackground(Color.CYAN);
              jButton6.setBackground(Color.CYAN);
          }
         if (b7 ==("X") && b8 ==("X") && b9 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton7.setBackground(Color.BLUE);
              jButton8.setBackground(Color.BLUE);
              jButton9.setBackground(Color.BLUE);
          
              
          }
          
         if (b1 ==("X") && b4 ==("X") && b7 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton1.setBackground(Color.MAGENTA);
              jButton4.setBackground(Color.MAGENTA);
              jButton7.setBackground(Color.MAGENTA);
          
              
          }
          
         if (b2 ==("X") && b5 ==("X") && b8 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton2.setBackground(Color.PINK);
              jButton5.setBackground(Color.PINK);
              jButton8.setBackground(Color.PINK);
          
              
          }
          
         if (b3 ==("X") && b6 ==("X") && b9 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton3.setBackground(Color.GRAY);
              jButton6.setBackground(Color.GRAY);
              jButton9.setBackground(Color.GRAY);
          
              
          }
          
         if (b1 ==("X") && b5 ==("X") && b9 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton1.setBackground(Color.LIGHT_GRAY);
              jButton5.setBackground(Color.LIGHT_GRAY);
              jButton9.setBackground(Color.LIGHT_GRAY);
          
              
          }
          
         if (b3 ==("X") && b5 ==("X") && b7 ==("X"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              xCount++;
              gameScore();
              jButton3.setBackground(Color.ORANGE);
              jButton5.setBackground(Color.ORANGE);
              jButton7.setBackground(Color.ORANGE);
          
              
          }
          
         if (b1 ==("O") && b2 ==("O") && b3 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton1.setBackground(Color.YELLOW);
              jButton2.setBackground(Color.YELLOW);
              jButton3.setBackground(Color.YELLOW);
          
              
          }
          
         if (b4 ==("O") && b5 ==("O") && b6 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton4.setBackground(Color.CYAN);
              jButton5.setBackground(Color.CYAN);
              jButton6.setBackground(Color.CYAN);
          
              
          }
          
         if (b7 ==("O") && b8 ==("O") && b9 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton7.setBackground(Color.BLUE);
              jButton8.setBackground(Color.BLUE);
              jButton9.setBackground(Color.BLUE);
          
              
          }
          
         if (b1 ==("O") && b4 ==("O") && b7 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton1.setBackground(Color.MAGENTA);
              jButton4.setBackground(Color.MAGENTA);
              jButton7.setBackground(Color.MAGENTA);
          
              
          }
          
         if (b2 ==("O") && b5 ==("O") && b8 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton2.setBackground(Color.PINK);
              jButton5.setBackground(Color.PINK);
              jButton8.setBackground(Color.PINK);
          
              
          }
          
         if (b3 ==("O") && b6 ==("O") && b9 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton3.setBackground(Color.GRAY);
              jButton6.setBackground(Color.GRAY);
              jButton9.setBackground(Color.GRAY);
          
              
          }
          
         if (b1 ==("O") && b5 ==("O") && b9 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton1.setBackground(Color.LIGHT_GRAY);
              jButton5.setBackground(Color.LIGHT_GRAY);
              jButton9.setBackground(Color.LIGHT_GRAY);
          
              
          }
          
         if (b3 ==("O") && b5 ==("O") && b7 ==("O"))
          {
              JOptionPane.showMessageDialog(this, "PLAYER O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
              oCount++;
              gameScore();
              jButton3.setBackground(Color.ORANGE);
              jButton5.setBackground(Color.ORANGE);
              jButton7.setBackground(Color.ORANGE);
          
              
          }
    private void jbtnEXITActionPerformed(java.awt.event.ActionEvent evt) {                                         

        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }                                        

    private void jbtnRESETActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jButton1.setText(null);
        jButton2.setText(null);
         jButton3.setText(null);
         
          jButton4.setText(null);
           jButton5.setText(null);
            jButton6.setText(null);
            
             jButton7.setText(null);
              jButton8.setText(null);
               jButton9.setText(null);
               
               jButton1.setBackground(Color.LIGHT_GRAY);
               jButton2.setBackground(Color.LIGHT_GRAY);
               jButton3.setBackground(Color.LIGHT_GRAY);
               
               jButton4.setBackground(Color.LIGHT_GRAY);
               jButton5.setBackground(Color.LIGHT_GRAY);
               jButton6.setBackground(Color.LIGHT_GRAY);
               
               jButton7.setBackground(Color.LIGHT_GRAY);
               jButton8.setBackground(Color.LIGHT_GRAY);
               jButton9.setBackground(Color.LIGHT_GRAY);
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.red);
        }
        else
        {
                jButton1.setForeground(Color.BLUE);
        }
            choose_a_player();
           
            winningGame();
          
            
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.red);
        }
        else
        {
                jButton4.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
           
            
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.red);
        }
        else
        {
                jButton7.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
           
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.red);
        }
        else
        {
                jButton2.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
        
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.red);
        }
        else
        {
                jButton5.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
          
            
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.red);
        }
        else
        {
                jButton8.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
           
            
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.red);
        }
        else
        {
                jButton3.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
           
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.red);
        }
        else
        {
                jButton6.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
        
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.red);
        }
        else
        {
                jButton9.setForeground(Color.BLUE);
        }
            choose_a_player();
            winningGame();
          
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }
}
