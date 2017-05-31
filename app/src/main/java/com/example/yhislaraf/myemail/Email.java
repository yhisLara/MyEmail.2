package com.example.yhislaraf.myemail;
import com.example.yhislaraf.myemail.Utils;

/**
 * Created by yhislaraf on 23-05-17.
 */

public class Email{

    private String subject;
    private String message;
    private String senderName;
    private String color;


    public Email(String subject, String message, String senderName){
        this.subject = subject;
        this.message = message;
        this.senderName = senderName;
        this.color = Utils.getRandomColor();
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getSenderName(){
        return senderName;
    }

    public void setSenderName(String senderName){
        this.senderName = senderName;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }
}