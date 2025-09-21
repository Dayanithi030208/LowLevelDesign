# System Design

Before building any system we have to **design** it.  
System design is generally classified into two types:

## High-Level Design (HLD)
- Gives an **abstract view** of the system.  
- **User-oriented**: focuses on *what* the system will do.  
- Describes:
  - Overall architecture and data flow
  - Technologies and platforms to use
  - Path of system development
- Provides an **overview** that stakeholders can understand.

## Low-Level Design (LLD)
- **Developer-oriented**: focuses on *how* the system will be built.  
- Includes:
  - UML diagrams
  - Design principles and patterns
  - Object-oriented concepts
  - Exception handling details
- Provides a **clear internal architecture** of the system.  
- Development typically starts **after LLD is complete**.

---

# SOLID Principles

### S – Single Responsibility Principle
A class should have **only one reason to change**.  
Each class must handle **one responsibility** to avoid unexpected side effects when requirements change.

### O – Open/Closed Principle
Software entities should be **open for extension** but **closed for modification**.  
New functionality can be added (e.g., through interfaces or inheritance) **without altering existing code**, reducing the risk of breaking features.

### L – Liskov Substitution Principle
Objects of a **superclass** should be **replaceable with objects of its subclasses** without affecting program correctness.  
This ensures proper use of inheritance.

### I – Interface Segregation Principle
Clients **should not be forced to depend** on methods they do not use.  
Prefer multiple **specific** interfaces over a single large one.

### D – Dependency Inversion Principle
High-level modules **should not depend on** low-level modules.  
Both should depend on **abstractions**, not on concrete implementations, to keep code loosely coupled and flexible.

