package pl.kamilsieczkowski.constants;

public class Constants {
    public static final String SERVER_URL = "jdbc:mysql://db4free.net:3306/library_users?serverTimezone=UTC";
    public static final String SERVER_USER = "judog90";
    public static final String SERVER_PASSWORD = "Mysql9090";
    public static final String COLUMN_ID_BOOK = "id_books";
    public static final String COLUMN_AUTHOR = "author";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_KEY_WORDS = "key_words";
    public static final String COLUMN_TOME = "tome";
    public static final String COLUMN_EDITION = "edition";
    public static final String COLUMN_LOCALIZATION = "localization";
    public static final String QUERY_ALL_BOOKS = "SELECT * FROM library_users.books;";
    public static final String QUERY_USER = "SELECT * FROM library_users.users WHERE username='";
    public static final String QUERY_INSERT = "INSERT INTO library_users.books VALUES (";
    public static final String SOURCE_ADD_NEW_BOOK_WINDOW = "/addNewBook.fxml";
    public static final String SOURCE_LIBRARY_WINDOW = "/loginPopup.fxml";
}
