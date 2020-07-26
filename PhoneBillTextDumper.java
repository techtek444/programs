package edu.pdx.cs410J.techtek;

import edu.pdx.cs410J.PhoneBillDumper;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PhoneBillTextDumper implements PhoneBillDumper<PhoneBill> {
    private final PrintWriter writer;

    PhoneBillTextDumper(PrintWriter writer) {
        this.writer = writer;

    }

    @Override
    public void dump(PhoneBill bill) throws IOException {
        this.writer.println(bill.getCustomer());
        ArrayList<PhoneCall> calls =  (ArrayList<PhoneCall>)bill.getPhoneCalls();
        for(int i = 0; i < bill.getPhoneCalls().size(); i++) {
            this.writer.println(calls.get(i).getCaller().trim()+" "+calls.get(i).getCallee().trim()+" "+calls.get(i).getStartTimeString().trim()+" "+calls.get(i).getEndTimeString().trim());
        }

    }
}
