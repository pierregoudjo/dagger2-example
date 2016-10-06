import dagger.Module;
import dagger.Provides;

@Module
public class BillingModule {
    @Provides static CreditCardProcessor provideCreditCard() {
        return new PaypalCardProcessor();
    }

    @Provides static TransactionLog provideTransactionLog() {
        return new InMemoryTransactionLog();
    }
}
