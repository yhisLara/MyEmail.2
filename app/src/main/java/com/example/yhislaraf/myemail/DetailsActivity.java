package com.example.yhislaraf.myemail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yhislaraf.myemail.DetailsFragment;
import com.example.yhislaraf.myemail.Email;
import com.example.yhislaraf.myemail.R;

public class DetailsActivity extends AppCompatActivity {


    private String subject;
    private String message;
    private String sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        if (getIntent().getExtras() != null) {
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("senderName");
        }

        Email mail = new Email(subject, message, sender);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);

    }
}

