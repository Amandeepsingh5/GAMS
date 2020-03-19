![](https://travis-ci.com/hasanissa25/GAMS.svg?token=HEzWgsEdthBJKxtEKe9t&branch=master)
# Graduate Admissions Management System 
# SYSC4806 - Group 3
# Deployment : https://group3-gams.herokuapp.com/login
#### Hasan [@hasanissa25](https://github.com/hasanissa25)
#### Amandeep Singh[@amandeepsingh5](https://github.com/amandeepsingh5)
#### Zoha Mehdi 
#### Tahereh Ghadiri Modarres
#### Tashfiq Akhand

## Project Description
Applicants submit their file containing their personal info, their desired field of research, a list of profs they want to work with, and various documents such as their CV, a copy of their diploma, grade audit, by a certain deadline. Profs submit a profile specifying their fields of research. The applicant files can be filtered/selected by an administrator. Those that are considered good enough are routed to profs for evaluation by a deadline. Profs receive an email notification to go check the list of new applicants assigned to them. They evaluate the student by studying their application info, and enter their assessment: “don’t recommend for admission”, “recommend but not interested in supervision”, “recommend but no funding”, “recommend and yes to funding”. The admin can then view the recommendation of the profs and make a decision.

### Overall Workflow 
1. An Applicant creates an account
1. Applicant submits their file with their corresponding information
1. A Professor submits their profile specifying their fields of research
1. Administrator filters applications and chooses certain applications to route to the professor 
1. Professor receives an email notification to go check the list of new applicants assigned to them
1. Professor opens the list of applicants
1. Professor reviews the applications of each applicant, and make an evaluation decision for them.
1. Administrator views the recommendation of the professor and makes a decision.
  
### List of project Use Cases
#### List of actors:
* Applicant
* Professor
* Administrator 

#### Use Case 1: User Creates Account 
Primary Actor: Applicant , Professor , Administrator

#### Use Case 2: User Logs in
Primary Actor: Applicant or Professor or Administrator

#### Use Case 3: Applicant Submits Application
Primary Actor: Applicant

#### Use Case 4: Professor Manages Profile
Primary Actor: Professor

#### Use Case 5: Administrator Screens Applicants
Primary Actor: Administrator

#### Use Case 6: Administrator Evaluates Applicants
Primary Actor: Professor

#### Use Case 7: Administrator Makes Final Decision on Applications
Primary Actor: Administrator


## Project Milestone 1:

* Set up project; Travis CI, Heroku, and GitHub.
* Functionality: Applicant Login, Professor Login, Professor Creates a Field Of Research, Applicant can view field of research.
* the Kanban
* Unit and Integration tests
* the Issues and Code reviews 

## Database Schema for Milestone 1:

FieldOfResearch

* id
* description
* name

EndUser

* id
* confPassword
* password
* role
* username 

Student

* email
* cv
* diploma
* grade audit

![entityManagerFactory(EntityManagerFactoryBuilder)](https://user-images.githubusercontent.com/34280127/76048172-0d570900-5f33-11ea-9ebe-1bd790f0a385.png)

## Project Milestone 2:
* Applicant Functionality: 
    * Create a profile
    * Join a Professors Field Of Research.
  
* Administrator Functionality:
    * Register an account
    * Login to the system
    * Administrator can view the data (email,cv, diploma and grade audit) submitted by the student
* Unit and Integration Tests for each new functionality
* Issues and Code Reviews 

## Steps To Verify Functionality (For the marking TA)
* Run the application: https://group3-gams.herokuapp.com/login
* **Professor Functionality**: Create a Field of Research.    
    * Click Register Now, to go to the registration page.
    * For Role, choose the Professor Role, and any username and password combination. (Case Sensitive)
    * Login using the Professor account created in the previous step.
    * Click Create Field Of Research, to be redirected to the creation page of field of research.
    * Enter the desired Title and Description for your field of research and click Add Field Of Research to submit it.
    * Click logout at the top right of the page to prepare for the next step.
* **Student Functionality**: Create a student profile, and request to join an existing field of research.
    * Click Register Now, to go to the registration page.
    * For Role, choose the Student Role, and any username and password combination. (Case Sensitive)
    * Login using the Student account created in the previous step.
    * Click Create Student profile, to be redirected to the student profile creation page.
    * Enter an Email, CV, Diploma, and your Grade Audit. (Currently set to text fields but will be made into documents in the upcoming milestones), and click Save to submit.
    * Click Available Fields Of Research, click the Actions button on the field of research you are interested in, and click Select, to request to join.
    * Click Home at the top left of the screen, and click Current Application. You can now see your student profile, including the fields of research you applied to.
* **Administrator Functionality**: View current Student Applications.
    * Click Register Now, to go to the registration page.
    * For Role, choose the Administrator Role, and any username and password combination. (Case Sensitive)
    * Login using the Administrator account created in the previous step.
    * Click Current Student Applications
    * Here you can view all the current applications students have made. (You currently can only view the applications, but we will be implementing "Send to the professor for approval" functionality in the upcoming milestone)
    
