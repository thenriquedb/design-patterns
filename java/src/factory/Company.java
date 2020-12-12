package factory;

import java.util.Calendar;

public abstract class Company {
    public abstract Ticket issueTicket(String origin, String destiny, Calendar date);
}
