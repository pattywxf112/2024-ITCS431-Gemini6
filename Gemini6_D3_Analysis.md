# Selected UseCase
- Create Science plan 
- Test a science plan
- Submit a Science plan       
- Create observing program
- Validate an Observing Program
  
# UseCase Decsription

| **Attribute** | **Details** |
| :--- | :--- |
| **Use Case Name** | Create Science Plan |
| **ID** | UC-001 |
| **Importance Level** | High |
| **Primary Actor** | Astronomers |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomers** - Want to create a science plan |
| **Brief Description** | The astronomers log into the system to create a science plan. |
| **Trigger** | An astronomer initiates creating a new science plan within the system. |
| **Type** | Internal |
| **Relationship** | **Association:** Astronomer, **Include:** Log in to the System, **Extend:** -, **Generalization:** - |

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
| **Alternate/Exceptional Flows** |A-1 If login fails, the system denies access. |
| :--- | A-2 If the astronomer enters invalid data in the science plan details, the system sends an error message.|
| :--- | A-3 If the created science plan conflicts with another plan, the system sends an error message to the astronomer.|


