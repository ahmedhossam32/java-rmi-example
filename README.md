# 📘 Java RMI Example — Client/Server Calculator

This project demonstrates a simple **Java RMI (Remote Method Invocation)** application built using a **client–server architecture**.  
The server exposes a remote calculator service, and the client invokes its methods over the network.

This example includes:
- A **remote interface** shared between client and server  
- A **server implementation** of mathematical operations  
- A **serializable Result object** sent between machines  
- A **client** that connects to the registry, looks up the remote object, and invokes methods

---

## 🚀 Features

- Java RMI communication (remote method calls)
- Remote interface with three operations:
  - `add(x, y)`
  - `sub(x, y)`
  - `getLastResult()`
- Serializable `Result` data object returned from remote calls
- Server-side RMI Registry setup using `LocateRegistry.createRegistry()`
- Client-side lookup and invocation of remote service
- Clear demonstration of distributed object communication

---

## 📂 Project Structure

```text
java-rmi-example/
│
├── RMIServer/
│   ├── src/
│   │   └── rmi/
│   │       ├── CalculatorInterface.java
│   │       ├── Calculator.java
│   │       ├── Result.java
│   │       └── RMIServer.java
│
└── RMIClient/
    ├── src/
    │   └── rmi/
    │       ├── CalculatorInterface.java
    │       ├── Result.java
    │       └── RMIClient.java
```text


> **Note:**  
> The `CalculatorInterface` and `Result` classes must be **identical** on both the client and the server  
> (same package, same name, same content).

---

## 🛠 How It Works

### ✔ Server Side
- Create a remote object (`Calculator`) that extends **UnicastRemoteObject**  
- Create an **RMI registry** on port **500**  
- Bind the remote object under the name **"calc"**

---

### ✔ Client Side
- Connect to the server's RMI registry  
- Look up the remote object using the name **"calc"**  
- Invoke remote methods, receiving `Result` objects returned from the server  

---

## ▶️ Running the Project

### 1️⃣ Run the Server

Open the **RMIServer** project and run:


