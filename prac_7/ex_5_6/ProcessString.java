package ru.maksim.ikbo2021.new_pracs.prac_7.ex_5_6;

class ProcessString implements strings{

    public ProcessString(){}

    public int getLength(String a){
        return a.length();
    }

    public String getOddString(String a){ //используем стрингбилдер тк он быстрее работает, чем стринг
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = 1; i < s.length(); i+=2)
            returnString.append(s.charAt(i));

        return new String(returnString);
    }

    public String invertSting(String a){
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = s.length() - 1; i >= 0; i--)
            returnString.append(s.charAt(i));

        return new String(returnString);
    }
}