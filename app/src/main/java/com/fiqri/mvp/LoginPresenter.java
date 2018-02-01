package com.fiqri.mvp;

import android.widget.EditText;

import com.fiqri.mvp.base.BasePresenter;

/**
 * Created by fiqri on 22/01/18.
 */

public class LoginPresenter implements BasePresenter <ViewLogin> {

    ViewLogin model;


    @Override
    public void onAttach(ViewLogin view) {
        model = view;
    }

    public void login (EditText email, EditText password){

        String getEmail = email.getText().toString();
        String getPassword = password.getText().toString();

        if (getEmail.isEmpty() || getPassword.isEmpty()){
            model.Error();
        }
        else if (getEmail.equals("Test") && getPassword.equals("Test")){
            model.Success();
        }
        else {
            model.Error();
        }
    }

    @Override
    public void onDetach() {
        model = null;
    }
}
