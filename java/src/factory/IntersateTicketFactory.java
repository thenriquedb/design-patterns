package factory;

import java.util.Calendar;

//Concrete factory
public class IntersateTicketFactory extends Ticket {

    public IntersateTicketFactory(String origin, String destiny, Calendar date) {
        super(origin, destiny, date);
    }

    @Override
    public void getDetails() {
        System.out.println("Interstate bus ticket: "
                + this.getOrigin() + " from " + this.getDestiny()
                + " Date: " + super.df.format(this.getDate().getTime()));
    }
}
