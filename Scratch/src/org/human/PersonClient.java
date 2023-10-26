package org.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jelani", LocalDate.of(1996, 9, 30));

        System.out.println(p1);
        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
    }
}