# Add Numbers – Java Swing Calculator

A simple Java desktop application built with Swing. It takes four numbers from the user and displays their sum in a read-only result field.

## Features

- Graphical window titled **Simple Calculator**
- Four input fields for numbers (decimals and negatives are supported)
- **Add** button: adds the four numbers and shows the result
- **Clear** button: empties all fields, including the result
- **Reset** button: sets all fields, including the result, to `0`
- **Exit** button: closes the application
- Shows an error dialog if any field contains invalid input

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac AddNumbers.java
```

### Run

```bash
java AddNumbers
```

## How to Use

1. Enter a number in each of the four fields.
2. Click **Add** to see the sum in the **Result** field.
3. Click **Clear** to empty all fields, or **Reset** to set them all to `0`.
4. Click **Exit** to close the application.

## Example

| First | Second | Third | Fourth | Result |
|-------|--------|-------|--------|--------|
| 10 | 20 | 30 | 40 | 100.0 |
| 1.5 | 2.5 | -1 | 3 | 6.0 |

If a field is empty or contains text (for example `abc`), a dialog appears with the message:

> Please enter valid numbers in all four fields.

## How It Works

- `AddNumbers` extends `JFrame` and uses absolute positioning (`setLayout(null)` with `setBounds`) to place the components.
- The Add button parses each field with `Double.parseDouble()` and displays the sum.
- A `NumberFormatException` is caught to show the error dialog for invalid input.
- The window is started on the Swing event thread with `EventQueue.invokeLater()`.

## Project Structure

```
.
├── AddNumbers.java
└── README.md
```

## Possible Improvements

- Use a layout manager (such as `GridLayout` or `GroupLayout`) instead of absolute positioning so the window resizes properly
- Add more operations such as subtract, multiply, and divide
- Format the result to a fixed number of decimal places
- Support a variable number of inputs
- Move focus back to the first field after Clear or Reset

## Author

Your Name – [GitHub](https://github.com/<your-username>)# Add Numbers – Java Swing Calculator

A simple Java desktop application built with Swing. It takes four numbers from the user and displays their sum in a read-only result field.

## Features

- Graphical window titled **Simple Calculator**
- Four input fields for numbers (decimals and negatives are supported)
- **Add** button: adds the four numbers and shows the result
- **Clear** button: empties all fields, including the result
- **Reset** button: sets all fields, including the result, to `0`
- **Exit** button: closes the application
- Shows an error dialog if any field contains invalid input

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac AddNumbers.java
```

### Run

```bash
java AddNumbers
```

## How to Use

1. Enter a number in each of the four fields.
2. Click **Add** to see the sum in the **Result** field.
3. Click **Clear** to empty all fields, or **Reset** to set them all to `0`.
4. Click **Exit** to close the application.

## Example

| First | Second | Third | Fourth | Result |
|-------|--------|-------|--------|--------|
| 10 | 20 | 30 | 40 | 100.0 |
| 1.5 | 2.5 | -1 | 3 | 6.0 |

If a field is empty or contains text (for example `abc`), a dialog appears with the message:

> Please enter valid numbers in all four fields.

## How It Works

- `AddNumbers` extends `JFrame` and uses absolute positioning (`setLayout(null)` with `setBounds`) to place the components.
- The Add button parses each field with `Double.parseDouble()` and displays the sum.
- A `NumberFormatException` is caught to show the error dialog for invalid input.
- The window is started on the Swing event thread with `EventQueue.invokeLater()`.

## Project Structure

```
.
├── AddNumbers.java
└── README.md
```

## Possible Improvements

- Use a layout manager (such as `GridLayout` or `GroupLayout`) instead of absolute positioning so the window resizes properly
- Add more operations such as subtract, multiply, and divide
- Format the result to a fixed number of decimal places
- Support a variable number of inputs
- Move focus back to the first field after Clear or Reset

