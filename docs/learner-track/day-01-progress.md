# Day 1 – Learner Progress

## Topic
Core Java OOP Fundamentals

## Quiz
- Questions: 15
- Correct: 15
- Score: 100%
- Status: Passed
- Quiz repetition: Not required; use targeted revision if a practical gap appears.

## Practical Assignment
Payment Management System

### Implemented source files
- `Payment.java` – defines the common `Payment` interface and `processPayment(BigDecimal amount)` contract.
- `UpiPayment.java` – implements the payment contract for UPI.
- `CardPayment.java` – implements the payment contract for card payments.
- `NetBankingPayment.java` – implements the payment contract for net banking.
- `WalletPayment.java` – implements the payment contract for wallet payments.
- `PaymentService.java` – currently contains the application entry point and demonstrates all four implementations through a `Payment` reference.

### Verification
- Java 21 direct compilation and execution of the six submitted source files: verified in the assistant's review environment.
- Payment method demonstrations: UPI, Card, Net Banking and Wallet were invoked.
- Maven `clean compile` in the learner's Windows environment: pending.
- JUnit 5 tests: not yet implemented or verified.

## Concepts Demonstrated
- **Interface-based abstraction:** all payment implementations follow the `Payment` contract.
- **Method implementation and overriding:** each concrete class implements `processPayment(BigDecimal amount)` and uses `@Override`.
- **Runtime polymorphism:** the same `Payment` reference is assigned UPI, Card, Net Banking and Wallet objects.
- **Loose coupling at the call site:** the demonstration invokes the common interface method rather than implementation-specific methods.
- **Open/Closed Principle discussion:** Wallet was added as another `Payment` implementation without changing the interface contract. The current `PaymentService` still directly instantiates each implementation, so the service design is not yet dependency-injected.
- **Money representation:** the demonstration uses string-based `BigDecimal` constructors for the payment amounts.

## Interview Questions – One-Line Answers
1. **Why use an interface for payment methods?** It defines a common contract so callers can work with different payment implementations through one abstraction.
2. **What is runtime polymorphism?** An overridden instance method is selected at runtime according to the actual object type.
3. **Why can one `Payment` reference hold UPI, Card, Net Banking and Wallet objects?** Each concrete class implements `Payment` and is assignment-compatible with a `Payment` reference.
4. **Why is `UpiPayment ref = new CardPayment()` invalid?** `CardPayment` is not a subtype of `UpiPayment`, so the assignment fails compile-time type checking.
5. **Can a `Payment` reference directly call a method declared only in `UpiPayment`?** No; member access is checked against the reference's compile-time type unless the reference is safely narrowed or cast.
6. **What does `@Override` do?** It asks the compiler to verify that a method overrides or implements a supertype method.
7. **What is the Open/Closed Principle?** A component should be open to extension but closed to unnecessary modification.
8. **What is Dependency Inversion?** High-level policy should depend on abstractions rather than concrete implementation details.
9. **What is constructor injection?** A dependency is supplied to an object through its constructor.
10. **Why use `BigDecimal(String)` for money?** It creates a decimal value from the supplied decimal string without first introducing binary floating-point approximation.

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
| Constructor injection | Supplying required dependencies through a constructor. |
| Dependency Inversion Principle | Depending on abstractions rather than concrete implementation details. |
| Compile-time type checking | Validation of type compatibility before program execution. |

## Mastery Checklist
- [x] Complete the 15-question OOP quiz (15/15)
- [x] Implement the `Payment` abstraction
- [x] Implement UPI payment
- [x] Implement Card payment
- [x] Implement Net Banking payment
- [x] Add Wallet payment implementation
- [x] Demonstrate runtime polymorphism across four payment implementations
- [ ] Refactor `PaymentService` to use constructor injection
- [ ] Separate application startup into `PaymentApplication`
- [ ] Demonstrate Dependency Inversion in the refactored service
- [ ] Apply encapsulation and validation in `BankAccount`
- [ ] Demonstrate inheritance and overriding with `Employee` and `Manager`
- [ ] Implement an interface default method
- [ ] Demonstrate method overloading
- [ ] Add meaningful exception handling
- [ ] Write and run JUnit 5 tests
- [ ] Explain all design decisions independently
- [x] Complete Java 21 direct compilation and execution check for the submitted payment classes
- [ ] Run Maven `clean compile` and `test` in the learner's Windows environment

## Code Review
- The `Payment` interface and four concrete payment implementations are structurally valid.
- The six submitted Java source files passed the Java 21 direct compilation and execution check in the review environment.
- `PaymentService` currently acts as the demonstration entry point and directly creates concrete payment objects. It is not yet the constructor-injected service.
- Minor style improvements remain: normalize import spacing, blank lines and console-message wording across implementations.
- The full 100-point project review is deferred until the service refactor, remaining OOP scenarios and tests are complete.

## Knowledge Gaps / Next Actions
1. Refactor `PaymentService` to hold a `private final Payment` dependency supplied through its constructor.
2. Move application startup and payment implementation selection to `PaymentApplication`.
3. Verify that the service depends only on the `Payment` abstraction.
4. Add JUnit 5 tests for service delegation and relevant edge cases.
5. Complete the account, employee and notification scenarios.
6. Run Maven verification locally and record the actual output.

## Completion Decision
**In progress – payment implementation checkpoint passed the Java 21 direct compilation and execution check.** Day 1 is not complete. Constructor injection, practical Dependency Inversion verification, JUnit 5, remaining OOP scenarios and Maven verification remain pending.
