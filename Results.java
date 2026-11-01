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
    public double result;
    
    public Results(double result, int option, String teamName, String alias, String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7) {
        super(ans1, ans2, ans3, ans4, ans5, ans6, ans7);
        this.result = result;
    }

    public double getResult() {
        return result;
    }
    
    public double computeresult(){
        if ("A".equals(ans1)){
            result =  1;
        } else{
            result = result + 0;
        }
        
        if ("B".equals(ans2)){
            result++;
        } else{
            result = result + 0;
        }
        
        if ("C".equals(ans3)){
            result++;
        } else{
            result = result + 0;
        }
        
        if ("A".equals(ans4)){
            result++;
        } else{
            result = result + 0;
        }
        
        if ("D".equals(ans5)){
            result++;
        } else{
            result = result + 0;
        }
        
        if ("C".equals(ans6)){
            result++;
        } else{
            result = result +0;
        }
        
        if ("B".equals(ans7)){
            result++;
        } else{
            result = result + 0;
        }
       
        return result;
    }
    
    public void setResult(double result) {
        this.result = result;
    }
      
}
