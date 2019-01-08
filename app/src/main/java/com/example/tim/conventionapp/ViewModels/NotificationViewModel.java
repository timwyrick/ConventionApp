package com.example.tim.conventionapp.ViewModels;

import android.arch.lifecycle.ViewModel;

public class NotificationViewModel extends ViewModel {
    private String Title;
    private String Message;

    public String GetTitle()
    {
        return this.Title;
    }

    public void SetTitle(String title)
    {
        this.Title = title;
    }
    
    public String GetMessage()
    {
        return this.Message;
    }

    public void SetMessage(String message)
    {
        this.Message = message;
    }
}
