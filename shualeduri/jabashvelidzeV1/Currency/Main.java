package jabashvelidze.Currency;

import jabashvelidze.Currency.service.impl.CurrencyServiceImpl;

public class Main {
    public static void main(String[] args) {

        CurrencyServiceImpl currencyService = new CurrencyServiceImpl();

        currencyService.setexchangerate(3);
        System.out.println(currencyService.convert(12 ));
        System.out.println(currencyService.convert( 122.3));

    }
}
