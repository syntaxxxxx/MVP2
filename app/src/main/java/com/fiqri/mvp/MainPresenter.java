package com.fiqri.mvp;

import android.widget.EditText;

import com.fiqri.mvp.base.BasePresenter;

/**
 * Created by fiqri on 22/01/18.
 */

public class MainPresenter implements BasePresenter<MainView> {

    MainView mainView;

    @Override
    public void onAttach(MainView view) {
        mainView = view;
    }

    public double calculate(double inputanA, double inputanB) {
        return inputanA * inputanB;
    }

    void calculateResult(double inputanA, double inputanB) {
        double total = calculate(inputanA, inputanB);
        String tampung = String.valueOf(total);
        mainView.Success(tampung);
    }

    @Override
    public void onDetach() {
        mainView = null;
    }
}
