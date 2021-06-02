package manager.manager_customer;

import models.Customer;

import java.util.Comparator;

public class sortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String yearOfBirth1 = o1.getBirthday().substring(6);
        String yearOfBirth2 = o2.getBirthday().substring(6);
        if (o1.getName().compareTo(o2.getName())==0){
            return yearOfBirth1.compareTo(yearOfBirth2);
        }
        return o1.getName().compareTo(o2.getName());
    }
}
