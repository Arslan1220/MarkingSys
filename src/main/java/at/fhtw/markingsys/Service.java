package at.fhtw.markingsys;

import org.springframework.stereotype.Service;

@Service

public class Service {
    public String getComplementary(String number) {
        int num;
        num = Integer.valueOf(number);


        if(num >=88) {
            return "1";
        }
        else if(num>=75 && num<88){
            return "2";
        }
        else if(num>= 63 && num<75){
            return "3";
        }
        else if(num>=50 && num<63){
            return "4";
        }
        return "5";
    }

}
