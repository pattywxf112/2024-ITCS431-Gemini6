# RevisionLog 
- https://chatgpt.com/share/67905f90-2174-800d-b641-14c69ddd8d88

| Requirement ID | Description | Modification |
| :--- | :--- | :--- |
| F1 | The system shall allow users to log in using unique credentials. | - |
| F2 | The system shall provide role-based access control, enforcing privileges for astronomers, telescope operators, administrators, science observers, support staff, and developers. | Merge functional requirements 2 and 3 because of the duplicates |
| F3 | The system shall allow astronomers to view, create, edit, and submit science plans through the web interface while preventing them from directly controlling the telescope. | Merge functional requirements 4 and 7 because of the duplicates |
| F4 | The system shall allow telescope operators to manage telescope operations and monitor safety. | Rearranged requirement number from F5 to F4 |
| F5 | The system shall allow science observers to validate submitted science plans and transform them into executable observing programs. | Rearranged requirement number from F8 to F5 |
| F6 | The system shall queue and prioritize observing programs based on telescope availability, weather conditions, and instrument configurations. | Rearranged requirement number from F9 to F6 |
| F7 | The system shall allow telescope operators to execute observing programs approved by science observers. | Rearranged requirement number from F10 to F7 |
| F8 | The system shall support remote monitoring, enabling users to observe telescope performance from off-site locations. | Rearranged requirement number from F11 to F8 |
| F9 | When observations are made, the system shall automatically archive data (e.g., raw images, logs) into the Gemini Archive subsystem. | Rearranged requirement number from F12 to F9 |
| F10 | The system shall allow users to access processed and raw data through a secure interface with appropriate role-based permissions. | Rearranged requirement number from F13 to F10 |
| F11 | The system must log all actions (e.g., start-ups, errors, observations) with time-stamped entries. | Rearranged requirement number from F14 to F11 |
| F12 | While in Remote Observing mode, the system shall allow astronomers and operators to monitor observations from remote locations. | Rearranged requirement number from F15 to F12 |
| F13 | When faults occur in the telescope or subsystems, the system shall notify relevant users with categorized alerts based on severity (e.g., warnings, critical faults). | Merge functional requirements 16 and 17 because of the duplicates |
| F14 | The system shall provide diagnostic tools for troubleshooting and resolving issues. | Rearranged requirement number from F18 to F14 |
| F15 | The system shall allow telescope operators to select, configure, and reconfigure instruments for observation without disrupting telescope operations. | Merge functional requirements 19 and 21 because of the duplicates |
| F16 | The system shall give access to meteorological data from a connected weather station to the user. | Rearranged requirement number from F20 to F16 |
| F17 | The system must allow multiple users to monitor telescope operations at the same time without interfering with each other's active sessions. | Rearranged requirement number from F22 to F17 |
| F18 | The system shall allow team observing features to support collaboration between different users at different locations, with real-time updates and communication tools. | Rearranged requirement number from F23 to F18 |
| F19 | The system shall integrate with a telescope simulator, allowing astronomers to test science plans and train on the system without using the live telescope. | Rearranged requirement number from F24 to F19 |
| F20 | The system shall allow support staff and developers to access the system at maintenance or test levels. | Rearranged requirement number from F25 to F20 |
| F21 | The system must support reconfiguration procedures to adjust the observing environment as needed. | Rearranged requirement number from F26 to F21 |
| F22 | The system must support multiple observing styles, including Interactive Observing, Queue-Based Observing, Service Observing, and Remote Observing. | Rearranged requirement number from F27 to F22 |
| F23 | The system must automatically pause or adjust observations when necessary. | Rearranged requirement number from F28 to F23 |
| F24 | The system shall support the recovery system in case of Observation system failure. | Rearranged requirement number from F29 to F24 |
| F25 | The system shall provide standardized interfaces for installing and configuring visitor instruments without disrupting existing telescope operations. | Rearranged requirement number from F30 to F25 |

