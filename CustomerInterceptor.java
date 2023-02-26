package com.company;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

    @Interceptor
    public class CustomerInterceptor extends Customer {

        @AroundInvoke
        public Object checkCustomer(InvocationContext context) throws Exception {
            // get the customer ID from the method parameters
            Object[] parameters = context.getParameters();
            Long customerId = (Long) parameters[0];

            // check if the customer is eligible to rent movies
            boolean eligible = isCustomerEligible(customerId);

            if (eligible) {
                return context.proceed();
            } else {
                throw new Exception("Customer is not eligible to rent movies.");
            }
        }

        private boolean isCustomerEligible(Long customerId) {
            // check if the customer is eligible to rent movies
            // ...
            return true; // or false, depending on the customer's eligibility
        }
    }

