# CS-320-Module-Eight
CS 320 Portfolio Submission

## Overview
This repository represents my work submissions for the course CS 320 as part of my learning in software testing, automation, and quality assurance. The attached files are:
- Contact service files (`Contact.java`, `ContactService.java`, `ContactTest.java`, `ContactServiceTest.java`) from Project One, showing my skills in developing software solutions along with unit tests.
- Summary and reflections report from Project Two, highlighting my experiences and strategies in testing and software quality assurance.

## Reflection

How do I make sure that my code, program, or software is functional and secure?
I write comprehensive unit tests to make sure, for example, that the functionality is guaranteed and works as expected, such as those provided in `ContactTest.java` and `ContactServiceTest.java`. These tests validate that each method performs as expected under normal and edge-case conditions. Security-wise, I follow best practices such as input validation, which prevents invalid or malicious data from causing errors or vulnerabilities. For instance, in `Contact.java`, strict validation rules prevent null values and enforce character length limits for fields like `firstName` and `phoneNumber`.

### How do I interpret user needs and incorporate them into a program?
Analysis of the problem space begins by evaluating the given requirements of the project along with consideration of the realistic usage scenarios. For the contact service project, I focused on meeting specific user needs, such as adding, updating, and deleting the contacts while always controlling against constraints that maintain data consistency and usability. Feedback from peers and instructors also serves to refine these interpretations and align them with expectations.

### How do I approach designing software?
I do an iterative approach to software design, starting with breaking down requirements into smaller, manageable components. In the contact service project, I first identified the core objects and their attributes, such as the `Contact` class, and then designed the service layer, `ContactService.java`, to manage those objects. I also prioritize modularity and scalability, ensuring each component can be independently tested and extended in the future.

---
## Files Included
- `Contact.java`: The class that implements Contact with validations
- `ContactService.java`: Service that manages the contact, which provides add, delete, and update operations
- `ContactTest.java`: Unit test related to the Contact class
- `ContactServiceTest.java`: Unit test about ContactService class
- Summary and Reflections Report Software testing strategies and approaches used in Project Two are discussed here.

## Contact
Any questions or feedback, please leave a reply below this repository.
