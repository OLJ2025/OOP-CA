/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author Olivia
 */


public abstract class Results extends QuizQuestions implements Teams {
    public int result;

    public Results(int result, String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7) {
        super(ans1, ans2, ans3, ans4, ans5, ans6, ans7);
        this.result = result;
    }
    
    public void setResult(int result) {
        this.result = result;
    }
    
    public int getResult() {
        return result;
    }
    
}
    
