package Lesson5.ProxyFactory;

import Lesson5.ProxyFactory.Data;

public class TransferService {
    public void transfer(Data data){
        System.out.println("Name: " + data.getName() + " Number: " + data.getNumber() + " CVV: " + data.getCvv());
    }
}
