package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String Surname_Samuel56974;
    String Name_Samuel56974;
    String Street_Samuel56974;
    String Zipcode_Samuel56974;
    String City_Samuel56974;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Person's Data collecting");
        System.out.println("Enter Surname");
        Surname_Samuel56974 = br.readLine();
        System.out.println("Enter Name");
        Name_Samuel56974 = br.readLine();
        System.out.println("Enter Street");
        Street_Samuel56974 = br.readLine();
        System.out.println("Enter Zip code");
        Zipcode_Samuel56974 = br.readLine();
        System.out.println("Enter city");
        City_Samuel56974 = br.readLine();
    }

    public void print() {
        System.out.println("Person's data Display");
        System.out.println("********************");
        System.out.println("Surname:" + Surname_Samuel56974);
        System.out.println("Name:" + Name_Samuel56974);
        System.out.println("Street:" + Street_Samuel56974);
        System.out.println("Zipcode:" + Zipcode_Samuel56974);
        System.out.println("City:" + City_Samuel56974);
    }
}
    class Staff extends Person {
        String education;
        String position;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your Education");
            education = br.readLine();
            System.out.println("Enter Your position ");
            position = br.readLine();
        }

        public void print() {
            print();
            System.out.println("Education" + education);
            System.out.println("Position" + position);
        }
    }

    class HR {
        public static void main(String[] args) throws IOException {
            Staff employee = new Staff();

            employee.initialize();
            employee.print();

        }

    }


