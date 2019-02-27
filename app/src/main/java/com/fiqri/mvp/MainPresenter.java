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

    void calculate(EditText edtA, EditText edtB) {

        String inputanA = edtA.getText().toString().trim();
        String inputanB = edtB.getText().toString().trim();

        if (inputanA.isEmpty() || inputanB.isEmpty()) {
            mainView.Error();

        } else {
            double valueA = Double.parseDouble(inputanA);
            double valueB = Double.parseDouble(inputanB);
            double result = valueA * valueB;
            String tampung = String.valueOf(result);
            mainView.Success(tampung);
        }
    }

    @Override
    public void onDetach() {
        mainView = null;
    }
}
