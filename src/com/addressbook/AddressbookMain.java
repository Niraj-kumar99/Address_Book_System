package com.addressbook;

import java.util.*;

public class AddressbookMain {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Contact_info> contact_infoArrayList = new ArrayList<>();  //
    HashMap<String, Contact_info> hashMap = new HashMap<>();

    Contact_info contact_info = new Contact_info();
    static AddressbookMain addressbookMain = new AddressbookMain();

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

    // UC-7
    public void checkDuplicate(String firstName) {
        for (int i = 0; i < contact_infoArrayList.size(); i++) {
            String contact_name = contact_infoArrayList.get(i).getFirstName();

            if (firstName.equals(contact_name)) {
                System.out.println("Contact Already Exist .. ");
            } else {
                System.out.println("You can add this new contact");
                break;
            }
        }
    }

    public void createAddressBook() {

        while (true) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1.Create new address book.\n2.Edit existing address book." +
                    "\n3.Display all address books." + "\n5. Exit");
            int choose = sc.nextInt();

            if (choose == 5) {
                System.out.println("Exited");
                break;
            }

            switch (choose) {
                case 1:
                    System.out.println("Enter the name of address book: ");
                    String address_name = sc.next();

                    // condition to check for uniqueness of address book.
                    if (hashMap.containsKey(address_name)) {
                        System.out.println("Adress book name exits, enter different name");
                        break;
                    }

                    ArrayList<Contact_info> new_address_book = new ArrayList<>();
                    contact_infoArrayList = new_address_book;
                    while (true) {
                        System.out.println("Choose what you want to do: ");
                        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact." +
                                "\n4.Duplicate check." + "\n5.Exit");
                        int choose1 = sc.nextInt();
                        if (choose1 == 5) {
                            System.out.println("Exited");
                            break;
                        }
                        switch (choose1) {
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
                                System.out.println("Enter first name to check for duplicancy");
                                String enteredName = sc.next();
                                addressbookMain.checkDuplicate(enteredName);
                                break;
                            default:
                                System.out.println("Choose valid option");
                                break;
                        }
                        hashMap.put(address_name, contact_info);
                        System.out.println(hashMap);
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of address book: ");
                    String address_name_old = sc.next();

                    // condition to check whether address book exists or no.
                    if (hashMap.containsKey(address_name_old)) {

                        ArrayList<Contact_info> old_address_book = new ArrayList<>();
                        contact_infoArrayList = old_address_book;
                        contact_info = hashMap.get(address_name_old);
                        while (true) {
                            System.out.println("Choose what you want to do: ");
                            System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact." +
                                    "\n4.Duplicate check.\n5.Exit");
                            int choose1 = sc.nextInt();
                            if (choose1 == 5) {
                                System.out.println("Exited");
                                break;
                            }
                            switch (choose1) {
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
                                    System.out.println("Enter first name to check for duplicancy");
                                    String enteredName = sc.next();
                                    addressbookMain.checkDuplicate(enteredName);
                                    break;
                                default:
                                    System.out.println("Choose valid option");
                                    break;
                            }
                            hashMap.put(address_name_old, contact_info);
                            System.out.println(hashMap);
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                    break;

                case 3:
                    System.out.println(hashMap);
                    break;


                default:
                    System.out.println("Enter valid option");
            }
        }
    }


    public void printContacts() {
        System.out.println(contact_infoArrayList);
    }

    public static void main(String[] args) {
        addressbookMain.createAddressBook();
    }
}