import dagger.Component;

import javax.inject.Singleton;

public class Main {

    @Singleton
    @Component(modules = BillingModule.class)
    public interface Module {
        BillingService getService();
    }
    public static void main(String[] args) {
        Module module = DaggerMain_Module.builder().build();
        BillingService service = module.getService();
        System.out.println(service.getProcessor().getClass());
        System.out.println(service.getTransactionLog().getClass());
    }

}
