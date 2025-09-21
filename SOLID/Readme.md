---> System Design
-- Before building any system we have to design it, Designing of a system further classified in two types which are HLD (High Level Design) and LLD (Low Level Design)
-- High level design is all about abstractive view of the design and it is more user oriented design which have what are the technologies we going to use and what should be the path of system development and the overall overview of the system
-- Low level design is more over devloper side which consist of uml diagrams , design principles , design patterns , oop concepts , exception handling , it is providing clear and internal architecture of the system , after the completion fo LLD only devlopment will start 
SOLID principles :
S - Single responsibility principle :
S states a class should have one reason to change which means it should have only one responsibility , because if it has multiple responsibilities it may affect the data flow in class.
O - Open closed principle
O states Software entities should open for extension and closed for modifications , because multiple modification of existing code in a class can affect the existing feature so by this principle it is enusred and it allow to add a new functionality without affecting the existing entities.
L - Liskov Substitution principle :
L states that objects of the superclass should be replacable by objects of the child without affecting the program correctness
I - Interface Segregation Principle :
I states that we should not force a client to depend upon the interface which is didn't use by them .
D - Dependency Inversion Principle :
D - states  a high level module should not depend upon low level module , both can depend upon abstraction rather raw implemenetation . 
