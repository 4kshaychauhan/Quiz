package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionlist = ArrayList<Question>()

        val ques1 = Question( 1,
            "what is the capital of India",
            "lucknow",
            "new Dehli",
            "kolkata",
            "mumbai",
            2)

        questionlist.add(ques1)

        val ques2 = Question( 2,
            "what is the capital of India",
            "lucknow",
            "new Dehli",
            "kolkata",
            "mumbai",
            2)

        questionlist.add(ques2)

        val ques3 = Question( 3,
            "what is the capital of India",
            "lucknow",
            "new Dehli",
            "kolkata",
            "mumbai",
            2)

        questionlist.add(ques3)

        val ques4 = Question( 4,
            "what is the capital of India",
            "lucknow",
            "new Dehli",
            "kolkata",
            "mumbai",
            2)

        questionlist.add(ques4)

        val ques5 = Question( 5,
            "what is the capital of India",
            "lucknow",
            "new Dehli",
            "kolkata",
            "mumbai",
            2)

        questionlist.add(ques5)


        return questionlist
    }
}