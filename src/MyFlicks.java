import javax.swing.*;
import java.awt.*;

public class MyFlicks {
    public static void main(String[] args) {
    JTextArea textArea = new JTextArea();
    Font font = new Font("monspaced",Font.PLAIN,12);
    textArea.setFont(font);
    String text = "";
    Film film1 = new Film();
    int count;
    count = film1.getCount();
    Film[] catalog = new Film[count];
    String heading = "Number of Films: "+ film1.getCount()+"\n";
    textArea.append(heading);

    for(int i= 0; i<catalog.length;i++){
        String title = JOptionPane.showInputDialog("What is the title");
        String director = JOptionPane.showInputDialog("Who was the director");
        int duration = Integer.parseInt(JOptionPane.showInputDialog("How long is the movie"));
        catalog[i] = new Film(title,director,duration);

    }



    JOptionPane.showMessageDialog(null,heading+ Film.displayFilms(catalog));
    }
}
