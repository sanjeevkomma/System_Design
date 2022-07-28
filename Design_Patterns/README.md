# To Read

# J2SE Design Patterns
# Creational Design Pattern
|#SNo| #Design Pattern  | #Intent |#When to Use |#Common Usage |
| :---| :--- | :--- |:--- |:--- | 
|1 | Factory Pattern | 1. creates objects without exposing the instantiation logic to the client. <br>2). refers to the newly created object through a common interface  |  |  |
|2 | Abstract Factory Pattern | Abstract Factory offers the interface for creating a family of related objects, without explicitly specifying their classes |  |  |
|3 | Singleton Pattern | 1. Ensure that only one instance of a class is created <br>2). Provide a global point of access to the object |  |  |
|4 | Prototype Pattern | 1. specifying the kind of objects to create using a prototypical instance <br>2). creating new objects by copying this prototype |  |  |
|5 | Builder Pattern | 1. Defines an instance for creating an object but letting subclasses decide which class to instantiate <br>2). Refers to the newly created object through a common interface |  |  |

# Structural Design Pattern
|#SNo| #Design Pattern  | #Intent |
| :---| :--- | :--- | 
|1 | Adapter Pattern |1. Convert the interface of a class into another interface clients expect 2). Adapter lets classes work together, that could not otherwise because of incompatible interfaces  |
| 2| Bridge Pattern | The intent of this pattern is to decouple abstraction from implementation so that the two can vary independently  |
| 3| Composite Pattern |1. The intent of this pattern is to compose objects into tree structures to represent part-whole hierarchies 2. Composite lets clients treat individual objects and compositions of objects uniformly  |
|4 | Decorator Pattern | The intent of this pattern is to add additional responsibilities dynamically to an object |
|5 | Facade Pattern |  |
|6 | Flyweight Pattern | The intent of this pattern is to use sharing to support a large number of objects that have part of their internal state in common where the other part of state can vary |
|7 | Proxy Pattern |The intent of this pattern is to provide a Placeholder for an object to control references to it  |

# Behavioral Design Pattern
|#SNo| #Design Pattern  | #Intent |
| :---| :--- | :--- | 
|1 | Chain Of Responsibility Pattern |1. It avoids attaching the sender of a request to its receiver, giving this way other objects the possibility of handling the request too 2. The objects become parts of a chain and the request is sent from one object to another across the chain until one of the objects will handle it  |
| 2| Command Pattern |1. encapsulate a request in an object 2. allows the parameterization of clients with different requests 3. allows saving the requests in a queue  |
| 3| Interpreter Pattern |1. Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language 2. Map a domain to a language, the language to a grammar, and the grammar to a hierarchical object-oriented design  |
| 4| Iterator Pattern |Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation  |
| 5| Mediator Pattern |Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently  |
|6 | Memento Pattern |The intent of this pattern is to capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed  |
| 7| Observer Pattern |Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically  |
| 8| State Pattern |  |
|9 | Strategy Pattern | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it |
|10 | Template Method Pattern |1. Define the skeleton of an algorithm in an operation, deferring some steps to subclasses 2. Template Method lets subclasses redefine certain steps of an algorithm without letting them to change the algorithm's structure |
|11 | Visitor Pattern |1. Represents an operation to be performed on the elements of an object structure 2. Visitor lets you define a new operation without changing the classes of the elements on which it operates  |
| 12|Null Object Pattern|1. Provide an object as a surrogate for the lack of an object of a given type 2. The Null Object Pattern provides intelligent do nothing behavior, hiding the details from its collaborators |

# J2EE Design Patterns
# Presentation Layer Design Pattern
|#SNo| #Design Pattern  | #Intent |
| :---| :--- | :--- |
| 1|Intercepting Filter Pattern| |
| 2|Front Controller Pattern| |
| 3|View Helper Pattern| |
| 4|Composite View Pattern| |

# Business Layer Design Pattern
|#SNo| #Design Pattern  | #Intent |
| :---| :--- | :--- |
| 1|Business Delegate Patternn| |
| 2|Service Locator Pattern| |
| 3|Session Facade Pattern| |
| 4|Transfer Object Pattern| |

# Integration Layer Design Pattern
|#SNo| #Design Pattern  | #Intent |
| :---| :--- | :--- |
| 1|Data Access Object Pattern| |
| 2| Web Service Broker Pattern| |


# Reference
* [software-design-patterns-best-practices](https://www.educative.io/courses/software-design-patterns-best-practices)
* [Object Oriented Design Patterns](https://www.oodesign.com/)
* [Design Patterns - journaldev](https://www.journaldev.com/1827/java-design-patterns-example-tutorial?utm_source=newsletter&utm_medium=sendy&utm_campaign=emails)


