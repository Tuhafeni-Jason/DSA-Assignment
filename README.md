DSA ASsignment
# Phonebook Application

## Project Overview
This project is a mobile phonebook application implemented using Java and SQL for persistent storage. Contacts are temporarily stored in an `ArrayList`, and operations such as inserting, searching, deleting, and updating contacts are supported.

## Features
- Insert contact
- Search contact
- Display all contacts
- Delete contact
- Update contact
- Sort contacts (optional)
- Sync between ArrayList and SQL database

How It Works

The application is built in Java and utilizes an ArrayList to store contacts. Each contact is represented by a Contact class, which contains a name and a phone number.
Main Operations:

 Insert Contact: A new contact is added to the ArrayList.
    Search Contact: The application performs a linear search through the list to find a contact by name.
    Display All Contacts: It loops through the ArrayList and prints out the details of each contact.
    Delete Contact: The application searches for the contact by name and removes it from the list if found.
    Update Contact: The application searches for the contact and updates its phone number.
    Sort Contacts: Contacts are sorted alphabetically using Java's Collections.sort() method, which internally uses the Timsort algorithm (O(n log n)).

Time Complexity:

    Insert: O(1) – Contacts are appended to the ArrayList.
    Search, Delete, Update: O(n) – A linear search is performed to find a contact.
    Sort: O(n log n) – Sorting uses Java's built-in sorting algorithm.

## Group Members & Contributions
- Jason: Implemented the ArrayList and SQL integration.
- John: Handled search, delete, and update operations.
- Johannes: Created documentation and flowcharts.
- : Managed GitHub repository and project presentation.

## How to Run the Project
1. Clone the repository.
2. Set up a MySQL database and run the provided SQL script.
3. Run the Java files.
