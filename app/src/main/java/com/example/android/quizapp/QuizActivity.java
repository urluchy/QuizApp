package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    public RadioGroup radioGroup;
    public RadioButton Question1Answer;
    public EditText Question2Answer;
    public EditText Question3Answer;
    public CheckBox Question4FirstAnswer;
    public CheckBox Question4SecondAnswer;
    public CheckBox Question4WrongAnswer1;
    public CheckBox Question4WrongAnswer2;
    public RadioButton Question5Answer;
    public EditText Question6Answer;
    public EditText Question7Answer;
    public CheckBox Question8FirstAnswer;
    public CheckBox Question8SecondAnswer;
    public CheckBox Question8WrongAnswer1;
    public CheckBox Question8WrongAnswer2;
    public EditText Question9Answer;
    public EditText Question10Answer;





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
        Question5Answer = findViewById(R.id.question5_answer);
        Question6Answer = findViewById(R.id.question6_answer);
        Question7Answer = findViewById(R.id.question7_answer);
        Question8FirstAnswer = findViewById(R.id.question8_firstanswer);
        Question8WrongAnswer1 = findViewById(R.id.question8_wronganswer1);
        Question8SecondAnswer = findViewById(R.id.question8_secondanswer);
        Question8WrongAnswer2 = findViewById(R.id.question8_wronganswer2);
        Question9Answer = findViewById(R.id.question9_answer);
        Question10Answer = findViewById(R.id.question10_answer);


    }
}
