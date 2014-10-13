package com.chathurangaonline.sample.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>
 *     Service Implementation Bean (SIB) for CalculatorService endpoint interface
 * </p>
 */
@WebService
public class CalculatorServiceImpl implements CalculatorService{


    @WebMethod
    public long add(long number1, long number2) {
        return number1+number2;
    }

    @WebMethod
    public long subtract(long number1, long number2) {
        return number1+number2;
    }

    @WebMethod
    public long multiply(long number1, long number2) {
        return number1*number2;
    }
}
