package com.example.tim.conventionapp.ViewModels;

import android.arch.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private String Email;
    private String Password;

    public String GetEmail()
    {
        return this.Email;
    }

    public void SetEmail(String email)
    {
        this.Email = email;
    }

    public String GetPassword()
    {
        return this.Password;
    }

    public void SetPassword(String password)
    {
        this.Password = password;
    }
}
