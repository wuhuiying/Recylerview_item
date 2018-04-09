package com.why.dragger.View.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.why.dragger.Model.Bean.DataBean;
import com.why.dragger.Presenter.Interface.ShowPresenter;
import com.why.dragger.R;
import com.why.dragger.Utils.Api;
import com.why.dragger.View.Adpter.Recycler_Adapter;
import com.why.dragger.View.Interface.ShowView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ShowView {

    private RecyclerView recylerview;
    private List<DataBean.ShowapiResBodyBean.NewslistBean> newslist;
    private ShowPresenter showPresenter;
    private Recycler_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件
        initView();

        //创建p层
        showPresenter = new ShowPresenter(this);
        showPresenter.getData();
    }

    //布局管理器
    private void initViewOper() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recylerview.setLayoutManager(linearLayoutManager);


    }

    private void initView() {
        recylerview = findViewById(R.id.recylerview);
    }

    @Override
    public void Onsuccess(DataBean dataBean) {
        newslist = dataBean.getShowapi_res_body().getNewslist();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //设置适配器
                adapter = new Recycler_Adapter(newslist);
                recylerview.setAdapter(adapter);
                initViewOper();
            }
        });
    }
}
