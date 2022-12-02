package DateAndTime;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {

    //variables for date/time
    SimpleDateFormat dayFormat;
    SimpleDateFormat timeFormat;
    String time;
    JLabel timeLabel;
    JLabel dayLabel;
    String day;


    Clock()
    {
        //showing current time---start
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(800,300);
        this.setResizable(false);
        dayFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Calibri",Font.PLAIN, 50));
        this.add(timeLabel);
        dayLabel = new JLabel();
        this.setVisible(true);
        this.add(dayLabel);
        setTime();       //calling method shows time and date
        //showing current time---end

    }


    //to run clock continuously--start
    public void setTime()
    {
        while(true)
        {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }




    }
    //to run clock continuously--end
}
