package com.fiqri.mvp.base;

/**
 * Created by fiqri on 22/01/18.
 */

public interface BasePresenter <T extends BaseView> {

    void onAttach(T view);
    void onDetach();
}
