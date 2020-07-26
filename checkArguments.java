package edu.pdx.cs410J.techtek;

/**
 * checkArguments is class to validate the parameters
 * function checkCommandArguments - check command line arguments
 * function checkTextArguments - check the input from text
 */

public class checkArguments {

    /**
     * check for phonenumber, date and time format for command line argument
     * @param argument string
     * @return valid which is of type boolean
     */
    String regexDate = "";

    public static boolean checkCommandArguments(String[] argument){
        boolean valid = true;
        //check for number
        if(!argument[1].matches("\\d{3}-\\d{3}-\\d{4}$")||!argument[2].matches("\\d{3}-\\d{3}-\\d{4}$"))
        {
            System.out.println("Phone numbers must be in format nnn-nnn-nnnn");
            valid = false;
        }

        //check for date
        if(!argument[3].matches("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)")||!argument[6].matches("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)"))
        {
            System.out.println("Date format must follow mm/dd/yyyy");
            valid = false;
        }

        //check for time
        if(!argument[4].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")||!argument[7].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"))
        {
            System.out.println("Time format must follow mm:hh");
            valid = false;
        }

        //check for am/pm
        if(!argument[5].matches("([AaPp][Mm])") || !argument[8].matches("([AaPp][Mm])"))
        {
            System.out.println("Time should be am / pm ");
            valid = false;
        }

        return valid;
    }

    /**
     * checks for format for number, date and time
     * @param argument of type string
     * @return valid of type boolean
     */
    public static boolean checkTextArguments(String[] argument){
        boolean validText = true;
        //check for number
        if(!argument[0].matches("\\d{3}-\\d{3}-\\d{4}$")||!argument[1].matches("\\d{3}-\\d{3}-\\d{4}$"))
        {
            System.out.println("Phone numbers must be in format nnn-nnn-nnnn");
            validText = false;
        }


        //check for date
        if(!argument[2].matches("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/(\\d\\d),")||!argument[5].matches("(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/(\\d\\d),"))
        {
            System.out.println("Date format must follow mm/dd/yy");
            validText = false;
        }

        //check for time
        if(!argument[3].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")||!argument[6].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"))
        {
            System.out.println("Time format must follow mm:hh");
            validText = false;
        }
        //check for am/pm
        if(!argument[4].matches("([AaPp][Mm])") || !argument[7].matches("([AaPp][Mm])"))
        {
            System.out.println("Time should be am / pm ");
            validText = false;
        }

        return validText;
    }
}
