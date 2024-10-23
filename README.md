# CS-320
Software Test, Automation


How can I ensure that my code, program, or software is functional and secure?
Approach:

Unit Testing with 100% Coverage:
For each class (Contact, Appointment, Task) and their respective service classes (ContactService, AppointmentService, TaskService), comprehensive unit tests were created. These tests ensure that all public methods behave as expected under various conditions, such as edge cases, valid inputs, and invalid inputs.

The tests cover CRUD operations (Create, Read, Update, Delete) for each entity.
Every significant function has been tested to ensure it meets the specifications.
Mutation Testing:
Beyond unit testing, mutation testing was conducted to assess how well the tests cover edge cases and unexpected behaviors. Mutation testing involves making small changes (mutations) to the code and verifying whether the existing tests can detect these changes. A score of 88% indicates that most mutations were caught by the tests, but there's still room for improvement. This further reinforces the strength of the unit tests.

Code Review and Best Practices:

Input Validation: The services ensure that inputs are validated before processing to prevent invalid data from being added.
Exception Handling: Each service class contains appropriate exception handling to manage errors gracefully without crashing the program.
Secure Coding Practices: While security testing was not the primary focus, basic security practices like proper encapsulation, minimal data exposure, and avoiding insecure coding patterns were followed.
By combining thorough unit testing, mutation testing, and following coding best practices, I can confidently say that the program is both functional and secure in its current state.




How do I interpret user needs and incorporate them into a program?
Approach:

Requirement Gathering:
Initially, the user's needs were identified based on the entities they wanted to manage (i.e., contacts, appointments, and tasks). The main goal was to develop a system that allows users to create, update, retrieve, and delete information about these entities. Specific user interactions were defined for each entity:

Users should be able to create new contacts, appointments, and tasks.
Users should be able to view, update, and delete these entities when needed.
Mapping User Needs to Features:
Each user requirement was mapped to corresponding functionalities in the code:

ContactService: Provides methods to add, remove, and retrieve contacts.
AppointmentService: Offers the ability to manage appointments.
TaskService: Handles the creation and management of tasks.



How do I approach designing software?
Approach:

Modular Design:
The project was broken down into distinct modules, each responsible for a specific part of the functionality:

Data Classes (Contact, Appointment, Task): These represent the core entities.
Service Classes (ContactService, AppointmentService, TaskService): These act as intermediaries between the data classes and the rest of the application, handling all operations on the data.
This separation of concerns made the design both scalable and maintainable, as each service class handles only the operations related to its respective entity.

SOLID Principles:

Single Responsibility Principle: Each class is responsible for only one task. For example, ContactService only handles contact-related operations.
Open/Closed Principle: The design allows for new features (e.g., adding a new entity type) without modifying the existing codebase.
Test-Driven Development (TDD):
While not strictly followed for every part, testing was heavily emphasized during the development process. For most functionalities, tests were written first to define the expected behavior, and then the code was implemented to pass the tests. This approach ensured that the design met the expected requirements from the beginning.

Scalability:
The modular nature of the design makes it easy to add more features or extend the project without affecting existing functionality. For example, adding a new service class to handle a different type of entity (e.g., EventService) would require minimal changes to the rest of the code.
