package com.example.firstapp.ui.fotbal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FotbalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FotbalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bine ati venit in sectiunea fotbal!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}