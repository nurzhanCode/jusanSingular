package hw.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextArea questionArea;

    @FXML
    private RadioButton answer1, answer2, answer3, answer4;

    @FXML
    private ToggleGroup answers;

    private int currentQuestionIndex = 0;

    private String[] questions = {
            "Ваш любимый фрукт?",
            "Ваш любимый цвет?",
            "Ваш любимый сезон?"
    };

    private String[][] variants = {
            {"Банан", "Киви", "Апельсин", "Мандарин"},
            {"Красный", "Синий", "Зелёный", "Жёлтый"},
            {"Весна", "Лето", "Осень", "Зима"}
    };

    private String[] correctVariants = {
            "Апельсин",
            "Синий",
            "Лето"
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadQuestion();
    }

    private void loadQuestion() {
        questionArea.setText(questions[currentQuestionIndex]);
        answer1.setText(variants[currentQuestionIndex][0]);
        answer2.setText(variants[currentQuestionIndex][1]);
        answer3.setText(variants[currentQuestionIndex][2]);
        answer4.setText(variants[currentQuestionIndex][3]);
        answers.selectToggle(null); // Deselect any selected answer
    }

    @FXML
    public void tryToAnswer() {
        if (answers.getSelectedToggle() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Пожалуйста, выберите ответ!");
            alert.showAndWait();
            return;
        }

        RadioButton selectedRadioButton = (RadioButton) answers.getSelectedToggle();
        String selectedAnswer = selectedRadioButton.getText();

        if (selectedAnswer.equals(correctVariants[currentQuestionIndex])) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Правильно!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Не правильно!");
            alert.showAndWait();
        }
    }

    @FXML
    public void nextQuestion() {
        currentQuestionIndex++;
        if (currentQuestionIndex >= questions.length) {
            currentQuestionIndex = 0; // Reset to first question or end the quiz
        }
        loadQuestion();
    }
}