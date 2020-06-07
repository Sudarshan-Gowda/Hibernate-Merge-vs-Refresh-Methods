
# Basic Example For Merge and Refresh Methods in Hibernate
This Project covers the simple basic example for demonstrating Merge and Refresh methods in Hibernate.

## Explanation:
 refresh() is used to re-populate the entity with latest data available in database.
 This method will reload the properties of the object from the database, overwriting them.
 
 merge() does exactly opposite to what refresh() does. It updates the database with values from the detached entity.
 
## Running Application locally

This application not requires any server setup, You can just run it as Java Application.


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/issues


## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* STS - Spring Tool Suite

### Steps:

1) Download or Clone this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods
```
2) To Import the Praject Using STS
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring MVC Configuration | Class or Java property files  |
|--------------------------|---|
|Fetch Function| [MainClassForFetch](https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/blob/master/src/main/java/com/star/sud/app/MainClassForFetch.java) |
|Merge Function| [MainClassForMerge](https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/blob/master/src/main/java/com/star/sud/app/MainClassForMerge.java) | 
|Properties Files | [hibernate.cfg.xml](https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/blob/master/src/main/resources/hibernate.cfg.xml) |


## Steps to test the application:

1) Once the application is installed properly, Go to the class files MainClassForFetch & MainClassForMerge and Run as Java Application
2) Verify the result with the User reference or guide of step1 & step 2.  
   
## User reference or guide.

1. Result For First class (Fetch) Execution
<img src="https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/blob/master/docs/Picture1.png" width="100%"/>

2. Result for Second class (Merge) Execution
<img src="https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/blob/master/docs/Picture2.png" width="100%"/>
 
### For More Details Use the Reference Links
1. https://howtodoinjava.com/hibernate/merging-and-refreshing-hibernate-entities/
 
 
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/Hibernate-Merge-vs-Refresh-Methods/issues) is the preferred channel for bug reports, features requests and submitting pull requests.
