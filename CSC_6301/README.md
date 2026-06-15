# CSC 6301 — Object-Oriented Design with Java

Project directory for **Merrimack College CSC 6301** (Object-Oriented Design with Java).

## Repository Contents

```
CSC_6301/
├── mod_04/
│   └── project04/
│       ├── AlertSystem.java          # Main entry point; manages and dispatches alerts
│       ├── NotificationMedium.java   # Interface defining the notification contract
│       ├── EmailService.java         # Concrete notification via email
│       ├── SMSService.java           # Concrete notification via SMS
│       ├── GenAI.txt                 # GenAI usage disclosure
│       └── README.md                 # Build and run instructions
└── mod_05/
    └── project_05/
        ├── AlertSystem.java          # Extended alert system with additional channels
        ├── NotificationMedium.java   # Interface defining the notification contract
        ├── EmailService.java         # Concrete notification via email
        ├── SMSService.java           # Concrete notification via SMS
        ├── WhatsAppService.java      # Concrete notification via WhatsApp
        ├── AlertSystemTest.java      # Unit tests for the alert system
        ├── GenAI.txt                 # GenAI usage disclosure
        └── README.md                 # Build and run instructions
```

## Build & Run

Requires **Java JDK 11+** and `javac` on your PATH.

```bash
# Compile
javac *.java

# Run
java AlertSystem

# Run tests (project 05 only)
java AlertSystemTest

# Generate JavaDocs
javadoc -d doc *.java
```

Run these commands from inside the project directory (`mod_04/project04/` or `mod_05/project_05/`).
