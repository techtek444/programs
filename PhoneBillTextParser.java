package edu.pdx.cs410J.techtek;

import edu.pdx.cs410J.ParserException;
import edu.pdx.cs410J.PhoneBillParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class PhoneBillTextParser implements PhoneBillParser<PhoneBill> {
    private final Reader reader;
    String str;
    public PhoneBillTextParser(Reader reader) {
        this.reader = reader;
    }

    @Override
    public PhoneBill parse() throws ParserException {
        BufferedReader br = new BufferedReader(this.reader);
        try {
            String customer = br.readLine();

            PhoneBill bill = new PhoneBill(customer);

            /*while (br.ready()) {
                String caller = br.readLine();
                if (caller == null) {
                    break;
                }
                //bill.addPhoneCall(new PhoneCall(caller));
            }
*/


            while((str =br.readLine())!=null)
            {
                String[] args = str.split(" ");
                String callerNumber = args[0];
                String calleeNumber = args[1];

                String start = args[2]+" ";
                start += args[3]+" ";
                start += args[4];
                Date startDate = dateConvertor.getDateTextString(start);

                String end = args[5] + " ";
                end += args[6]+ " ";
                end += args[7];
                Date endDate = dateConvertor.getDateTextString(end);
                PhoneCall call = new PhoneCall(callerNumber, calleeNumber, startDate, endDate);
                bill.addPhoneCall(call);

            }
            return bill;

        } catch (IOException e) {
            throw new ParserException("While parsing", e);
        }
    }
}
