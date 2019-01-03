package com.example.tim.conventionapp.ViewModels;

import android.arch.lifecycle.ViewModel;

public class ConventionViewModel extends ViewModel {
    private String AppName;
    private String AppLogoFilePath;
    private boolean HasNotifications;
    private int NumNotifications;

    public String GetName()
    {
        return this.AppName;
    }

    public void SetName(String name)
    {
        this.AppName = name;
    }

    public String GetLogoFilePath()
    {
        return this.AppLogoFilePath;
    }

    public void SetLogoFilePath(String filePath)
    {
        this.AppLogoFilePath = filePath;
    }

    public void SetHasNotifications(boolean value) {
        this.HasNotifications = value;
    }

    public boolean GetHasNotifications() {
        return this.HasNotifications;
    }

    public void SetNumNotifications(int num){
        this.NumNotifications = num;
    }

    public void IncrementNotifications() {
        this.NumNotifications++;
    }

    public void DecrementNotifications()
    {
        this.NumNotifications--;
    }

    public int GetNumNotifications()
    {
       return this.NumNotifications;
    }
}
