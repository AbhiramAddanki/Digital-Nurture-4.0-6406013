# Digital-Nurture-4.0-6406013
#Cognizant DN 4.0 - Java FSE Deepskilling Hands-On

This repository contains all the mandatory hands-on exercises completed as part of the **Cognizant Digital Nurture 4.0 (Java Full Stack Engineer)** Deepskilling Program.

---

# Week 1 – Core Java and Design Principles

## Module 1: Design Patterns & Principles

## 1️. Singleton Pattern  
**Exercise**: Logger implementation using the Singleton Design Pattern.  
**Objective**: Ensure that only one instance of the logger exists across the application.  
**Highlights**:
- Thread-safe double-checked locking
- Lazy initialization
- Log methods with timestamp support

 Folder: `Week1/Module1/Exercise1-SingletonPattern`  
 Key Files: `Logger.java`, `LoggerTest.java`

---

## 2️. Factory Method Pattern  
**Exercise**: Document creation using the Factory Method Design Pattern.  
**Objective**: Abstract document creation logic for different types like Word, PDF, and Excel.  
**Highlights**:
- Common `Document` interface
- Factory classes for each document type
- Centralized testing through factory-based instantiation

 Folder: `Week1/Module1/Exercise2-FactoryMethodPattern`  
 Key Files: `Document.java`, `DocumentFactory.java`, `WordDocumentFactory.java`, etc.

---

###  Module 2: Algorithmic Thinking & Java Implementation

#### 3️. E-commerce Platform Search Function  
**Exercise**: Implementation of product search functionalities using Linear and Binary search.  
**Objective**: Develop efficient search for products in an e-commerce platform.  
**Highlights**:
- `Product` class with: `productId`, `productName`, `productCategory`
- Linear search by ID, name, category, price
- Binary search on sorted arrays

 Folder: `Week1/Module2/Exercise2-ECommercePlatformSearch`  
 Key Files: `Product.java`, `ProductLinearSearch.java`, `ProductBinarySearch.java`, `ProductSearchTest.java`  
 Discussion: `Exercise 02-discussion.docx`

---

#### 4. Financial Forecasting  
**Exercise**: Predict future financial value using recursion.  
**Objective**: Forecast future value based on initial value and growth rate.  
**Highlights**:
- Recursive implementation for compound growth
- Handles invalid inputs (negative values, invalid years, etc.)

 Folder: `Week1/Module2/Exercise7-FinancialForecast`  
 Key Files: `FinancialForecast.java`, `FinancialForecastTest.java`  
 Discussion: `Exercise 07-discussion.docx`

---

## Notes
- All exercises are written in **modular Java** following **OOP principles**.
- Discussions and complexity analyses are included in `.docx` files under each exercise folder.
- Git commits are structured **week-wise**: `Week1/`, `Week2/`, etc.

---
# Week 2 – Programming Languages

 Module 03 – PL/SQL Programming

---

1. Exercise 1 – Control Structures

Highlights:
- Demonstrates conditional branching using `IF`, `ELSIF`, and `ELSE`.
- Implements iterative logic using `LOOP`, `WHILE`, and `FOR`.
- Shows the use of variables and control flow in PL/SQL blocks.

> Folder: `Week 02-Programming Languages/Module 03-PLSQL Programming/Exercise 1 - Control Structures`

---

2. Exercise 3 – Stored Procedures

Highlights:
- Creation of stored procedures using `CREATE PROCEDURE`.
- Use of parameters with `IN`, `OUT`, and `IN OUT` modes.
- Execution through anonymous PL/SQL blocks or SQL Developer.

> Folder: `Week 02-Programming Languages/Module 03-PLSQL Programming/Exercise 3 - Stored Procedures`


