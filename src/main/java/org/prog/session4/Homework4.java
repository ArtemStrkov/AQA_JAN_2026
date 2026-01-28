package org.prog.session4;

//TODO: print only correct emails
// Correct email rules:
// - at least 3 symbols before @
// - only @ symbol
// - full domain name (must have at least one ".")

public class Homework4 {

    public static void main(String[] args) {

        String[] emails = new String[]{
                "abcdefg@gmail.com", // +
                "a@gmail.com",       // -
                "josh@@gmail.com",   // -
                "janegmail.com",     // -
                "pete@gmail.com",   // +
                "zoe@gmailcom",     // -
                "steve@outlook.com",// +
                "abcd@a.a",         // +
                "abcd.a@fakemail"   // -
        };

        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];

            int atIndex = email.indexOf('@');

            // - only @ symbol
            if (email.indexOf('@') != email.lastIndexOf('@'))
            {
                continue;
            }

            // - at least 3 symbols before @
            if (atIndex < 3) {
                continue;
            }

            // - full domain name (must have at least one ".")
            String domain = email.substring(atIndex + 1);
            if (!domain.contains(".")) {
                continue;
            }

            System.out.println(email);
        }
    }
}

