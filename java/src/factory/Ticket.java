package factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Ticket {
    private String origin;
    private String destiny;
    private Calendar date;

    protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Ticket(String origin, String destiny, Calendar date) {
        this.origin = origin;
        this.destiny = destiny;
        this.date = date;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Calendar getDate() {
        return date;
    }

    public abstract void getDetails();
}
