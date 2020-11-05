package jabashvelidze.Currency.service.impl;

public class CurrencyServiceImpl {
    public class CurrencyServiceimpl{
         static double x, y ;
            public void setexchangerate(double value){
                y=value;
        }
        public static double convert(double value){
                x=value;
                return x/y;
        }
    }
}
