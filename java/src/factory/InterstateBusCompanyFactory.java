package factory;

import java.util.Calendar;

//Concrete factory
public class InterstateBusCompanyFactory extends Company {
    @Override
    public Ticket issueTicket(String origin, String destiny, Calendar date) {
        return new IntersateTicketFactory(origin, destiny, date);
    }
}
