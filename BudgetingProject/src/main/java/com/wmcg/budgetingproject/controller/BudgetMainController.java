package com.wmcg.budgetingproject.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class BudgetMainController {
    //region Window Refs
    @FXML
    private Label bottomLeftWindowLabel;
    @FXML
    private Label bottomRightWindowLabel;
    //endregion

    //region Toolbar Refs
    @FXML
    private MenuItem importMenuItem;
    @FXML
    private MenuItem quitMenuItem;
    //endregion

    //region Spending Visualizer Refs
    @FXML
    private PieChart spendingPieChart;
    //endregion

    //region Data Table Refs
    @FXML
    private TableView dataTableView;
    @FXML
    private TableColumn dateTableColumn;
    @FXML
    private TableColumn transactionTableColumn;
    @FXML
    private TableColumn amountTableColumn;
    @FXML
    private TableColumn categoryTableColumn;
    //endregion

    //region Parameters
    @FXML
    private VBox categoryVBox;
    //endregion

    @FXML
    protected void onImportClick() {
        //TODO
    }

    @FXML
    protected void onGenerateDataClick() {
        //TODO
    }
}