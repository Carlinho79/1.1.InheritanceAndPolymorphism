# 🧩 Sprint 1 - Java Language (Level 1 and Level 2)

## 📄 Description - Exercises Overview

This project combines the **Level 1 and Level 2** exercises from the *Java Language* module of the Backend Developer program.  
The goal is to understand the concepts of **inheritance**, **polymorphism**, **static and final methods**, **initialization blocks**, and **interfaces** in Java.

---

## 🧠 Level 1

### 🎵 Exercise 1 – Musical Instruments

Create a class hierarchy to represent different types of musical instruments:  
- **Wind instruments**
- **String instruments**
- **Percussion instruments**

All instruments have the common attributes `name` and `price`, and an abstract method `play()`.  
Each subclass should display a message depending on its type when the method is called.  

You must also demonstrate that a **class is only loaded once**, using **static** and **instance initialization blocks**.

---

### 🚗 Exercise 2 – Car Class

Create a class `Car` with the following attributes:

- `brand` → `static final`
- `model` → `static`
- `power` → `final`

Demonstrate the differences between these three attributes.  
Add the following methods:
- `static void brake()` → prints *"The vehicle is braking"*
- `void accelerate()` → prints *"The vehicle is accelerating"*

From the `main()` method, show how to call both static and non-static methods.

---

## 📱 Level 2

### Exercise 1 – Smartphone Class with Interfaces

Create a class `Phone` with attributes `brand` and `model`, and a method:
```java
void call(String number)
```
that prints *"Calling number [number]"*.

Create two interfaces:
- `Camera` with method `photograph()`
- `Clock` with method `alarm()`

Create a class `Smartphone` that **extends** `Phone` and **implements** both interfaces.  
Methods should display:
- *"Taking a photo"*
- *"Alarm is ringing"*

From `main()`, create a `Smartphone` object and call the methods.

---

## 💻 Technologies Used

- **Java 21** (or higher)  
- **IntelliJ IDEA**  
- **Git & GitHub**

---

## 📋 Requirements

- JDK 21 or higher installed  
- IntelliJ IDEA configured with the correct JDK  
- Git for source control  

---

## 🛠️ Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/<your_username>/1.Java-Language-Level1-and-2.git
   ```
2. Open the project in IntelliJ IDEA.
3. Ensure the configured JDK is version 21 or higher.

---

## ▶️ Execution

1. Run the `main()` method of each exercise:
   - `Level1/Exercise1/Main.java`
   - `Level1/Exercise2/Main.java`
   - `Level2/Exercise1/Main.java`

2. Observe the output messages printed in the console.

---

## 🌐 Deployment

This is an educational project and **does not require deployment**.  
It runs directly from the IntelliJ console or terminal.

---

## 🤝 Contributions

Contributions are welcome!  

1. Fork this repository  
2. Create a new branch:  
   ```bash
   git checkout -b feature/NewFeature
   ```
3. Commit your changes:  
   ```bash
   git commit -m "Add new feature"
   ```
4. Push to your branch:  
   ```bash
   git push origin feature/NewFeature
   ```
5. Open a pull request

---

## ✍️ Author

**Name:** *[Carlos Alberto Garzón Bedoya]*  
**Sprint:** 1 - *Java Language (Level 1 and 2)*  
**Reviewer:** *[Anyone]*
