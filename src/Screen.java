import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Screen extends JFrame {
    public Screen() {

        setTitle("Gacha");
        setResizable(false);
        setSize(960, 540);
        setLocationRelativeTo(null);
        setLayout(null);

//        JButton toRoll = new JButton("10x Summon");
//        toRoll.setBounds(380, 370, 200, 60);
//        toRoll.setFont(new Font("Times New Roman", Font.BOLD, 27));
//        toRoll.setForeground(new Color(239, 235, 235));
//        toRoll.setBackground(new Color(208, 218, 11));
//        toRoll.addActionListener(this::roll);
//        add(toRoll);

//        ImageIcon icon = new ImageIcon(new URL("https://static.atlasacademy.io/NA/Faces/f_" + 304300 + "0.png"));
//        JLabel jLabel = new JLabel(icon);
//        jLabel.setBounds(380, 170, 128, 128);
//        add(jLabel);
    }
    private void close(ActionEvent actionEvent) {
        this.dispose();
    }
    public void getRoll(ArrayList<Servant> roll, int rateUpSvt) throws MalformedURLException {
        setBackground(new Color(255, 255, 255));
        JButton toClose = new JButton("Close");
        toClose.setBounds(10, 10, 120, 36);
        toClose.setFont(new Font("Calibri", Font.BOLD, 27));
        toClose.setForeground(new Color(32, 44, 82));
        toClose.setBackground(new Color(227, 227, 227));
        toClose.addActionListener(this::close);
        add(toClose);

        int xVariable = 160;
        int yVariable = 160;
        for(int i = 0; i < roll.size(); i++) {
            ImageIcon icon = new ImageIcon(new URL("https://static.atlasacademy.io/JP/Faces/f_" + roll.get(i).id + "0.png"));
            JLabel image = new JLabel(icon);
            JLabel name = new JLabel(roll.get(i).name);
            ImageIcon rateUpPortrait = new ImageIcon("rateUpPortrait.png");
            JLabel portrait = new JLabel(rateUpPortrait);
            portrait.setBounds(100, 100, 160, 160);
            if (i < 5){
                if(roll.size() < 10) {
                    image.setBounds(((getWidth()-128)/2), ((getHeight()-128)/2), 128, 128);
                    name.setBounds(((getWidth()-128)/2), ((getHeight()-128)/2)-20, 200, 20);
                }
                else {
                    image.setBounds(80 + (xVariable * i), yVariable, 128, 128);
                    name.setBounds(80 + (xVariable * i), yVariable - 20, 200, 20);
                }
            }

            else {
                image.setBounds(80 + (xVariable * (i-5)), yVariable*2, 128, 128);
                name.setBounds(80+(xVariable*(i-5)), (yVariable*2)-20, 200, 20);
            }
//            add(portrait);
            if (verifyPortrait(roll.get(i).collectionNo, rateUpSvt)) {
                portrait.setBounds(image.getX()-10, image.getY()-8, 160, 160);
                add(portrait);
            }
            add(image);
            add(name);
        }
    }
    private boolean verifyPortrait(int coll_No, int rateUpSvt) {
        return coll_No == rateUpSvt;
    }
}
