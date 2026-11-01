/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz;

/**
 *(Mock questions sourced from websites including:
 * -https://eco-heroes.org/sdg/15/
 * -https://upgrader.gapminder.org/t/sdg-world-15?tab=l
 * This page is only temporary as it will be combined with the content from the pages made by the other members in the group I am working with.
 * Page names may not be completely accurate as this is only a mock-up.
 * 
 * @author Olivia
 */

import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {
        String ans1, ans2, ans3, ans4, ans5, ans6, ans7, alias, teamName;
        alias = null;
        teamName = null;
        double result;
        int option;
        
        result = 0;
        option = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                    Do you wish to complete the quiz as a team or individually?\r
                                                                    1. Team\r
                                                                    2. Individually"""));
        if (option == 1){
            teamName= JOptionPane.showInputDialog(null, "What is your team name");
        }else if(option == 2){
            alias = JOptionPane.showInputDialog(null, "What is your alias?");
        }
        
        System.out.println("""
                           The guidelines for the quiz are:\r
                           1. Read the question carefully.\r
                           2. Pick the answer you think is most suitable.\r
                           3. Enter the answer you choose.\r
                           4. Only enter one answer\r
                           5. Press ok when you have entered the answer of your choice.""");
                
        
        ans1 = JOptionPane.showInputDialog(null, """
                                                 Q1: How many plant and animal species are in danger of extinction because of
                                                 human activities? \r
                                                 A. Up to 1 million \r
                                                 B. up to 10 thousand \r
                                                 C. up to 1 thousand \r
                                                 D. up to 1 hundred """);
        ans2 = JOptionPane.showInputDialog(null, """
                                                 Q2: What is biodiversity? \r
                                                 A. A type of diet \r
                                                 B. The variety of all living things and ecosysystems on Earth \r
                                                 C. A rainforest only \r
                                                 D. An organic farming method""");
        ans3 = JOptionPane.showInputDialog(null, """
                                                 Q3: What is deforestation? \r
                                                 A. Planting more trees \r
                                                 B. A forest festival \r
                                                 C. Large-scale clearing of forests without adequate replanting \r
                                                 D. Cleaning up parks""");
        ans4 = JOptionPane.showInputDialog(null, """
                                                 Q4: What group of animals has the highest share of threatened species? \r
                                                 A. Amphibians \r
                                                 B. Mammals \r
                                                 C. Reptiles \r
                                                 D. Birds""");
        ans5 = JOptionPane.showInputDialog(null, """
                                                 Q5: What happened to the global forest area in the last 30 years? \r
                                                 A. Decreased around 90% \r
                                                 B. Decreased around 50% \r
                                                 C. Decreased around 30% \r
                                                 D. Decreased around 10% """);
        ans6 = JOptionPane.showInputDialog(null, """
                                                 Q6: Biologists have evaluated the status of more than 160,000 species of plants and animals. How many are endangered or threatened?\r
                                                 A. Around 5% \r
                                                 B. around 20% \r
                                                 C. Around 30% \r
                                                 D. Around 60% """);
        ans7 = JOptionPane.showInputDialog(null, """
                                                 Q7: Of all the area that was tropical rainforest 100 years ago worldwide, how much is still tropical rainforest today? \r
                                                 A. Less than 10% \r
                                                 B. More than 30% \r
                                                 C. Around 20% \r
                                                 D. Over 60%""");
        
        if (option == 1){
            System.out.println(teamName + ", your results are " + result + "/7" +", well done.");
            System.out.println("Your answers were "+ ans1+", "+ans2+", "+ans3+", "+ans4+", "+ans5+", "+ans6+", "+ans7+".");
        } else if(option == 2){
            System.out.println(alias + ", your results are " + result + "/7" +", well done.");
            System.out.println("Your answers were "+ ans1+", "+ans2+", "+ans3+", "+ans4+", "+ans5+", "+ans6+", "+ans7+".");
        } 
    }
}
