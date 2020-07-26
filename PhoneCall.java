package edu.pdx.cs410J.techtek;

import edu.pdx.cs410J.AbstractPhoneCall;


import java.text.SimpleDateFormat;
import java.util.Date;



public class PhoneCall extends AbstractPhoneCall {
    private final String caller;
    private final String callee;
    private final Date startTime;
    private final Date endTime;

    public PhoneCall(String caller,String callee,Date startTime,Date endTime) {
        this.caller = caller;
        this.callee = callee;
        this.startTime = startTime;
        this.endTime= endTime;
    }

    @Override
    public String getCaller() {
        return this.caller;
    }

    @Override
    public String getCallee() {
        return this.callee;
    }

    @Override
    public String getStartTimeString() {

        return dateConvertor.dateToStringFormat(startTime);
    }

    @Override
    public String getEndTimeString() {
        return dateConvertor.dateToStringFormat(endTime);
    }

    @Override
    public Date getStartTime() {
        return startTime;
    }

    @Override
    public Date getEndTime() {
        return endTime;
    }

    public String duration(){
        long duration =startTime.getTime()-endTime.getTime();
        long diffMinutes = duration / (60 * 1000) % 60;
        long diffHours = duration / (60 * 60 * 1000);
        if(diffHours ==0)
            return -1*diffMinutes + " minutes";
        else
            return "  "+-1*diffHours+"hr and "+ -1*diffMinutes +"min";
    }
}
