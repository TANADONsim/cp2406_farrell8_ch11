package Q3;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    OnlineNewspaperSubscription(String name, String address) {
        super(name);
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        if (address.contains("@")) {
            setRate(9);
            super.address = address;
        } else {
            setRate(0);
            System.out.println("invalid address");
        }
    }
}