This project simulates an elevator system that handles one user and one simulated external floor request per iteration. 
The elevator also has the ability to shutdown given a special key

## Features
- Main user selects destination floor.
- Simulated secondary user requests the elevator.
- Elevator picks up secondary passenger on the way and prioritizes main user's floor selection.
- Elevator shutdown mode for maintenance.

## Assumptions
- Building has 14 floors (1–14).
- One elevator.
- User input is expected to be valid integers.
- user knows that special code for shut down is inserting the key, and that the key is -1.

## Optional Enhancements
- Allow for simulated internal requests.
- Allow for multiple external requests during elevator movement.

## Example Output:
```
--------------------------------------
  Welcome to Palmer Center
--------------------------------------
Please Select a floor number 1-14 or insert key to shutdown: 5
Doors closing
Moving
Ding! Floor: 2
Ding! Floor: 3
Ding! Floor: 4
Ding! You have arrived to floor 5 Doors are opening.
Please Select a floor number 1-14 or insert key to shutdown: 6
Doors closing
Moving
Ding! You have arrived to floor 6 Doors are opening.
Please Select a floor number 1-14 or insert key to shutdown: 14
Doors closing
Moving
Ding! Floor: 7
Ding! Floor: 8
Ding! Floor: 9
Ding! Floor: 10
Ding! Floor: 11
Stopping for external request
Doors opening
Doors closing
Ding! Floor: 12
Ding! Floor: 13
Ding! You have arrived to floor 14 Doors are opening.
Please Select a floor number 1-14 or insert key to shutdown: -1
Shutting down...
```
## 🧑‍💻 Author
**Corinne Allen**  
📧 [allen.e.corinne@gmail.com](mailto:allen.e.corinne@gmail.com)  
💼 [LinkedIn](https://www.linkedin.com/in/ceallen/)  
🐙 [GitHub](https://github.com/RinAllen18)

