package edu.pdx.cs410J.techtek;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.ArrayList;
import java.util.Collection;

public class PhoneBill extends AbstractPhoneBill {

    private String customer;
    private Collection<PhoneCall> calls = new ArrayList<>();

    public PhoneBill(String customer) {
        this.customer = customer;
    }

    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public void addPhoneCall(AbstractPhoneCall abstractPhoneCall) {

        this.calls.add((PhoneCall) abstractPhoneCall);

    }

    @Override
    public Collection getPhoneCalls() {
        return this.calls;
    }
}
