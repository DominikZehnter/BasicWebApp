package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Dominik";
        } else { // TODO extend the programm here
            query.replaceAll("%20", " ");
            if (query.contains("what is")) {
                String[] a = query.split("what is ");
                String numbers = a[0];
                String[] b = numbers.split(" plus ");
                int bi1 = Integer.parseInt(b[0]);
                int bi = Integer.parseInt(b[1]);
                return String.valueOf(bi1 + bi);

            }
            return "";

        }

    }
    


}
