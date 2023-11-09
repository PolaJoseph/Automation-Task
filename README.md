
# Automation Task-Validate Subscription Packages 
 
Validate the Subscription Packages – Type & Price and Currency for 3 Countries and print result in notepad

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Reporting](#Reporting)



## Introduction

this code Navigate to the following URL https://subscribe.stctv.com/ 
Validate the Subscription Packages – Type & Price and Currency for 3 Countries and print result in notepad


## Installation

In order to utilise this project you need to have the following installed locally:

- Maven 
- Chrome 
- Java 1.8
- TestNg

## Usage
In order to enter data of three countries needed to Validate it
you need 
- First go to this class to fill data ->  
    target/test-classes/TestCase/CountriesDataProvider.class
- Second go to this class to run TestCase ->
    target/test-classes/TestCase/ValidationTheSubscription.class

## Reporting
Reports for each module are written into their respective /test-output directories after a successful run.
print result in 
- HTML report for each feature in "test-output/emailable-report.html"
- Notepad for eah feature in "test-output/Validation_results.txt"


