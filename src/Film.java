import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class Film {
    private String title;
    private String director;
    private int duration;
    private int count = 2;

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Film(){
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.count = count;
    }
    public Film(String title,String director, int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.count = count;

    }
    public static String displayFilms(Film[] catalog) {
        JTextArea textArea = new JTextArea();
        Font font = new Font("monspaced",Font.PLAIN,12);
        textArea.setFont(font);
        String text="";
        for (Film f : catalog) {
            text += f.toString() + "\n";
            textArea.append(text);

        }
        return text;
    }
    public String toString(){
        return "\nTitle:" + title + "\nDirector" + director + "\nDuration" + duration+" mins";
    }
}
