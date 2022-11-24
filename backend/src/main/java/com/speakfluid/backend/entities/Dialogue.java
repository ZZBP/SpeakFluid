package com.speakfluid.backend.entities;
import java.util.ArrayList;

/**
 * A dialogue is defined as back-forth messages/interactions between the chatBot
 * grouped under the same session ID in the raw transcript.
 * A Dialogue object stores chatbot's message and the user's message in the dialogue;
 * It also stores a list of suggested talk step and the corresponding confidence scores
 * which will be set in the TranscriptAnalysisInteractor(the use case interactor).
 *
 * We will return the step with the highest confidence score. However, if the top confidence score is low,
 * the top three layers will be returned with a notice saying
 * the confidence scores are low but here are our suggestions.
 *
 * @author  Zoey Zhang
 * @version 3.0
 * @since   2022-11-17
 */

/* Entity layer */
public class Dialogue<T> {

    // Store the dialogue between the chatBot and the user
    private ArrayList<T> chatBotMessage;
    private ArrayList<T> userMessage;
    private String stepSuggestion;
    private double confidenceScore;


    public Dialogue(ArrayList<T> chatBotM, ArrayList<T> userM){
        this.chatBotMessage = chatBotM;
        this.userMessage = userM;
    }
    public ArrayList<T> getChatBotMessage(){
        return this.chatBotMessage;
    }
    public ArrayList<T> getUserMessage(){
        return this.userMessage;
    }
    public void setConfidenceScore(double confidenceScore) {
        this.confidenceScore.add(confidenceScore);
    }

    public void setStepSuggestion(String talkStep) {
        this.stepSuggestion.add(talkStep);
    }

    public ArrayList<String> getStepSuggestion() {
        return this.stepSuggestion;
    }

    public ArrayList<Double> getConfidenceScore(){
        return this.confidenceScore;
    }

}