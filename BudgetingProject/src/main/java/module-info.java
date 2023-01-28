module com.wmcg.budgetingproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.wmcg.budgetingproject to javafx.fxml;
    exports com.wmcg.budgetingproject;
}