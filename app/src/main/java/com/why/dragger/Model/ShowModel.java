package com.why.dragger.Model;

import com.google.gson.Gson;
import com.why.dragger.Model.Bean.DataBean;
import com.why.dragger.Presenter.Interface.ShowPresenter;
import com.why.dragger.Utils.Api;
import com.why.dragger.Utils.RetrofitHelper;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 小慧莹 on 2018/4/9.
 */

public class ShowModel {
    private ShowPresenter showPresenter;

    public ShowModel(ShowPresenter showPresenter) {
        this.showPresenter = showPresenter;
    }

    public void getData() {
        RetrofitHelper.getApiService(Api.BASE_URL).get(Api.news)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        Gson gson=new Gson();
                        DataBean dataBean=gson.fromJson(s,DataBean.class);
                        showPresenter.Onsuccess(dataBean);

                    }
                });

    }
}
