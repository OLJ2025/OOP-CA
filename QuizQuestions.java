/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author Olivia
 */
public abstract class QuizQuestions {
    public String ans1;
    public String ans2;
    public String ans3;
    public String ans4;
    public String ans5;
    public String ans6;
    public String ans7;

    public QuizQuestions(String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7) {
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.ans5 = ans5;
        this.ans6 = ans6;
        this.ans7 = ans7;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getAns5() {
        return ans5;
    }

    public void setAns5(String ans5) {
        this.ans5 = ans5;
    }

    public String getAns6() {
        return ans6;
    }

    public void setAns6(String ans6) {
        this.ans6 = ans6;
    }

    public String getAns7() {
        return ans7;
    }

    public void setAns7(String ans7) {
        this.ans7 = ans7;
    }  
}
