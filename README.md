# AreebTech_Task
This project is a Selenium WebDriver test suite for automating login scenarios on a web application. It includes test cases for different user credentials, login functionality, and a logout process. The tests are written in Java using TestNG and make use of the Selenium WebDriver framework for browser automation.

## Prerequisites

- You'll need [Java](https://www.oracle.com/java/technologies/javase-downloads.html) and [Maven](https://maven.apache.org/) installed on your system.

## Installation

1. Clone the repository to your local machine:
git clone https://github.com/Beshoy-Nader/AreebTech_Task.git

2. Navigate to the project directory:
cd AreebTech_Task

3. Compile and package the project using Maven:
mvn clean package

## Running Scenarios

1. Make sure you have ChromeDriver installed and set in your system PATH. You can download it from [here](https://chromedriver.chromium.org/downloads).

2. Update the `Login_Test` class if needed to configure your WebDriver or any other settings.

3. Execute the scenarios by running the `Login_Test` class. You can do this via Maven using the following command:
   mvn test -Dtest=Login_Test
4. The test results will be displayed in the console.




