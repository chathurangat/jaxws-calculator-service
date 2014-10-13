package com.chathurangaonline.sample.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>
 *     Service Endpoint Interface for the calculator service.
 * </p>
 */
@WebService
public interface CalculatorService {

    @WebMethod
    long add(long number1, long number2);

    @WebMethod
    long subtract(long number1, long number2);

    @WebMethod
    long multiply(long number1, long number2);
}
