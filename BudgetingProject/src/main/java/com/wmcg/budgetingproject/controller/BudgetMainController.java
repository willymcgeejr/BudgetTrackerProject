package com.wmcg.budgetingproject.controller;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.wmcg.budgetingproject.data.BankDataBean;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.Reader;
import java.nio.file.Files;

public class BudgetMainController {
    //region Untagged FXML Refs
    private Stage stage;
    //endregion

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

    //region Public Functions
    public void setStage(Stage _stage) {
        stage = _stage;
    }
    //endregion

    //region FXML Function Calls
    @FXML
    protected void onImportClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Comma separated values","*.csv"));
        File file = fileChooser.showOpenDialog(stage);

        try(Reader reader = Files.newBufferedReader(file.toPath())) {
            ColumnPositionMappingStrategy mapStrat = new ColumnPositionMappingStrategy<BankDataBean>();
            mapStrat.setType(BankDataBean.class);

            String[] headers = {"accountIdentifier",
                    "transactionDate",
                    "transactionDesc",
                    "withdrawalAmount",
                    "depositAmount"};
            mapStrat.setColumnMapping(headers);

            CsvToBean<BankDataBean> cb = new CsvToBeanBuilder<BankDataBean>(reader)
                    .withMappingStrategy(mapStrat)
                    .build();

            cb.parse().forEach(System.out::println);
        }
        catch(Exception e){
            System.out.println(e);
        }

        //TODO Import data to database
    }

    @FXML
    protected void onGenerateDataClick() {
        //TODO
    }
    //endregion
}