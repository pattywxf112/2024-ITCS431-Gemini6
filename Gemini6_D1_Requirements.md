# Functional Requirement  
- https://chatgpt.com/share/6791b7d5-2ff8-8003-94c8-540b951f4dd4 
- https://chatgpt.com/share/67905f90-2174-800d-b641-14c69ddd8d88 

| Feature                         | Req No. | Description                                                                                                           |
| :----------------------------- | :------: | :------------------------------------------------------------------------------------------------------------------- |
| User Authentication            | 1        | The system shall allow users to log in using unique credentials.                                                     |
| Role Management                | 2        | The system shall provide access control based on roles, including astronomers, telescope operators, administrators, science observers, support staff, and developers. |
| Role Management                | 3        | The system shall enforce privileges for each role.                                                                   |
| Role Management                | 4        | The system shall allow astronomers to view and submit science plans but shall prevent them from directly controlling the telescope. |
| Role Management                | 5        | The system shall allow telescope operators to manage telescope operations and monitor safety.                         |
| Science Plan Management        | 7        | The system shall allow astronomers to create, edit, and submit science plans through the web interface.               |
| Science Plan Management        | 8        | The system shall allow science observers to validate submitted science plans and transform them into executable observing programs. |
| Science Plan Management        | 9        | The system shall queue and prioritize observing programs based on telescope availability, weather conditions, and instrument configurations. |
| Telescope Operation and Monitoring | 10     | The system shall allow telescope operators to execute observing programs approved by science observers.               |
| Telescope Operation and Monitoring | 11     | The system shall support remote monitoring, enabling users to observe telescope performance from off-site locations.  |
| Data Collection and Management | 12       | When observations are made, the system shall automatically archive data (e.g., raw images, logs) into the Gemini Archive subsystem. |
| Data Collection and Management | 13       | The system shall allow users to access processed and raw data through a secure interface with appropriate role-based permissions. |
| Data Collection and Management | 14       | The system must log all actions (e.g., start-ups, errors, observations) with time-stamped entries.                   |
| User Interface for Observing Modes | 15    | While in Remote Observing mode, the system shall allow astronomers and operators to monitor observations from remote locations. |
| Notification and Fault Management | 16     | When faults occur in the telescope or subsystems, the system shall notify users.                                     |
| Notification and Fault Management | 17     | The system shall send actionable alerts categorized by severity (e.g., warnings, critical faults) to the user.       |
| Notification and Fault Management | 18     | The system shall provide diagnostic tools for troubleshooting and resolving issues.                                  |
| Instrument and Environment Management | 19 | The system shall allow telescope operators to select and configure instruments for observation.                      |
| Instrument and Environment Management | 20 | The system shall give access to meteorological data from a connected weather station to the user.                    |
| Instrument and Environment Management | 21 | The system shall support instrument reconfiguration without disrupting telescope operations.                         |
| Remote Access and Collaboration | 22      | The system must allow multiple users to monitor telescope operations at the same time without interfering with each other's active sessions. |
| Remote Access and Collaboration | 23      | The system shall allow team observing features to support collaboration between different users at different locations, with real-time updates and communication tools. |
| Simulator Integration          | 24       | The system shall integrate with a telescope simulator, allowing astronomers to test science plans and train on the system without using the live telescope. |
| System Setup and Maintenance   | 25       | The system shall allow support staff and developers to access the system at maintenance or test levels.              |
| System Setup and Maintenance   | 26       | The system must support reconfiguration procedures to adjust the observing environment as needed.                    |
| Observing Modes                | 27       | The system must support multiple observing styles, including Interactive Observing, Queue-Based Observing, Service Observing, and Remote Observing. |
| Observing Modes                | 28       | The system must automatically pause or adjust observations when necessary.                                           |
| Observing Modes                | 29       | The system shall support the recovery system in case of Observation system failure.                                  |
| Visitor Instrument Integration | 30       | The system shall provide standardized interfaces for installing and configuring visitor instruments without disrupting existing telescope operations. |


# Non - Functional Requirement  
- https://chatgpt.com/share/67939bee-3084-800b-870f-5ecbdd672401
- https://chatgpt.com/share/6790a333-a770-800b-b566-d9bba97136da

| Requirement Number | Description                                                                                           |
| :----------------- | :------------------------------------------------------------------------------------------------ | 
| 1                 | The system should handle up to 100 actions per second during busy times.                          |
| 2                 | The system should support continuous operation with remote monitoring facilities available 24/7.   |
| 3                 | The system should save data in multiple places to ensure it is not lost during a failure.          |
| 4                 | The system shall schedule tasks to use telescope time effectively and minimize delays.             |
| 5                 | The system shall respond promptly for tasks such as telescope control and monitoring.              |
| 6                 | The system must respond to user actions (e.g., navigation, form submissions) within 2 seconds under normal load conditions. |
| 7                 | The web application must support at least 500 concurrent users without performance degradation.    |
| 8                 | The system should provide feedback for user actions and include error-prevention features.         |
| 9                 | The system shall support upgrades to use new technology without stopping operations.               |
| 10                | The system should track all commands, errors, and activities with timestamps for auditing and analysis. |
| 11                | The system should support keyboard navigation and include screen reader compatibility for visually impaired users. |
| 12                | The system should use a dark theme as the primary option such as Bark Blue, Midnight Black, and Neutral Gray. |
| 13                | The system should provide a toggle for a light theme for users who prefer it during daytime operations such as Sky Blue, Bright Yellow, and Emerald Green. |
| 14                | The system should accommodate different devices and screen resolutions.                            |
| 15                | The system should provide an intuitive and consistent design for ease of use or user-friendly by modern standards. |
| 16                | The system must include secure tools for sharing data with global scientific communities while protecting intellectual property. |
| 17                | The system should detect, isolate, and recover from subsystem failures without affecting the entire operation. |
| 18                | The system must store up to 7 days of data from the largest instrument, with the last 3 days readily accessible interactively from a hard disk or similar medium. |
| 19                | The system should enable seamless operation by multiple users, both locally and remotely, with clear role-based access control. |
| 20                | The system’s downtimes should ideally not exceed 15 minutes per night or one night per month.       |


