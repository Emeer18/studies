package entities;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    Worker worker = new Worker();

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = sdf.format(date);
        try {
            this.date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        Double totalValues = valuePerHour * hours + worker.getBaseSalary() ;
        return totalValues;
    }

}
