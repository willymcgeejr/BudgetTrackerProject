module com.wmcg.budgetingproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.wmcg.budgetingproject to javafx.fxml;
    exports com.wmcg.budgetingproject;
    exports com.wmcg.budgetingproject.controller;
    opens com.wmcg.budgetingproject.controller to javafx.fxml;
}