package com.why.dragger.Presenter.Interface;

import com.why.dragger.Model.Bean.DataBean;
import com.why.dragger.Model.ShowModel;
import com.why.dragger.View.Activity.MainActivity;

/**
 * Created by 小慧莹 on 2018/4/9.
 */

public class ShowPresenter implements Show_Presenter {
    private MainActivity mainActivity;
    private final ShowModel showModel;

    public ShowPresenter(MainActivity mainActivity) {

        this.mainActivity = mainActivity;
        showModel = new ShowModel(this);
    }

    public void getData() {
        showModel.getData();

    }

    @Override
    public void Onsuccess(DataBean dataBean) {
        mainActivity.Onsuccess(dataBean);

    }
}
