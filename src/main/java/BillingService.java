import javax.inject.Inject;

public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    BillingService(CreditCardProcessor processor, TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;

    }

    public CreditCardProcessor getProcessor() {
        return processor;
    }

    public TransactionLog getTransactionLog() {
        return transactionLog;
    }
}
