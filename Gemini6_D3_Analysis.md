# Selected UseCase
- Create Science plan 
- Test a science plan
- Submit a Science plan       
- Create observing program
- Validate an Observing Program
  
# UseCase Decsription

# Create Science Plan
| **Use Case Name** | Create Science Plan |
| :--- | :--- |
| **ID** | UC-001 |
| **Importance Level** | High |
| **Primary Actor** | Astronomers |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomers** - Want to create a science plan |
| **Brief Description** | The astronomers log into the system to create a science plan. |
| **Trigger** | An astronomer initiates creating a new science plan within the system. |
| **Type** | Internal |
| **Relationship** | 
|**Association:** | |Astronomer|
|**Include:**|  Log in to the System|
|**Extend:** |  |
|**Generalization:** |  |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | Astronomers must log in to access the system. |
|  | S-1 If the login fails, the system allows the astronomer to retry the login. |
| 2| Astronomers enter science plan details including plan name, ID, and observation mode. |
| 3 | Astronomers set target selection (choose astronomical objects). |
| 4 | Astronomers set observation time. |
| 5 | Astronomers should set exposure data, including time, number of images, SNR, and calibration. |
| 6 | Astronomers define image processing settings, including color, contrast, brightness, and saturation. |
| 7 | Astronomers add a science plan to the science plan list. |
| **SubFlows** | S–1 If the login fails, the system allows the astronomer to retry the login |
| **Alternate/Exceptional Flows** | 1a If login fails, the system denies access. |
|  | 2a If the astronomer enters invalid data in the science plan details, the system sends an error message.|
|  | 7a If the created science plan conflicts with another plan, the system sends an error message to the astronomer.|

# Test a Science Plan

| **Use Case Name** | Test a Science Plan |
| :--- | :--- |
| **ID** | UC-002 |
| **Importance Level** | High |
| **Primary Actor** | Astronomer |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomer** - Wants to test the science plan before submission, ensuring the plan is feasible and aligns with observational goals. 
| | **Telescope Operator** - Wants to monitor or assist in the testing process, ensuring that the virtual telescope behaves as expected.
| | **Science Observer** - Wants well-tested science plans to execute observations accurately, ensuring the plan is validated properly before execution.
| | **Administrator** - Wants to oversee access permissions and ensure that users have the necessary roles to test a science plan. |
| **Brief Description** | This use case describes how an astronomer evaluates the feasibility of a science plan before submission. This process ensures that the observational parameters, telescope settings, and execution steps are correct and align with system constraints. |
| **Trigger** | An astronomer wants to evaluate the feasibility of a created science plan before submission. |
| **Type** | External |
| **Relationship** | **Association:** Astronomer |
| | **Include:** Operate the interactive observing (virtual telescope) |
| | **Extend:** - |
| | **Generalization:** - |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The Astronomer selects a previously created science plan. |
| 2 | The Astronomer operates the interactive observing (virtual telescope) to test the execution. (Includes "Operate the interactive observing (virtual telescope).") |
| 3 | The Astronomer reviews the results and makes necessary adjustments. |
|  | S-1: Review and Finalize the Test Results is performed. |
| **SubFlows** |  S–1: Review and Finalize the Test Results  1. The Astronomer reviews the summary report. 2. The Astronomer decides whether to modify and retest or go to the “Submit a Science Plan” use case. |
| **Alternate/Exceptional Flows** | 2A1  The system identifies critical issues, preventing further testing until issues are fixed. |
|  | 2A2  If the system encounters an error during simulation, the user is notified and may need to retry later. |

# Submit a Science Plan

| **Use Case Name** | Submit a Science Plan |
| :--- | :--- |
| **ID** | UC-003 |
| **Importance Level** | High |
| **Primary Actor** | Astronomer |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomer** – Wants to successfully submit a science plan for execution, ensuring it aligns with observation requirements and constraints. |
| | **Science Observer** – Needs a validated and properly formatted science plan to transform into an observing program. 
| | **Telescope Operator** – Ensures the science plan can be executed within system constraints. |
| **Brief Description** | This use case describes how an astronomer submits a science plan. The plan is then validated by a science observer and converted into an observing program for execution. |
| **Trigger** | The astronomer decides to submit a science plan for future observation. |
| **Type** | External |
| **Relationship** | |
|**Association:** | Astronomer |
| **Include:** | - | 
| **Extend:** | - |
| **Generalization:** | - |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The astronomer navigates to the Science Plan Management section. |
| 2 | The astronomer reviews the list of validated science plans. |
| 3 | The astronomer selects the science plan they want to submit. |
| 4 | The astronomer submits the science plan. |
| **SubFlows** | S-1: Astronomer Cancels Submission 1. The astronomer selects a science plan but decides not to submit it.  2. The astronomer either saves it for later or exits the submission process. |
| **Alternate/Exceptional Flows** | S-1, 4a1: The astronomer reviews the science plan after canceling the submission and decides to make adjustments before saving it. |

# Create Observing Program

| **Use Case Name** | Create observing program |
| :--- | :--- |
| **ID** | UC-004 |
| **Importance Level** | High |
| **Primary Actor** | Science Observer |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | *Science Observer: Wants to create an observing program after a validated science plan.| 
| | Astronomer: Provides the approved science plan.|
| **Brief Description** |This use case describes how a Science Observer creates an observing program from an approved science plan.|
| **Trigger** | The Science Observer initiates the creation of an observing program from an approved science plan.|
| **Type** | External |
| **Relationship** | |
|**Association:** |  Science Observer|
| **Include:** | - | 
| **Extend:** | - |
| **Generalization:** | - |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The Science Observer reviews available Science Plans in the system. |
| 2 |The Science Observer selects a validated science plan. |
| 3 |The Science Observer converts the science plan into an observing program. |
| 4 |The Science Observer configures the observing program parameter. |
| |S-1: Configure Parameter Settings subflow. |
| 5 |The Science Observer submits the observing Program. |
| 6 |The Science Observer saves to create observing program |
| **SubFlows** |S-1 Configure Parameter Settings 1. The Science Observer adjusts telescope and instrument configurations based on star catalog data. 2. The Science Observer ensures all parameters align with the Science Plan requirements.|
| **Alternate/Exceptional Flows** | S-1, 1a1: Invalid or conflicting parameters ; The Science Observer receives an alert message indicating the error. The Science Observer reviews and corrects the parameter settings before proceeding. |


# Validate an Observing Program

| **Use Case Name** | Validate an Observing Program |
| :--- | :--- |
| **ID** | UC-005 |
| **Importance Level** | Medium |
| **Primary Actor** | Telescope Operator |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** |Telescope Operator - Ensures the observing program is valid and executable without errors.| 
| | Science Observer - Relies on validation to ensure smooth execution and data quality. |
| | Astronomer -  Wants confirmation that their submitted observing program is accurate and feasible. |
| | Administrator - Needs traceability of programs for system integrity and reporting.|
| **Brief Description** |The Telescope Operator validates an Observing Program to ensure it meets operational requirements and aligns with scientific objectives. This validation ensures the telescope will execute the program smoothly without interruptions or errors.|
| **Trigger** | The Science Observer submits a new observing program for execution. A Telescope Operator selects an observing program for review.|
| **Type** | External |
| **Relationship** | |
|**Association:** |  Telescope Operator |
| **Include:** | - | 
| **Extend:** | - |
| **Generalization:** | - |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | Telescope Operator logs into the system. |
| 2 | The operator selects an Observing Program|
| 3 | The system loads the observing program and displays its details.|
| 4 | The operator performs validation checks.|
| 5 | The system runs automated verification tests for feasibility.|
| 6 | If validation passes, the system marks the observing program as "Valid".|
| 7 | If validation fails, an error report is generated.|
| 8 | The Telescope Operator decides whether to Modify the observing program or Request corrections from the Science Observer.|
| **SubFlows** |S-1: Automatic Validation Checks 1.The system automatically verifies instrument settings, observation conditions, and telescope availability. 2. If errors are found, the system flags inconsistencies and suggests corrections. |
| **Alternate/Exceptional Flows** | A-1: The Observing Program contains an invalid instrument setting. The system highlights the issue and prompts for correction. |
| | A-2: The Observing Program conflicts with another scheduled observation. The system suggests a reschedule or alternate configuration. |
| | A-3: The validation fails due to an unavailable telescope resource. The system alerts the operator and suggests an alternative setup.|
| | A-4: Critical error occurs during validation (e.g., missing data). The system generates a failure report and logs the issue|
 

# Activity Diagram
# Create science plan
![D3_SE_proj-activity drawio cream](https://github.com/user-attachments/assets/f10d458a-2759-455e-b614-f8d75315eeeb)

# Test a science plan
![bew act](https://github.com/user-attachments/assets/15d5b124-6618-491c-b742-a8e09a13ca35)

# Submit a Science plan  
![pin act](https://github.com/user-attachments/assets/f6339404-9dba-452b-869c-3d9e48a5b974)

# Create observing program
<img width="341" alt="bam act" src="https://github.com/user-attachments/assets/25f7a305-ad27-40a0-8dc3-abde7e180131" />

# Validate an Observing Program
![patty ac](https://github.com/user-attachments/assets/9dbd458b-5ea9-4058-9772-33745f62169b)


# Class Diagram 
![Gemini6 Class Diagram-Copy of Page-1 drawio](https://github.com/user-attachments/assets/ccf3e2ed-ba1d-4463-8abf-08501f29f674)


# Sequence Diagram

# create science plan
![D3_SE_proj-final drawio](https://github.com/user-attachments/assets/58bdffc4-60ff-4aa2-a8b5-8b28cfa4af8b)

# Test a science plan
![bew sw](https://github.com/user-attachments/assets/38c574a6-08ff-4858-a8f0-e7cb685d2a80)


# Submit a Science plan  
![pinsequence](https://github.com/user-attachments/assets/c862df01-409a-4871-a8ee-6ac8acbfea6f)


# Create observing program
<img width="574" alt="bam se" src="https://github.com/user-attachments/assets/f9f4ca15-4f40-4b9c-9243-3ac5b03c92de" />

# Validate an Observing Program
![patty seq](https://github.com/user-attachments/assets/f9288760-53a8-42ee-8936-f59fc32bea29)
