package com.example.mvvmproject.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmproject.VM.LoginViewModel;
import com.example.mvvmproject.system.SystemCallLogin;

public class ViewModelBinding extends ViewModelProvider.NewInstanceFactory {
    private SystemCallLogin systemCallLogin ;

    public ViewModelBinding(SystemCallLogin systemCallLogin) {
        this.systemCallLogin = systemCallLogin;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(systemCallLogin);
    }
}
