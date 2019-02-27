package com.fiqri.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.inputan_a)
    EditText inputanA;
    @BindView(R.id.inputan_b)
    EditText inputanB;
    @BindView(R.id.tv_result)
    TextView tvResult;
    @BindView(R.id.btn_calculate)
    Button btnCalculate;

    MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initPresenter();
        onAttachView();
    }

    private void initPresenter() {
        presenter = new MainPresenter();

    }

    @OnClick(R.id.btn_calculate)
    public void onViewClicked() {
        presenter.calculate(inputanA, inputanB);
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);

    }

    @Override
    public void onDetachView() {
        presenter.onDetach();

    }

    @Override
    public void Success(String result) {
        tvResult.setText(result);
    }

    @Override
    public void Error() {
        Toast.makeText(this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        onAttachView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onDetachView();
    }
}
