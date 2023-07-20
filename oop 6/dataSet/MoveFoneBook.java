package dataSet;

import data.FoneBook;
import data.User;
import java.util.List;

public interface MoveFoneBook {
    void impFOneBook(List<User> foneBook);
    void expFoneBook(FoneBook foneBook);
}
