package Q3;

public abstract class NewspaperSubscription {
    private String name;
    protected String address;
    private double rate;

    NewspaperSubscription(String name) {
        setName(name);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    abstract public void setAddress(String address);
}