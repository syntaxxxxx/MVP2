package com.fiqri.mvp;

import com.fiqri.mvp.base.BaseView;

/**
 * Created by fiqri on 22/01/18.
 */

public interface MainView extends BaseView {

    void Success(String result);
    void Error();
}
