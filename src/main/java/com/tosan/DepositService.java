package com.tosan;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Stateless
public class DepositService implements IDepositService {

    @WebMethod
    public String transfer(int balance){
        return (balance * 10 - balance) + "";
    }

}
