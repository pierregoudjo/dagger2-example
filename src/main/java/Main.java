import dagger.Component;

import javax.inject.Singleton;

public class Main {

    @Singleton
    @Component(modules = BillingModule.class)
    public interface BillingComponent {
        BillingService getService();
    }
    public static void main(String[] args) {
        BillingComponent module = DaggerMain_BillingComponent.create();
        BillingService service = module.getService();
        System.out.println(service.getProcessor().getClass());
        System.out.println(service.getTransactionLog().getClass());
    }

}
