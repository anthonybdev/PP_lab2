package com.Lab2.Data;

import java.math.BigInteger;
import java.util.Random;

public class RandomData {
    private RandomData() {
        //To block object creation
    }
    private static Random random = new Random();

    private static String[] name = {"John", "Marcus", "Susan", "Henry",
            "Reilly", "Ronny", "Riccardo", "Scott",
            "Tamar", "Martine", "David", "David",
            "Hester", "Carty", "Junaid", "Ferrell"};

    private static String[] surname = {"Abraham", "Capello", "Metcalfe", "Elmore",
            "Brooke", "Brown", "Maguire", "Johnson",
            "Valentino", "Wade", "Mena", "Jones",
            "Williams", "Smith", "Prince", "Rodriguez"};

    private static String[] address = {"46 Coast Rd", "74 Bullwood Rd", "44 Whitby Road", "72 Nenthead Road",
            "59 Hounslow Rd", "63 Bootham Terrace", "84 Well Lane", "69 Southlands Road",
            "53 Caerfai Bay Road", "40 Hampton Court Rd", "65 Walwyn Rd", "26 Southlands Road",
            "Williams", "6 Wrexham Road", "82 St Omers Road", "71 Fraserburgh Rd"};

    public static String getName() {
        return name[random.nextInt(16)];
    }

    public static String getSurname() {
        return surname[random.nextInt(16)];
    }

    public static String getAddress() {
        return address[random.nextInt(16)];
    }

    public static BigInteger getCardNumber() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            builder.append(digit);
        }
        return new BigInteger (builder.toString());
    }

    public static int getBalance() {
        return random.nextInt();
    }

}
