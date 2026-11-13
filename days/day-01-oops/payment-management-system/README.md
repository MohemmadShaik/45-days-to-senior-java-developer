# Day 1 – Payment Management System

**45 Days to Senior Java Developer | Phase 1: Core Java Foundations**

**Project:** Payment Management System  
**Language:** Java 21  
**Build Tool:** Apache Maven 3.9.16  
**Testing:** JUnit 5  
**Architecture:** Interface-based, object-oriented design

## 1. Project Overview

The Payment Management System is a Core Java mini-project designed to demonstrate practical Object-Oriented Programming concepts through a simulated payment-processing application.

The project demonstrates how different payment methods can follow a common contract while maintaining their own implementations.

It also introduces encapsulation, inheritance, runtime polymorphism, constructor-based dependency injection, interface default methods, method overloading, validation and unit testing.

This is a learning simulation, not a connection to an actual banking or payment gateway.

## 2. Learning Objectives

By implementing this project, learners will practise:

- Encapsulation and data protection.
- Inheritance and method overriding.
- Abstraction using interfaces.
- Runtime polymorphism.
- Constructors and object initialization.
- Method overloading.
- Interface default methods.
- Composition and loose coupling.
- Dependency Inversion Principle.
- Input validation and exception handling.
- Unit testing with JUnit 5.

## 3. Real-World Business Scenarios

Maximum three scenarios are used to connect the concepts with practical business requirements.

### Scenario 1 – Banking and Account Management

A customer maintains a bank account with a protected balance.

Requirements:
- Balance must not be directly accessible.
- Deposits and withdrawals must be validated.
- Invalid transactions must be rejected.
- Account state must remain consistent.

Concepts: Encapsulation, validation and exception handling.

### Scenario 2 – Multi-Method Payment Processing

An e-commerce customer can pay through UPI, Card or Net Banking.

Requirements:
- All payment methods follow a common Payment contract.
- Each method implements its own processing behaviour.
- PaymentService should not depend on concrete payment classes.
- New payment methods should be extendable without modifying the existing service.

Concepts: Abstraction, interfaces, runtime polymorphism, constructor injection and Dependency Inversion.

### Scenario 3 – Employee and Manager Management

An organization maintains employees and managers with different responsibilities and compensation calculations.

Requirements:
- Manager inherits common employee attributes.
- Manager overrides relevant employee behaviour.
- Common functionality should be reusable.

Concepts: Inheritance and method overriding.

## 4. Project Architecture

```text
payment-management-system/
│
├── pom.xml
├── README.md
│
└── src/
    ├── main/java/com/interview/
    │   ├── payment/
    │   │   ├── Payment.java
    │   │   ├── UpiPayment.java
    │   │   ├── CardPayment.java
    │   │   ├── NetBankingPayment.java
    │   │   └── PaymentService.java
    │   │
    │   ├── account/
    │   │   └── BankAccount.java
    │   │
    │   ├── employee/
    │   │   ├── Employee.java
    │   │   └── Manager.java
    │   │
    │   └── notification/
    │       └── Notification.java
    │
    └── test/java/com/interview/
        ├── payment/
        ├── account/
        ├── employee/
        └── notification/
```

## 5. Functional Requirements

1. Define a common Payment interface.
2. Implement UPI payment processing.
3. Implement Card payment processing.
4. Implement Net Banking payment processing.
5. Build PaymentService using constructor injection.
6. Implement BankAccount with private fields and validated operations.
7. Implement Employee and Manager inheritance.
8. Demonstrate method overriding.
9. Implement a Notification interface with a default method.
10. Demonstrate method overloading.
11. Handle invalid input and exceptional conditions.
12. Write unit tests using JUnit 5.

## 6. Technology Stack

| Technology | Purpose |
|---|---|
| Java 21 | Application development |
| Maven | Dependency and build management |
| JUnit 5 | Unit testing |
| Git | Version control |
| GitHub | Source code hosting |
| VS Code | Development environment |

## 7. Build and Test

Run these commands from the project directory.

```bash
mvn clean
mvn compile
mvn test
mvn package
```

## 8. Learning Assessment

The project is evaluated using a 100-point technical review:

| Area | Weight |
|---|---:|
| Functional correctness | 20 |
| OOP implementation | 20 |
| Java coding standards | 15 |
| SOLID and design quality | 15 |
| Exception handling | 10 |
| Unit testing | 10 |
| Technical explanation | 10 |
| **Total** | **100** |

## 9. Expected Deliverables

- Working Java application.
- Clean package structure.
- Interface-based payment implementations.
- Encapsulated account management.
- Inheritance and polymorphism demonstrations.
- JUnit 5 tests.
- Documented design decisions.
- GitHub source code and meaningful commit history.

## 10. Project Status

**Current stage:** Initial project setup and interface implementation.

The application will be marked complete only after implementation, testing, technical review and documentation.

---

**Day 1 Engineering Principle:**

Understand the concept. Solve the problem. Build the application. Test the behaviour. Explain the design. Deliver maintainable code.