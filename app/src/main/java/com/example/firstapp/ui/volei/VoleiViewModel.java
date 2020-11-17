package com.example.firstapp.ui.volei;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VoleiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VoleiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bine ati venit in sectiunea volei!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}