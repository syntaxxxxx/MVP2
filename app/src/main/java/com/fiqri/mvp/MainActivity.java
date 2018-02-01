package com.fiqri.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ViewLogin{

    @BindView(R.id.usrName)
    EditText usrName;
    @BindView(R.id.usrPassword)
    EditText usrPassword;
    @BindView(R.id.btnSignup)
    Button btnSignup;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        iniPresenter();
        onAttach();
    }


    private void iniPresenter() {
        presenter = new LoginPresenter();

    }

    @OnClick(R.id.btnSignup)
    public void onViewClicked() {
        presenter.login(usrName, usrPassword);
    }

    @Override
    public void onAttach() {
        presenter.onAttach(this);

    }

    @Override
    public void onDetach() {
        presenter.onDetach();

    }

    @Override
    public void Success() {
        Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Error() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

    }
}
