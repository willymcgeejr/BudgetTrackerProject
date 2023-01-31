module com.wmcg.budgetingproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.opencsv;

    requires java.sql;

    requires org.postgresql.jdbc;

    opens com.wmcg.budgetingproject to javafx.fxml;
    exports com.wmcg.budgetingproject;
    exports com.wmcg.budgetingproject.controller;
    exports com.wmcg.budgetingproject.data to com.opencsv;
    opens com.wmcg.budgetingproject.controller to javafx.fxml;
}