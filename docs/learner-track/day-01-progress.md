# Day 1 – Learner Progress

**45 Days to Senior Java Developer | Phase 1: Core Java Foundations**

## Day and Learning Record

- **Date:** Sunday, 15 November 2026
- **Milestone 1 completion checkpoint:** 05:19 AM IST
- **Project:** Payment Management System
- **Day 1 status:** In progress

## Quiz

- Questions: 15
- Correct: 15
- Score: 100%
- Status: Passed
- Quiz repetition: Not required as a separate drill; revisit concepts during practical milestones whenever they naturally recur.

## Milestone 1 – Payment Processing

**Status: COMPLETED**

- **Completion date:** Sunday, 15 November 2026
- **Recorded time:** 05:19 AM IST

### Implemented source files

- `Payment.java` – defines the common `Payment` interface and `processPayment(BigDecimal amount)` contract.
- `UpiPayment.java` – implements the payment contract for UPI.
- `CardPayment.java` – implements the payment contract for card payments.
- `NetBankingPayment.java` – implements the payment contract for net banking.
- `WalletPayment.java` – additional implementation of the payment contract.
- `PaymentService.java` – receives a `Payment` dependency through constructor injection and delegates payment processing.
- `PaymentApplication.java` – contains the application entry point and supplies the selected payment implementation.
- `PaymentServiceTest.java` – contains JUnit 5 tests for the service.

### Concepts covered and revised

1. **Abstraction** – defined a common payment contract through the `Payment` interface.
2. **Interfaces** – used one contract for multiple payment implementations.
3. **Method implementation and overriding** – each payment class implements `processPayment` and uses `@Override`.
4. **Runtime polymorphism** – used a `Payment` reference with different concrete payment objects.
5. **Dynamic dispatch** – the invoked implementation is selected according to the actual object type at runtime.
6. **Reference type vs. object type** – distinguished compile-time member access from the object's runtime implementation.
7. **Loose coupling** – kept `PaymentService` dependent on the `Payment` abstraction.
8. **Dependency Inversion Principle (DIP)** – the service depends on an abstraction rather than concrete payment classes.
9. **Dependency Injection (DI)** – supplied the dependency from outside the service.
10. **Constructor injection** – made the required `Payment` dependency available through the constructor.
11. **Composition / HAS-A relationship** – `PaymentService` holds a `Payment` dependency.
12. **Null validation** – used `Objects.requireNonNull` to reject a null dependency.
13. **BigDecimal for monetary values** – used string-based construction to avoid first creating a binary floating-point value.
14. **JUnit 5 unit testing** – tested service initialization, null rejection, delegation, and support for different implementations.
15. **Lambda expressions and functional interfaces** – used test lambdas for the single-abstract-method `Payment` interface.
16. **AtomicReference in tests** – used as a mutable holder to capture a value from a lambda; not as a concurrency demonstration.
17. **Maven build and test lifecycle** – verified compilation and automated tests using Maven.

### Verification evidence

Based on the learner's supplied terminal output:

- `mvn clean compile`: **BUILD SUCCESS**; 7 main source files compiled.
- `mvn clean test`: **BUILD SUCCESS**.
- JUnit 5: **4 tests run, 0 failures, 0 errors, 0 skipped**.
- Tests:
  - `shouldInitializePaymentServiceWithValidDependency()`
  - `shouldThrowExceptionWhenPaymentDependencyIsNull()`
  - `shouldDelegatePaymentProcessingToInjectedPayment()`
  - `shouldSupportDifferentPaymentImplementations()`

These tests verify service dependency and delegation behaviour. They do not verify communication with a real payment gateway.

### Git milestone record

- **Commit:** `ff3182f`
- **Message:** `feat: implement payment service constructor injection and unit tests`
- **Commit date:** 15 November 2026
- **Push status:** Learner supplied terminal output confirming `origin/main` points to this commit.
- **Working tree:** Learner supplied terminal output showing a clean working tree.

### Interview-ready one-line answers

1. **Why use an interface for payment methods?** It defines a common contract so callers can work with different implementations through one abstraction.
2. **What is runtime polymorphism?** An overridden instance method is selected at runtime according to the actual object's type.
3. **What is Dependency Inversion?** High-level policy should depend on abstractions rather than concrete implementation details.
4. **What is dependency injection?** A dependency is supplied to a component from outside rather than being created internally by that component.
5. **What is constructor injection?** A dependency is supplied through the object's constructor.
6. **Why use `BigDecimal(String)` for money?** It creates the decimal value from a string without first introducing binary floating-point approximation.

## Milestone 2 – Banking and Account Management

**Status: NOT STARTED**

Planned focus:
- Encapsulation using private fields.
- Controlled access to account balance.
- Deposit and withdrawal operations.
- Input and business-rule validation.
- Exception handling.
- Maintaining a consistent account state.
- Unit tests for valid and invalid account operations.

## Milestone 3 – Employee and Manager Management

**Status: NOT STARTED**

Planned focus:
- Inheritance.
- Constructor usage and initialization.
- Method overriding.
- Runtime polymorphism where relevant.
- Unit tests for employee/manager behaviour.

## Remaining Day 1 Requirements

- [ ] Implement `BankAccount` with private fields and validated operations.
- [ ] Test deposit and withdrawal behaviour, including invalid cases.
- [ ] Implement `Employee` and `Manager` inheritance.
- [ ] Demonstrate method overriding.
- [ ] Implement a `Notification` interface with a default method.
- [ ] Demonstrate method overloading.
- [ ] Add meaningful invalid-input and exceptional-condition handling across the project.
- [x] Implement `PaymentService` using constructor injection.
- [x] Separate application startup into `PaymentApplication`.
- [x] Demonstrate Dependency Inversion in the payment service.
- [x] Write and run JUnit 5 tests for the payment service.
- [x] Run Maven `clean compile` and `clean test` in the learner's Windows environment.
- [ ] Complete the full 100-point project review.
- [ ] Explain all design decisions independently.

## Daily Technical Vocabulary

| Term | Reusable industry meaning |
|---|---|
| Contract | A defined set of operations a component promises to provide. |
| Abstraction | Exposing essential behaviour while hiding implementation details. |
| Concrete implementation | A class that supplies actual behaviour behind an abstraction. |
| Runtime polymorphism | Runtime dispatch of an overridden method based on the object's actual type. |
| Dynamic dispatch | Runtime selection of the applicable overridden instance method. |
| Reference type | The compile-time type that controls which members can be accessed through a reference. |
| Object type | The actual class of an object at runtime. |
| Loose coupling | Designing components with fewer dependencies on implementation details. |
| Extensibility | The ability to add capabilities with limited changes to existing code. |
| Dependency Injection | Supplying a component's dependency from outside the component. |
| Constructor injection | Supplying required dependencies through a constructor. |
| Dependency Inversion Principle | Depending on abstractions rather than concrete implementation details. |
| Compile-time type checking | Validation of type compatibility before program execution. |
| Delegation | Forwarding a responsibility or operation to another object. |
| Unit test | A focused automated test of a small unit of behaviour. |

## Learning and Assessment Convention

- Repeated concepts are intentionally revisited when they appear in later milestones. Repetition is revision and deliberate practice, not unnecessary duplication.
- Assessment work is labelled **Milestone 1, Milestone 2, Milestone 3**, and so on.
- The project README retains the three business-scenario descriptions; learner progress records actual milestone work and evidence.
- Work class by class. The learner implements in VS Code; code is reviewed before moving to the next class.
- Do not count unrelated `RentCalculator.java` or `StudentRentCalculator.java` work as part of this Payment Management System.

## Completion Decision

**Day 1 is in progress. Milestone 1 – Payment Processing is completed and verified.** Milestones 2 and 3, the Notification default-method and method-overloading requirements, remaining exception-handling work, and the final project review are still outstanding.
