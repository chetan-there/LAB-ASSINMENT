package com.ct.EH_Day7.BankApplication;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ATMGUI {
    public static void main(String[] args) {
        // Create some sample accounts
        BankAccount account1 = new BankAccount(1001, 10000);
        BankAccount account2 = new BankAccount(1002, 50000);

        Customer customer1 = new Customer("John Doe", account1);
        Customer customer2 = new Customer("Jane Smith", account2);

        Scanner scanner = new Scanner(System.in);

        // Using try-with-resources to ensure scanner is closed properly
        try (scanner) {
            boolean exit = false;
            
            // Display welcome screen
            printHeader("WELCOME TO JAVA BANK ATM");
            System.out.println("  Logged in as: " + customer1.getName());
            printSeparator();

            while (!exit) {
                printMenuHeader("MAIN MENU");
                System.out.println("╔══════════════════════════════╗");
                System.out.println("║ 1. Deposit                   ║");
                System.out.println("║ 2. Withdraw                  ║");
                System.out.println("║ 3. Transfer                  ║");
                System.out.println("║ 4. Loan Application          ║");
                System.out.println("║ 5. Check Balance             ║");
                System.out.println("║ 6. Exit                      ║");
                System.out.println("╚══════════════════════════════╝");
                printSeparator();
                System.out.print("  Enter your option (1-6): ");

                try {
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1: // Deposit
                            printHeader("DEPOSIT");
                            handleDeposit(customer1.getAccount(), scanner);
                            break;
                        case 2: // Withdraw
                            printHeader("WITHDRAWAL");
                            handleWithdrawal(customer1.getAccount(), scanner);
                            break;
                        case 3: // Transfer
                            printHeader("TRANSFER");
                            System.out.println("  Transferring to: " + customer2.getName());
                            handleTransfer(customer1.getAccount(), customer2.getAccount(), scanner);
                            break;
                        case 4: // Loan Application
                            printHeader("LOAN APPLICATION");
                            handleLoanApplication(customer1.getAccount(), scanner);
                            break;
                        case 5: // Check Balance
                            printHeader("ACCOUNT BALANCE");
                            System.out.println("  Current balance: ₹" + String.format("%,.2f", customer1.getAccount().getBalance()));
                            printSeparator();
                            break;
                        case 6: // Exit
                            exit = true;
                            printHeader("THANK YOU");
                            System.out.println("  Thank you for using our banking services!");
                            System.out.println("  Have a nice day!");
                            printFooter();
                            break;
                        default:
                            System.out.println("\n  ❗ Invalid option. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\n  ❗ Invalid input. Please enter a number (1-6).");
                    scanner.nextLine(); // Clear the invalid input
                } catch (Exception e) {
                    System.out.println("\n  ❗ Error: " + e.getMessage());
                }
            }
        }
    }

    private static void handleDeposit(BankAccount account, Scanner scanner) {
        System.out.print("  Enter deposit amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("\n  ✔ Deposit successful!");
            System.out.println("  New balance: ₹" + String.format("%,.2f", account.getBalance()));
            printSeparator();
        } catch (InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleWithdrawal(BankAccount account, Scanner scanner) {
        System.out.print("  Enter withdrawal amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            System.out.println("\n  ✔ Withdrawal successful!");
            System.out.println("  Remaining balance: ₹" + String.format("%,.2f", account.getBalance()));
            printSeparator();
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleTransfer(BankAccount fromAccount, BankAccount toAccount, Scanner scanner) {
        System.out.print("  Enter transfer amount: ₹");
        try {
            double amount = scanner.nextDouble();
            fromAccount.transfer(toAccount, amount);
            System.out.println("\n  ✔ Transfer successful!");
            System.out.println("  Your new balance: ₹" + String.format("%,.2f", fromAccount.getBalance()));
            printSeparator();
        } catch (InsufficientFundsException | AccountNotFoundException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void handleLoanApplication(BankAccount account, Scanner scanner) {
        System.out.print("  Enter loan amount: ₹");
        try {
            double amount = scanner.nextDouble();
            account.applyForLoan(amount);
            System.out.println("\n  ✔ Loan application submitted successfully!");
            System.out.println("  We will process your request shortly.");
            printSeparator();
        } catch (LoanNotAllowedException | InvalidAmountException e) {
            System.out.println("\n  ❗ Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\n  ❗ Invalid amount. Please enter a number.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    // UI Helper Methods
    private static void printHeader(String title) {
        System.out.println();
        System.out.println("  ╔══════════════════════════════╗");
        System.out.println("  ║" + centerText(title, 22) + "        ║");
        System.out.println("  ╚══════════════════════════════╝");
    }
    
    private static void printMenuHeader(String title) {
        System.out.println();
        System.out.println("  ☆☆☆☆☆ " + title + " ☆☆☆☆☆");
    }
    
    private static void printSeparator() {
        System.out.println("  ──────────────────────────────");
    }
    
    private static void printFooter() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════╗");
        System.out.println("  ║    JAVA BANK - SECURE ATM    ║");
        System.out.println("  ║   © 2023 All Rights Reserved ║");
        System.out.println("  ╚══════════════════════════════╝");
        System.out.println();
    }
    
    private static String centerText(String text, int length) {
        if (text.length() >= length) {
            return text.substring(0, length);
        }
        int before = (length - text.length()) / 2;
        int after = length - text.length() - before;
        return String.format("%" + before + "s%s%" + after + "s", "", text, "");
    }
}




// GUI INTERFACE 


// package com.ct.EH_Day7.BankApplication;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.text.NumberFormat;

// public class ATMGUI {
//     private BankAccount account1 = new BankAccount(1001, 10000);
//     private BankAccount account2 = new BankAccount(1002, 50000);
//     private Customer customer1 = new Customer("John Doe", account1);
//     private Customer customer2 = new Customer("Jane Smith", account2);

//     private JFrame frame;
//     private JPanel mainPanel;
//     private CardLayout cardLayout;
//     private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             try {
//                 new ATMGUI().createAndShowGUI();
//             } catch (Exception e) {
//                 JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//             }
//         });
//     }

//     private void createAndShowGUI() {
//         frame = new JFrame("Java Bank ATM");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(500, 400);
//         frame.setLocationRelativeTo(null);

//         cardLayout = new CardLayout();
//         mainPanel = new JPanel(cardLayout);

//         createWelcomePanel();
//         createMainMenuPanel();
//         createDepositPanel();
//         createWithdrawPanel();
//         createTransferPanel();
//         createLoanPanel();
//         createBalancePanel();

//         frame.add(mainPanel);
//         frame.setVisible(true);
//     }

//     private void createWelcomePanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("WELCOME TO JAVA BANK ATM", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

//         JLabel userLabel = new JLabel("Logged in as: " + customer1.getName(), SwingConstants.CENTER);
//         userLabel.setFont(new Font("Arial", Font.PLAIN, 16));

//         JButton continueButton = new JButton("Continue to Main Menu");
//         continueButton.addActionListener(e -> cardLayout.show(mainPanel, "MainMenu"));

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.add(continueButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(userLabel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Welcome");
//     }

//     private void createMainMenuPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("MAIN MENU", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JPanel buttonPanel = new JPanel(new GridLayout(6, 1, 10, 10));
//         buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

//         String[] buttonLabels = {
//             "1. Deposit", 
//             "2. Withdraw", 
//             "3. Transfer", 
//             "4. Loan Application", 
//             "5. Check Balance", 
//             "6. Exit"
//         };

//         for (int i = 0; i < buttonLabels.length; i++) {
//             JButton button = new JButton(buttonLabels[i]);
//             final int option = i + 1;
//             button.addActionListener(e -> handleMainMenuOption(option));
//             buttonPanel.add(button);
//         }

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(buttonPanel, BorderLayout.CENTER);

//         mainPanel.add(panel, "MainMenu");
//     }

//     private void handleMainMenuOption(int option) {
//         switch (option) {
//             case 1:
//                 cardLayout.show(mainPanel, "Deposit");
//                 break;
//             case 2:
//                 cardLayout.show(mainPanel, "Withdraw");
//                 break;
//             case 3:
//                 cardLayout.show(mainPanel, "Transfer");
//                 break;
//             case 4:
//                 cardLayout.show(mainPanel, "Loan");
//                 break;
//             case 5:
//                 updateBalancePanel();
//                 cardLayout.show(mainPanel, "Balance");
//                 break;
//             case 6:
//                 showExitDialog();
//                 break;
//         }
//     }

//     private void createDepositPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("DEPOSIT", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
//         inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

//         JLabel amountLabel = new JLabel("Enter deposit amount:");
//         JTextField amountField = new JTextField();

//         inputPanel.add(amountLabel);
//         inputPanel.add(amountField);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//         JButton depositButton = new JButton("Deposit");
//         JButton backButton = new JButton("Back to Main Menu");

//         depositButton.addActionListener(e -> {
//             try {
//                 double amount = Double.parseDouble(amountField.getText());
//                 customer1.getAccount().deposit(amount);
//                 JOptionPane.showMessageDialog(frame, 
//                     "Deposit successful!\nNew balance: " + 
//                     currencyFormat.format(customer1.getAccount().getBalance()),
//                     "Success", JOptionPane.INFORMATION_MESSAGE);
//                 amountField.setText("");
//             } catch (InvalidAmountException ex) {
//                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//             } catch (NumberFormatException ex) {
//                 JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
//             }
//         });

//         backButton.addActionListener(e -> {
//             amountField.setText("");
//             cardLayout.show(mainPanel, "MainMenu");
//         });

//         buttonPanel.add(depositButton);
//         buttonPanel.add(backButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(inputPanel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Deposit");
//     }

//     private void createWithdrawPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("WITHDRAWAL", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
//         inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

//         JLabel amountLabel = new JLabel("Enter withdrawal amount:");
//         JTextField amountField = new JTextField();

//         inputPanel.add(amountLabel);
//         inputPanel.add(amountField);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//         JButton withdrawButton = new JButton("Withdraw");
//         JButton backButton = new JButton("Back to Main Menu");

//         withdrawButton.addActionListener(e -> {
//             try {
//                 double amount = Double.parseDouble(amountField.getText());
//                 customer1.getAccount().withdraw(amount);
//                 JOptionPane.showMessageDialog(frame, 
//                     "Withdrawal successful!\nRemaining balance: " + 
//                     currencyFormat.format(customer1.getAccount().getBalance()),
//                     "Success", JOptionPane.INFORMATION_MESSAGE);
//                 amountField.setText("");
//             } catch (InsufficientFundsException | InvalidAmountException ex) {
//                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//             } catch (NumberFormatException ex) {
//                 JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
//             }
//         });

//         backButton.addActionListener(e -> {
//             amountField.setText("");
//             cardLayout.show(mainPanel, "MainMenu");
//         });

//         buttonPanel.add(withdrawButton);
//         buttonPanel.add(backButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(inputPanel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Withdraw");
//     }

//     private void createTransferPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("TRANSFER", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JPanel infoPanel = new JPanel(new GridLayout(1, 1));
//         infoPanel.add(new JLabel("Transferring to: " + customer2.getName(), SwingConstants.CENTER));

//         JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
//         inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

//         JLabel amountLabel = new JLabel("Enter transfer amount:");
//         JTextField amountField = new JTextField();

//         inputPanel.add(amountLabel);
//         inputPanel.add(amountField);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//         JButton transferButton = new JButton("Transfer");
//         JButton backButton = new JButton("Back to Main Menu");

//         transferButton.addActionListener(e -> {
//             try {
//                 double amount = Double.parseDouble(amountField.getText());
//                 customer1.getAccount().transfer(customer2.getAccount(), amount);
//                 JOptionPane.showMessageDialog(frame, 
//                     "Transfer successful!\nYour new balance: " + 
//                     currencyFormat.format(customer1.getAccount().getBalance()),
//                     "Success", JOptionPane.INFORMATION_MESSAGE);
//                 amountField.setText("");
//             } catch (InsufficientFundsException | AccountNotFoundException | InvalidAmountException ex) {
//                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//             } catch (NumberFormatException ex) {
//                 JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
//             }
//         });

//         backButton.addActionListener(e -> {
//             amountField.setText("");
//             cardLayout.show(mainPanel, "MainMenu");
//         });

//         buttonPanel.add(transferButton);
//         buttonPanel.add(backButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(infoPanel, BorderLayout.CENTER);
//         panel.add(inputPanel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Transfer");
//     }

//     private void createLoanPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("LOAN APPLICATION", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
//         inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

//         JLabel amountLabel = new JLabel("Enter loan amount:");
//         JTextField amountField = new JTextField();

//         inputPanel.add(amountLabel);
//         inputPanel.add(amountField);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//         JButton loanButton = new JButton("Apply for Loan");
//         JButton backButton = new JButton("Back to Main Menu");

//         loanButton.addActionListener(e -> {
//             try {
//                 double amount = Double.parseDouble(amountField.getText());
//                 customer1.getAccount().applyForLoan(amount);
//                 JOptionPane.showMessageDialog(frame, 
//                     "Loan application submitted successfully!\nWe will process your request shortly.",
//                     "Success", JOptionPane.INFORMATION_MESSAGE);
//                 amountField.setText("");
//             } catch (LoanNotAllowedException | InvalidAmountException ex) {
//                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//             } catch (NumberFormatException ex) {
//                 JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);
//             }
//         });

//         backButton.addActionListener(e -> {
//             amountField.setText("");
//             cardLayout.show(mainPanel, "MainMenu");
//         });

//         buttonPanel.add(loanButton);
//         buttonPanel.add(backButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(inputPanel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Loan");
//     }

//     private void createBalancePanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         JLabel titleLabel = new JLabel("ACCOUNT BALANCE", SwingConstants.CENTER);
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

//         JLabel balanceLabel = new JLabel("", SwingConstants.CENTER);
//         balanceLabel.setFont(new Font("Arial", Font.PLAIN, 18));
//         balanceLabel.setName("balanceLabel");

//         JButton backButton = new JButton("Back to Main Menu");
//         backButton.addActionListener(e -> cardLayout.show(mainPanel, "MainMenu"));

//         JPanel buttonPanel = new JPanel();
//         buttonPanel.add(backButton);

//         panel.add(titleLabel, BorderLayout.NORTH);
//         panel.add(balanceLabel, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);

//         mainPanel.add(panel, "Balance");
//     }

//     private void updateBalancePanel() {
//         JPanel balancePanel = (JPanel) mainPanel.getComponent(6); // Balance panel is the 7th component
//         Component[] components = balancePanel.getComponents();
//         for (Component c : components) {
//             if (c instanceof JLabel && "balanceLabel".equals(c.getName())) {
//                 ((JLabel) c).setText("Current balance: " + 
//                     currencyFormat.format(customer1.getAccount().getBalance()));
//                 break;
//             }
//         }
//     }

//     private void showExitDialog() {
//         int choice = JOptionPane.showConfirmDialog(frame, 
//             "Thank you for using our banking services!\nHave a nice day!", 
//             "THANK YOU", 
//             JOptionPane.DEFAULT_OPTION, 
//             JOptionPane.INFORMATION_MESSAGE);
        
//         if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CLOSED_OPTION) {
//             frame.dispose();
//         }
//     }
// }