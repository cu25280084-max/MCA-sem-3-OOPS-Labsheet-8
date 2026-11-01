import java.beans.PropertyChangeEvent;

public class AccountBeanDemo {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener((PropertyChangeEvent event) ->
            System.out.println("Balance changed from " + event.getOldValue()
                    + " to " + event.getNewValue())
        );

        account.setBalance(1000.0);
        account.setBalance(1500.0);
    }
}
