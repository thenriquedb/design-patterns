package factory;

import java.util.Calendar;

//Concrete factory
public class UrbanTicket extends Ticket {

    public UrbanTicket(String origin, String destiny, Calendar date) {
        super(origin, destiny, date);
    }

    public void getDetails() {
        System.out.println("Urban bus ticket: "
                + this.getOrigin() + " from " + this.getDestiny()
                + " Date: " + super.df.format(this.getDate().getTime()));
    }
}
