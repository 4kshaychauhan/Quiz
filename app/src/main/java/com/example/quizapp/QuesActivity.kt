package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView

class QuesActivity : AppCompatActivity() {

    private var mycurrentposition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSlectedoptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ques)

        val progressBar = findViewById<ProgressBar>(R.id.progressbar)
        val tvprogress = findViewById<TextView>(R.id.tvprogress)
        val tvques = findViewById<TextView>(R.id.questiontext)
        val tvoption0ne = findViewById<TextView>(R.id.optionone)
        val tvoptiontwo = findViewById<TextView>(R.id.optiontwo)
        val tvoptionthree = findViewById<TextView>(R.id.optionthree)
        val tvoptionfour = findViewById<TextView>(R.id.optionfour)

        val Getquestion = Constants.getQuestions()

        val currentposition=1
        val question: Question? = Getquestion[currentposition -1]

        progressBar.progress = currentposition

        tvprogress.text = "$currentposition" + "/" + progressBar.max
        tvques.text = question!!.question

        tvoption0ne.text = question.option1
        tvoptiontwo.text = question.option2
        tvoptionthree.text = question.option3
        tvoptionfour.text = question.option4



    }
}


