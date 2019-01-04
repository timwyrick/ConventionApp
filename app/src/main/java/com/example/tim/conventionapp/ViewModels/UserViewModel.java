package com.example.tim.conventionapp.ViewModels;

import android.arch.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String Email;
    private String HomeAddress1;
    private String HomeAddress2;
    private String HomeCity;
    private String HomeState;
    private String HomeCountry;
    private String HomeZipCode;

    public String GetFirstName()
    {
        return this.FirstName;
    }

    public void SetFirstName(String name)
    {
        this.FirstName = name;
    }

    public String GetLastName()
    {
        return this.LastName;
    }

    public void SetLastName(String name)
    {
        this.LastName = name;
    }

    public String GetPhoneNumber()
    {
        return this.PhoneNumber;
    }

    public void SetPhoneNumber(String phoneNumber)
    {
        this.PhoneNumber = phoneNumber;
    }

    public String GetEmail()
    {
        return this.Email;
    }

    public void SetEmail(String email)
    {
        this.Email = email;
    }

    public String GetHomeAddress1()
    {
        return this.HomeAddress1;
    }

    public void SetHomeAddress1(String address)
    {
        this.HomeAddress1 = address;
    }

    public String GetHomeAddress2()
    {
        return this.HomeAddress2;
    }

    public void SetHomeAddress2(String address)
    {
        this.HomeAddress2 = address;
    }

    public String GetHomeCity()
    {
        return this.HomeCity;
    }

    public void SetHomeCity(String city)
    {
        this.HomeCity = city;
    }

    public String GetHomeState()
    {
        return this.HomeState;
    }

    public void SetHomeState(String state)
    {
        this.HomeState = state;
    }

    public String GetHomeCountry()
    {
        return this.HomeCountry;
    }

    public void SetHomeCountry(String country)
    {
        this.HomeCountry = country;
    }

    public String GetHomeZipCode()
    {
        return this.HomeZipCode;
    }

    public void SetHomeZipCode(String zipCode)
    {
        this.HomeZipCode = zipCode;
    }
}
