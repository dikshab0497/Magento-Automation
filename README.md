\# 🧪 Magento Automation Project



This is a Selenium automation framework for testing the Magento e-commerce website. It is built using \*\*Java\*\*, \*\*Maven\*\*, \*\*Cucumber (BDD)\*\*, and \*\*TestNG\*\* with professional features like \*\*Extent Reports\*\*, \*\*Log4j logging\*\*, and \*\*automatic screenshots on failure\*\*.



---



\## 📌 Project Highlights



\- 🔍 \*\*Selenium WebDriver\*\* for browser automation

\- 🧱 \*\*Maven\*\* for project and dependency management

\- 📘 \*\*Cucumber BDD\*\* for human-readable Gherkin scenarios

\- 🧪 \*\*TestNG\*\* for test execution and assertions

\- 📊 \*\*Extent Reports\*\* for rich HTML reporting

\- 📝 \*\*Log4j\*\* for runtime logging

\- 📸 \*\*Screenshot capture\*\* on failure

\- 📂 \*\*Page Object Model (POM)\*\* for maintainability and reusability

\- 🔁 \*\*Hooks (Before/After)\*\* for setup and teardown



---



\## 🛠️ Tech Stack



| Tool          | Purpose                        |

|---------------|--------------------------------|

| Java          | Programming Language           |

| Selenium      | UI Automation                  |

| Cucumber      | Behavior-Driven Development    |

| Maven         | Dependency Management          |

| TestNG        | Test Framework                 |

| Extent Reports| Advanced HTML Reporting        |

| Log4j         | Logging                        |

| Git \& GitHub  | Version Control                |



---



\## 🗂️ Project Structure
Magento-Automation/
├── src/
│ ├── main/java/
│ │ └── pages/ # Page Object Classes
│ ├── test/java/
│ │ ├── stepDefinitions/ # Step Definitions for Cucumber
│ │ └── runner/ # Test Runner Classes
├── features/ # Gherkin Feature Files
├── pom.xml # Maven Configuration
└── README.md # Project Overview

yaml
Copy
Edit

---

## 🚀 How to Run the Project

1. **Clone the Repo**
   ```bash
   git clone https://github.com/dikshab0497/Magento-Automation.git
   cd Magento-Automation
Import in IntelliJ or Eclipse as a Maven project

Install Dependencies

bash
Copy
Edit
mvn clean install
Run Tests

Run using Cucumber Test Runner (.java class)

Or use Maven:

bash
Copy
Edit
mvn test
📊 Reporting
This framework uses Extent Reports to generate elegant and customizable HTML reports after each test execution.

✅ Reports are automatically generated and stored in the configured report directory.

🧪 Sample Scenarios Covered
User login

Product search

Add to cart

Checkout flow

Invalid input validation

Logout functionality

...and more coming soon!

🙋‍♀️ Author
Diksha Bandagale
📧 dikshab0497@gmail.com
🔗 LinkedIn

📌 TODO / Improvements
Add screenshot capture on test failure

Add tagging in feature files for modular test execution

Integrate cross-browser testing

Add GitHub Actions or Jenkins pipeline for CI/CD

Email the Extent report post-execution

yaml
Copy
Edit

---

### 🔹 Step 3: Save the File

Just press `Ctrl + S` or click File → Save.

---

### 🔹 Step 4: Push the Updated Content to GitHub

Go back to Git Bash and run:

```bash
git add README.md
git commit -m "Updated README with full project details"
git push
🔍 Result:
Check your repo here 👉 https://github.com/dikshab0497/Magento-Automation

You’ll now see your full README nicely rendered on the homepage.

Let me know when it's done — we can then improve .gitignore, add screenshots to the report, or anything else you'd like 💻🚀








You said:
also i ahve used log4g for log and screenshots etc


ChatGPT said:
Awesome! 🎯 You're building a solid professional-grade framework — using Log4j for logging and capturing screenshots on failures makes it robust and real-world ready. Let’s now add these features to your README.md so recruiters, teammates, and interviewers can quickly see your project strengths.

✅ Updated Sections for README.md
Add the following in your README file to reflect Log4j and Screenshot functionality:

🔧 Additional Framework Features
📝 Log4j for detailed runtime logs (info, debug, error)

📸 Automatic screenshot capture on test failure

📁 Organized logs & screenshots stored in timestamped folders

🧼 Hooks for test setup and teardown (via Cucumber)

🔐 GitHub version-controlled code

📋 Logging with Log4j
This framework uses Apache Log4j to manage and store logs during test execution.

Logs are useful to trace failures, track test flow, and debug issues efficiently.

🔹 Log levels:

INFO: General test steps

DEBUG: Detailed internal steps

ERROR: When exceptions or failures occur

📁 Logs are saved under: logs/ or configured directory in log4j.properties

📸 Screenshots on Failure
Whenever a test scenario fails, a screenshot is automatically captured and saved.

📍 Screenshot location: screenshots/ (or as configured)

📌 Integrated with Extent Reports — failed steps show screenshots

This helps in quick debugging and improves test reporting quality.





