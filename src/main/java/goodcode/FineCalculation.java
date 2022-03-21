package goodcode;

public class FineCalculation
{
    int days;
    public FineCalculation(int days)
    {
        this.days = days;
    }

    public double calculateFine()
    {
        double fine = 0;
        if(days <= 10)
            fine = 50.0;
        else if(days > 10 && days < 80)
            fine = 300;
        else
            fine = 600;

        return fine;
    }
}
