package factory;

import java.util.Calendar;

//Concrete factory
public class UrbanBusCompanyFactory extends Company {
    private String name; 
    
    public UrbanBusCompanyFactory getUrbanBusCompany() {
        return  new UrbanBusCompanyFactory();
    }

    @Override
    public Ticket issueTicket(String origin, String destiny, Calendar date) {
        return new UrbanTicket(origin, destiny, date);
    }
}
