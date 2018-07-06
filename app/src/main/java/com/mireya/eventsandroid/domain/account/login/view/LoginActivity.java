package com.mireya.eventsandroid.domain.account.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.account.create.view.CreateAccount;
import com.mireya.eventsandroid.domain.account.login.presenter.LoginPresenter;
import com.mireya.eventsandroid.domain.account.login.presenter.LoginPresenterImpl;
import com.mireya.eventsandroid.domain.main.view.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginView{
    private LoginPresenter presenter;
    private Button btnCreateAccount, btnGetIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupVariable();
        setUpView();
    }

    private void setupVariable() {
        if (presenter == null){
            presenter = new LoginPresenterImpl(this);
        }
    }

    private void setUpView() {
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnGetIn = findViewById(R.id.btnGetIn);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccount();
            }
        });
        btnGetIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMenu();
            }
        });

    }

    @Override
    public void createAccount() {
        Intent intent = new Intent(this, CreateAccount.class);
        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        startActivity(intent);
    }

    @Override
    public void goMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        startActivity(intent);
    }
}
