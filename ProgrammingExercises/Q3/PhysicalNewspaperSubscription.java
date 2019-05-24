package Q3;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    PhysicalNewspaperSubscription(String name, String address) {
        super(name);
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        boolean check = false;
        char[] chars = address.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                check = true;
            }
        }
        if (check) {
            super.address = address;
            setRate(15);
        } else {
            System.out.println("invalid address");
            setRate(0);
        }
    }
}