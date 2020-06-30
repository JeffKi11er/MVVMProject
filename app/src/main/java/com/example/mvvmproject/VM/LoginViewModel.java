package com.example.mvvmproject.VM;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.example.mvvmproject.model.LoginModel;
import com.example.mvvmproject.system.SystemCallLogin;

public class LoginViewModel extends ViewModel {
    private LoginModel model;
    private SystemCallLogin loginCallBack;

    public LoginViewModel(LoginModel model, SystemCallLogin loginCallBack) {
        this.model = model;
        this.loginCallBack = loginCallBack;
    }

    public LoginModel getModel() {
        return model;
    }

    public void setModel(LoginModel model) {
        this.model = model;
    }

    public SystemCallLogin getLoginCallBack() {
        return loginCallBack;
    }

    public void setLoginCallBack(SystemCallLogin loginCallBack) {
        this.loginCallBack = loginCallBack;
    }
    public TextWatcher emailTexWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                model.setEmail(s.toString());
            }
        };
    }
    public TextWatcher passTexWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                model.setPasswords(s.toString());
            }
        };
    }
    public void onLogin(View view){
        if(model.isValid()){
            loginCallBack.onSucceed("Successfully login");
        }
        else {
            loginCallBack.onFailure("Failure to login");
        }
    }
}
