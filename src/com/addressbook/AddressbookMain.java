package com.addressbook;

import java.util.*;

public class AddressbookMain {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Contact_info> contact_infoArrayList = new ArrayList<>();  //
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

        contact_infoArrayList.add(contact_info);  //
        hashMap.put(contact_info.getFirstName(), contact_info);  //

        System.out.println(hashMap);
    }

    public void editContact() {
        System.out.println("Provide First Name to Edit : ");
        String entered_name = sc.next();

        Contact_info contact_info = hashMap.get(entered_name);
        int check = 0;
        System.out.println("Select what u want to edit ?");
        System.out.println("\n1.First Name\n 2.Last Name\n 3.Address\n 4.city\n 5.State\n 6.Zip\n 7.Phone number\n 8.Email");
        check = sc.nextInt();

        switch (check) {
            case 1:
                System.out.println("Enter the First Name");
                String firstName = sc.next();
                contact_info.setFirstName(firstName);
                break;

            case 2:
                System.out.println("Enter the Last Name");
                String lastName = sc.next();
                contact_info.setFirstName(lastName);
                break;

            case 3:
                System.out.println("Enter the Address");
                String address = sc.next();
                contact_info.setAddress(address);
                break;

            case 4:
                System.out.println("Enter the City");
                String city = sc.next();
                contact_info.setCity(city);
                break;

            case 5:
                System.out.println("Enter the State");
                String state = sc.next();
                contact_info.setState(state);
                break;

            case 6:
                System.out.println("Enter the Pin Code");
                String pinCode = sc.next();
                contact_info.setPinCode(pinCode);
                break;

            case 7:
                System.out.println("Enter the Phone Number");
                String phoneNumber = sc.next();
                contact_info.setPhoneNumber(phoneNumber);
                break;

            case 8:
                System.out.println("Enter the Email Id");
                String emailID = sc.next();
                contact_info.setEmailID(emailID);
                break;

            default:
                System.out.println("Invalid input");
        }
    }


    public void deleteContact() {
        System.out.println("Confirm your first name to delete contact");
        String confirmName = sc.next();

        Contact_info contact_info = hashMap.get(confirmName);
        contact_infoArrayList.remove(contact_info);

    }

    public void printContacts() {
        System.out.println(contact_infoArrayList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressbookMain addressbookMain = new AddressbookMain();

        boolean isExist = false;
        while (!isExist) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact. \n4.Print All Contacts ");
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
                case 4:
                    addressbookMain.printContacts();
                    break;

                default:
                    System.out.println("Choose valid option");
                    break;
            }
        }
    }
}