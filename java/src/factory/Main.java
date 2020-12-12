package factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Company localCompany = new UrbanBusCompanyFactory();
        Company interstateCompany = new InterstateBusCompanyFactory();

        // Ticket factory
        Ticket urbanTicker = localCompany.issueTicket(
                "São Paulo",
                "Campinas",
                new GregorianCalendar(2020, Calendar.DECEMBER, 10, 11,0));

        Ticket interstateTicket = interstateCompany.issueTicket(
                "Rio de Janeiro",
                "Bahia",
                new GregorianCalendar(2020, Calendar.NOVEMBER, 12, 30,0));


        urbanTicker.getDetails();
        interstateTicket.getDetails();
    }
}
