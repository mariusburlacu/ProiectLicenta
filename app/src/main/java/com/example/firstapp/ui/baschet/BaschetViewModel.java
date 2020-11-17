package com.example.firstapp.ui.baschet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BaschetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BaschetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bine ati venit in sectiunea baschet!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}