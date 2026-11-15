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

**Current progress:** The 15-question OOP quiz is passed (15/15). Milestone 1 – Payment is completed. Day 1 and the overall project remain in progress.

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

**Status: Pending**

### Scenario 2 – Multi-Method Payment Processing

An e-commerce customer can pay through UPI, Card or Net Banking. Wallet is included as an additional implementation to practise extensibility.

Requirements:
- All payment methods follow a common `Payment` contract.
- Each method implements its own processing behaviour.
- `PaymentService` depends on the `Payment` abstraction, not concrete payment classes.
- New payment methods should be extendable without modifying the service.
- The service receives its payment dependency through constructor injection.
- Unit tests verify service behaviour and dependency handling.

Concepts: Abstraction, interfaces, runtime polymorphism, constructor injection, Dependency Inversion and unit testing.

**Status: Completed – Milestone 1**

### Scenario 3 – Employee and Manager Management

An organization maintains employees and managers with different responsibilities and compensation calculations.

Requirements:
- Manager inherits common employee attributes.
- Manager overrides relevant employee behaviour.
- Common functionality should be reusable.

Concepts: Inheritance and method overriding.

**Status: Pending**

## 4. Project Architecture

```text
payment-management-system/
│
├── pom.xml
├── README.md
├── day-01-progress.md
│
└── src/
    ├── main/java/com/interview/
    │   ├── payment/
    │   │   ├── Payment.java
    │   │   ├── UpiPayment.java
    │   │   ├── CardPayment.java
    │   │   ├── NetBankingPayment.java
    │   │   ├── WalletPayment.java
    │   │   ├── PaymentService.java
    │   │   └── PaymentApplication.java
    │   │
    │   ├── account/
    │   │   └── BankAccount.java              (pending)
    │   │
    │   ├── employee/
    │   │   ├── Employee.java                  (pending)
    │   │   └── Manager.java                   (pending)
    │   │
    │   └── notification/
    │       └── Notification.java              (pending)
    │
    └── test/java/com/interview/
        ├── payment/
        │   └── PaymentServiceTest.java
        ├── account/                           (pending)
        ├── employee/                          (pending)
        └── notification/                       (pending)
```

## 5. Functional Requirements

The functional requirements are tracked independently from the learning assessment. A completed feature means the implementation and the relevant verification have been completed.

### Completed Tasks

1. [x] Define a common `Payment` interface.
2. [x] Implement UPI payment processing.
3. [x] Implement Card payment processing.
4. [x] Implement Net Banking payment processing.
5. [x] Build `PaymentService` using constructor injection.
12. [x] Write unit tests using JUnit 5.

**Additional implementation:** `WalletPayment` was added as a fourth implementation of the `Payment` contract.

### Pending Tasks

6. [ ] Implement `BankAccount` with private fields and validated operations.
7. [ ] Implement `Employee` and `Manager` inheritance.
8. [ ] Demonstrate method overriding.
9. [ ] Implement a `Notification` interface with a default method.
10. [ ] Demonstrate method overloading.
11. [ ] Handle invalid input and exceptional conditions.

### Verification Evidence – Completed Payment Milestone

- `mvn clean compile` – **BUILD SUCCESS** in the learner's Windows environment.
- `mvn clean test` – **BUILD SUCCESS** in the learner's Windows environment.
- JUnit 5: **4 tests run, 0 failures, 0 errors, 0 skipped**.
- `PaymentServiceTest` verifies:
  - Service initialization with a valid dependency.
  - Null dependency rejection.
  - Delegation to the injected `Payment`.
  - Support for different `Payment` implementations.

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

### Assessment sequence

1. **Mock-test drill:** 15 multiple-choice questions on the Day 1 OOP concepts.  
   **Status: Passed – 15/15 (100%).**
2. **Real-world scenario learning:** study and discuss the three scenarios in Section 3.  
   **Status: Payment scenario completed; Banking and Employee/Manager scenarios pending.**
3. **Hands-on implementation:** implement each scenario and its required OOP concepts.  
   **Status: Payment milestone completed; remaining scenario work pending.**
4. **Testing and code review:** run tests, inspect edge cases and evaluate the full project using the 100-point rubric.  
   **Status: Partial – four Payment service tests passed; final project review pending.**
5. **Technical explanation:** independently explain design choices, trade-offs and behaviour.  
   **Status: In progress; final assessment pending.**

A passed quiz does not mean the full project or Day 1 is complete. Practical implementation, tests, code review and independent explanation are also required.

## 9. Expected Deliverables

- Working Java application.
- Clean package structure.
- Interface-based payment implementations.
- Encapsulated account management.
- Inheritance and polymorphism demonstrations.
- JUnit 5 tests for the relevant behaviours.
- Documented design decisions.
- GitHub source code and meaningful commit history.
- Learner progress record in `day-01-progress.md`.

## 10. Project Status

**Current stage:** Milestone 1 – Payment completed. Day 1 remains in progress.

Completed:
- 15-question OOP mock-test drill: 15/15.
- Payment abstraction and four payment implementations.
- Constructor-injected `PaymentService`.
- `PaymentApplication` composition root.
- Four passing JUnit 5 tests.
- Maven compile and test verification.
- Git commit and push.

Pending:
- Banking and Account Management scenario.
- Employee and Manager scenario.
- Notification interface default method.
- Method overloading.
- Remaining invalid-input and exception-handling requirements.
- Full hands-on assessment and final 100-point review.

### Git milestone record

- **Date:** 15 November 2026
- **Commit:** `ff3182f`
- **Message:** `feat: implement payment service constructor injection and unit tests`
- **Push status:** Verified on `origin/main`; working tree clean at verification.

The next documentation update should be committed separately after the next milestone is implemented and verified. Use the actual commit date in every future milestone commit message or documentation record.

---

**Day 1 Engineering Principle:**

Understand the concept. Solve the problem. Build the application. Test the behaviour. Explain the design. Deliver maintainable code.
