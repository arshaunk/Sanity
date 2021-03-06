package sanity;

public class Constants {
	public static final String SQL_INSERT_USER = "INSERT INTO TotalUsers(FirstName, Lastname, Password, Email) VALUES ";
	public static final String SQL_INSERT_BIGBUDGET = "INSERT INTO BigBudgets(userID, BigBudgetName, BarGraphColor, Latitude, Longitude, BigBudgetAmount, TotalAmountSpent, Frequency, Date, BigBudgetDaysLeft, PeriodNotification, PeriodNotificationChecked, LimitNotification) VALUES ";
	public static final String SQL_INSERT_BUDGET = "INSERT INTO Budgets(bigBudgetID, BudgetAmount, BudgetName, TotalAmountSpent) VALUES ";
	public static final String SQL_EDIT_BIGBUDGET = "UPDATE BigBudgets SET ";
	public static final String SQL_INSERT_TRANSACTION = "INSERT INTO Transactions(budgetID, Amount, Details, Latitude, Longitude, DateValue, Automatic) VALUES ";
	public static final String SQL_DELETE_USERS = "DELETE FROM TotalUsers;";
	public static final String SQL_DELETE_BIGBUDGETS = "DELETE FROM BigBudgets;";
	public static final String SQL_DELETE_BUDGETS = "DELETE FROM Budgets;";
	public static final String SQL_DELETE_TRANSACTIONS = "DELETE FROM Transactions;";
	public static final String SQL_ALTER_USERS = "ALTER TABLE TotalUsers AUTO_INCREMENT=1;";
	public static final String SQL_ALTER_BIGBUDGETS = "ALTER TABLE BigBudgets AUTO_INCREMENT=1;";
	public static final String SQL_ALTER_BUDGETS = "ALTER TABLE Budgets AUTO_INCREMENT=1;";
	public static final String SQL_ALTER_TRANSACTIONS = "ALTER TABLE Transactions AUTO_INCREMENT=1;";
	public static final String SQL_INSERT_HISTORY = "INSERT INTO History(budgetID, CategoryAmount, TotalAmountSpent, HistoryNum, StartDate) VALUES (";
	
	
	
}
