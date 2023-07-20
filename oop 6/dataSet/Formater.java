package dataSet;

import data.FoneBook;
import data.User;
import java.util.List;

public interface Formater {
    FoneBook formatPdf(FoneBook foneBook);
    FoneBook formatJson(FoneBook foneBook);
}