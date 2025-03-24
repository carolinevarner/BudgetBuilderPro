# Budget Builder Pro  

## **Overview**  
Budget Builder Pro is a **Java-based budgeting application** designed to help users manage their finances efficiently. The program calculates recommended spending allocations for essential expenses and provides financial advice to encourage better money management.  

**Key Features:**  
- **Custom Budget Calculator** – Users input their income and expenses, and the tool calculates suggested spending percentages.  
- **Financial Advice** – Identifies areas for improvement and acknowledges good spending habits.  
- **Pie Chart Visualization** – Uses **JFreeChart** to display budget breakdowns.  
- **Graphical User Interface (GUI)** – Built with **Eclipse Window Builder** for an interactive user experience.  

---

## **Project Structure**  
```bash
Budget-Builder-Pro/
│── src/
│   ├── Advice.java            # Provides financial feedback
│   ├── ExpenseCalculator.java # Core budget calculation logic
│   ├── Main.java              # User input handling & main application logic
│   ├── Validator.java         # Ensures valid user input
│
│   ├── GUI/
│   │   ├── MyFrame.java       # Handles GUI components
│   │   ├── CreateChart.java   # Generates the budget pie chart
│
│── lib/
│   ├── jfreechart-1.5.2.jar   # Charting library
│   ├── jcommon-1.0.24.jar     # Required dependency for charts
│
│── README.md                  # Project documentation
```

### **How It Works**
- The user inputs their monthly income and expenses for various categories.
- The application calculates the percentage of income spent on each category.
- It provides feedback on whether the user is within recommended spending limits.
- A pie chart is generated to visualize the budget distribution.

### **Building & Running**
#### **Prerequisites**
- Java Development Kit (JDK) 8 or later
- Eclipse IDE (optional, for GUI development)
- JFreeChart library (for pie chart visualization)

#### **Steps to Run**
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/Budget-Builder-Pro.git
   cd Budget-Builder-Pro
   ```
2. Compile and run the project:
   ```sh
   javac Main.java
   java Main
   ```
3. Follow the on-screen instructions to input your income and expenses.
4. View the calculated budget and pie chart.

#### **Required Software**  
- JFreeChart – For generating the pie chart.
- Eclipse WindowBuilder – For GUI development (optional).

#### **Installation Steps**  
1. Install the JDK:  
   ```sh
   sudo apt install openjdk-11-jdk
2. Download the JFreeChart library:
- Visit JFreeChart Download Page
- Add the .jar file to your project's build path.
- (Optional) Install Eclipse WindowBuilder for GUI development:
- Visit Eclipse WindowBuilder Download Page
- Follow the installation instructions.

## **Known Issues**  
### **Issue 1: Pie Chart Display**  
- The pie chart may not display correctly if the JFreeChart library is not properly added to the project's build path.
- Ensure the .jar file is correctly referenced in your IDE or build configuration.

### **Issue 2: Input Validation**  
- The application currently validates input to ensure it is a positive number and within the user's income range.
- If invalid input is provided, the application will prompt the user to re-enter the value.

### **Issue 3: GUI Compatibility**
- The GUI was developed using Eclipse WindowBuilder. If you are using a different IDE, you may need to adjust the GUI code or use an alternative GUI builder.

## **Contributors**  
- Caroline Varner - Project Lead
- Team Members - Tabitha Washington, Basile Sounantharak, James Whang, Samuel Travis, Idriys William
- Course: SWE 3313 - Intro to Software Engineering
- Instructor: Hassan Pournaghshband
- University: Kennesaw State University



