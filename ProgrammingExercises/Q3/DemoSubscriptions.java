package Q3;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription("A", "fsfds54");
        PhysicalNewspaperSubscription physicalNewspaperSubscription1 = new PhysicalNewspaperSubscription("B", "fsfd4");
        PhysicalNewspaperSubscription physicalNewspaperSubscription2 = new PhysicalNewspaperSubscription("C", "fsfds");
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription("A", "as@df");
        OnlineNewspaperSubscription onlineNewspaperSubscription1 = new OnlineNewspaperSubscription("B", "asdf");
        OnlineNewspaperSubscription onlineNewspaperSubscription2 = new OnlineNewspaperSubscription("C", "@asdf");
        NewspaperSubscription[] newspaperSubscriptions = {physicalNewspaperSubscription, physicalNewspaperSubscription1,
                physicalNewspaperSubscription2, onlineNewspaperSubscription, onlineNewspaperSubscription1, onlineNewspaperSubscription2};
        for (NewspaperSubscription newspaperSubscription : newspaperSubscriptions) {
            System.out.println("name: " + newspaperSubscription.getName() + " , address : " + newspaperSubscription.getAddress() + " , rate : " + newspaperSubscription.getRate());
        }
    }
}
