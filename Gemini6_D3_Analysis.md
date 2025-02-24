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
| :--- | If the login fails, the system allows the astronomer to retry the login. |
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
| **Primary Actor** | Astronomer |
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
| **Generalization:** | Science Planning Process |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The astronomer navigates to the Science Plan Management section. |
| 2 | The astronomer reviews the list of validated science plans. |
| 3 | The astronomer selects the science plan they want to submit. |
| 4 | The astronomer submits the science plan. |
| **SubFlows** | S-1: Astronomer Cancels Submission 1. The astronomer selects a science plan but decides not to submit it.  2. The astronomer either saves it for later or exits the submission process. |
| **Alternate/Exceptional Flows** | S-1, 4a1: The astronomer reviews the science plan after canceling the submission and decides to make adjustments before saving it. |





