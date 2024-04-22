# IAM Role Policy Verifier

# Description

A simple Java library for verifying JSON data according to the AWS IAM role policy format. The verifyJson method parses the JSON file and returns false if the "Resource" field contains a single asterisk *, otherwise it returns true.

# Prerequisites
To use this library, the following tools are required:

* Java Development Kit (JDK) version 8 or higher
* Integrated development environment or code editor

# Installation
Clone the repository to your local environment:

_git clone https://github.com/BStchw/remitly

Import the project into your development environment.

# Usage
Method verifyJson

_public static boolean verifyJson(String filePath)_

The verifyJson method is used to verify JSON data according to the AWS IAM role policy format.

# Parameters:

filePath - Path to the JSON file to be verified.

# Returns:

true - If the "Resource" field in the JSON file does not contain a single asterisk *.

false - If the "Resource" field in the JSON file contains a single asterisk *.

# Tests
The project includes a set of unit tests to verify the correctness of the verifyJson method. To run the tests, follow these steps:

1. Open the project in your development environment.
2. Run the tests with the IAMRolePolicyVerifierTest class.

# How to Run
To use the library in your project, follow these steps:

1. Import the library into your project.
2. Call the verifyJson method with the appropriate path to the JSON file.

# Author
Bartłomiej Stachów
