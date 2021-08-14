package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressbookMain {
    private Scanner sc = new Scanner(System.in);
    HashMap<String, Contact_info> hashMap = new HashMap<>();

    Contact_info contact_info = new Contact_info();

    public void addContact() {
        Contact_info contact_info = new Contact_info();
        System.out.println("Enter First Name : ");
        contact_info.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name : ");
        contact_info.setLastName(sc.nextLine());

        System.out.println("Enter Address : ");
        contact_info.setAddress(sc.nextLine());

        System.out.println("Enter City : ");
        contact_info.setCity(sc.nextLine());

        System.out.println("Enter State : ");
        contact_info.setState(sc.nextLine());

        System.out.println("Enter Zip : ");
        contact_info.setPinCode(sc.nextLine());

        System.out.println("Enter Phone : ");
        contact_info.setPhoneNumber(sc.nextLine());

        System.out.println("Enter Email : ");
        contact_info.setPhoneNumber(sc.nextLine());

        hashMap.put(contact_info.getFirstName(), contact_info);

        System.out.println(hashMap);
    }

    public void editContact() {
        System.out.println("Provide First Name to Edit : ");
        String entered_name = sc.next();

        //Set<String> key = hashMap.keySet();
        //System.out.println(key);
        //System.out.println(hashMap.size());

        Set<String> key = hashMap.keySet();
        for (String i : key) {
            if (i.equals(entered_name)) {
                int check = 0;
                System.out.println("Name Exists ... \n");
                System.out.println("Select what u want to edit ?");
                System.out.println("\n1.First Name\n 2.Last Name\n 3.Address\n 4.city\n 5.State\n 6.Zip\n 7.Phone number\n 8.Email");

                int edit_option = sc.nextInt();

                switch (edit_option) {
                    case 1:
                        System.out.println("Enter new First Name");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 2:
                        System.out.println("Enter new Last Name");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 3:
                        System.out.println("Enter new Address");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 4:
                        System.out.println("Enter new City");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 5:
                        System.out.println("Enter new State");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Enter new Zip");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 7:
                        System.out.println("Enter new Phone");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    case 8:
                        System.out.println("Enter new Email");
                        hashMap.get(i).setFirstName(sc.nextLine());
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }
            hashMap.put(entered_name, contact_info);
            System.out.println(hashMap);
        }
    }

    public void deleteContact() {
        System.out.println("Confirm your first name to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < hashMap.size(); i++) {

            if (hashMap.get(i).getFirstName().equals(confirmName)) {

                hashMap.remove(i);
            } else {
                System.out.println("Enter valid first name");

            }

        }
        System.out.println("User details deleted.");
        System.out.println(hashMap);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressbookMain addressbookMain = new AddressbookMain();
        //addressbookMain.addContact();

        //addressbookMain.editContact();

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addressbookMain.addContact();
                    break;
                case 2:
                    addressbookMain.editContact();
                    break;
                case 3:
                    addressbookMain.deleteContact();
                    break;
                default:
                    System.out.println("Choose valid option");
                    break;
            }

        }


        //System.out.println("Do u want to add more contact ?");
        //Character ch = sc.next().charAt(0);
        //while (ch != 'n') {
        //    if (ch == 'y') {
        //        addressbookMain.addContact();
        //    }
        //    break;
    }
}