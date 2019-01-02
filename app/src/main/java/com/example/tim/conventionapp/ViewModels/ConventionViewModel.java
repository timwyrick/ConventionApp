package com.example.tim.conventionapp.ViewModels;

import android.arch.lifecycle.ViewModel;

public class ConventionViewModel extends ViewModel {
    private String AppName;
    private String AppLogoFilePath;

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
}
