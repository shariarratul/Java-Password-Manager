# Java Password Manager(Uni Project)

A console-based password manager written in Java.  
It generates & saves your website credentials (Website, Email, Password) into a text file stored in your system's **AppData** folder.

---

## 🚀 How it Works:
- Options: 1. Generate a random password 2. See Your Saved Passwords.
- Prompts you for **Website**, **Email**, and **Password Length** and generates a strong password.
- Saves passwords in `savedpass.txt` inside your AppData folder (e.g., `C:\Users\<USERNAME>\AppData\Local`).
- Example format: **example.com,user@example.com,pFQi2R_c7zs8**

---

## ▶️ How to Run
1. Clone this repository:
 ```bash
 git clone https://github.com/shariarratul/Java-Password-Manager.git
 cd Java-Password-Manager
```

2. Compile and Run:
```bash
javac Main.java
java Main
```
3. Data is stored in plain text (⚠️ not encrypted).

