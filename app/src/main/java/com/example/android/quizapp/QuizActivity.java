package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    public RadioGroup radioGroup;
    final int QuestionOneAnswer = R.id.question1_answer;
    public RadioButton Question1Answer;
    public EditText Question2Answer;
    final String QuestionTwoAnswer = "Alexis Sanchez  ";
    public EditText Question3Answer;
    final String QuestionThreeAnswer = "2011";
    public CheckBox Question4FirstAnswer;
    public CheckBox Question4SecondAnswer;
    public CheckBox Question4WrongAnswer1;
    public CheckBox Question4WrongAnswer2;
    public RadioGroup radioGroup2;
    public RadioButton Question5Answer;
    final int QuestionFiveAnswer = R.id.question5_answer;
    public EditText Question6Answer;
    final String QuestionSixAnswer = "Forward";
    public EditText Question7Answer;
    final String QuestionSevenAnswer = "2018";
    public CheckBox Question8FirstAnswer;
    public CheckBox Question8SecondAnswer;
    public CheckBox Question8WrongAnswer1;
    public CheckBox Question8WrongAnswer2;
    public EditText Question9Answer;
    final String QuestionNineAnswer = "Dancing";
    public EditText Question10Answer;
    final String QuestionTenAnswer = "Red Devils";
    public Button answerButton;
    ArrayList<String> incorrectAnswers = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        radioGroup = findViewById(R.id.radio_group);
        Question1Answer = findViewById(R.id.question1_answer);
        Question2Answer = findViewById(R.id.question2_answer);
        Question3Answer = findViewById(R.id.question3_answer);
        Question4FirstAnswer = findViewById(R.id.question4_firstanswer);
        Question4SecondAnswer = findViewById(R.id.question4_secondanswer);
        Question4WrongAnswer1 = findViewById(R.id.question4_wronganswer1);
        Question4WrongAnswer2 = findViewById(R.id.question4_wronganswer2);
        radioGroup2 = findViewById(R.id.radio_group2);
        Question5Answer = findViewById(R.id.question5_answer);
        Question6Answer = findViewById(R.id.question6_answer);
        Question7Answer = findViewById(R.id.question7_answer);
        Question8FirstAnswer = findViewById(R.id.question8_firstanswer);
        Question8WrongAnswer1 = findViewById(R.id.question8_wronganswer1);
        Question8SecondAnswer = findViewById(R.id.question8_secondanswer);
        Question8WrongAnswer2 = findViewById(R.id.question8_wronganswer2);
        Question9Answer = findViewById(R.id.question9_answer);
        Question10Answer = findViewById(R.id.question10_answer);
        answerButton = findViewById(R.id.answer_btn);

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkQuiz();

                String results = "";

                for (String string : incorrectAnswers){

                    results = results + "\n" + string;

                }

                CharSequence text = "You failed " + results;

                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();


            }
        });


    }


    private boolean checkQuestionOne(){
        if (radioGroup.getCheckedRadioButtonId() == QuestionOneAnswer){
            return true;
        }else {
            return false;
        }
    }

    private boolean checkQuestionTwo(){

        return Question2Answer.getText().toString().equalsIgnoreCase(QuestionTwoAnswer);

    }

    private boolean checkQuestionThree(){
        return Question3Answer.getText().toString().equalsIgnoreCase(QuestionThreeAnswer);

    }

    private boolean checkQuestionFour(){

        if (Question4FirstAnswer.isChecked() &&
                Question4SecondAnswer.isChecked() &&
                !Question4WrongAnswer2.isChecked() &&
                !Question4WrongAnswer2.isChecked()){
            return true;
        }else {
            return false;
        }
    }

    private boolean checkQuestionFive(){
       if (radioGroup2.getCheckedRadioButtonId() == QuestionFiveAnswer){
           return true;
       }else {
           return false;
       }

    }

    private boolean checkQuestionSix(){
        return Question6Answer.getText().toString().equalsIgnoreCase(QuestionSixAnswer);

    }

    private boolean checkQuestionSeven(){
        return Question7Answer.getText().toString().equalsIgnoreCase(QuestionSevenAnswer);

    }

    private boolean checkQuestionEight(){

        if (Question8FirstAnswer.isChecked() &&
                Question8SecondAnswer.isChecked() &&
                !Question8WrongAnswer1.isChecked() &&
                !Question8WrongAnswer2.isChecked()){
            return true;
        }else {
            return false;
        }
    }

    private boolean checkQuestionNine(){
        return Question9Answer.getText().toString().equalsIgnoreCase(QuestionNineAnswer);

    }

    private boolean checkQuestionTen(){
        return Question10Answer.getText().toString().equalsIgnoreCase(QuestionTenAnswer);

    }

    public void checkQuiz(){

        int correctAnswers = 0;

        if (checkQuestionOne()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 1");
        }

        if (checkQuestionTwo()){
            correctAnswers ++;
        }else{
            incorrectAnswers.add("Question 2");
        }

        if (checkQuestionThree()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 3");
        }

        if (checkQuestionFour()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 4");
        }

        if (checkQuestionFive()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 5");
        }

        if (checkQuestionSix()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 6");
        }

        if (checkQuestionSeven()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 7");
        }

        if (checkQuestionEight()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 8");
        }

        if (checkQuestionNine()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 9");
        }

        if (checkQuestionTen()){
            correctAnswers ++;
        }else {
            incorrectAnswers.add("Question 10");

        }



    }









}
