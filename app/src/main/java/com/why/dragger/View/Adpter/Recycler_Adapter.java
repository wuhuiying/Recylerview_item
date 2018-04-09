package com.why.dragger.View.Adpter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.why.dragger.Model.Bean.DataBean;
import com.why.dragger.R;

import java.util.List;

/**
 * Created by 小慧莹 on 2018/4/9.
 */

public class Recycler_Adapter extends RecyclerView.Adapter{
    private List<DataBean.ShowapiResBodyBean.NewslistBean> newslist;
    //定义三种常量  表示三种条目类型

    public static final int TYPE_JISHU_IMAGI = 0;
    public static final int TYPE_OUSHU_IMAGE = 1;
    public Recycler_Adapter(List<DataBean.ShowapiResBodyBean.NewslistBean> newslist) {

        this.newslist = newslist;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //创建不同的viewholder
        if(getItemViewType(viewType)==0){
            View view = View.inflate(parent.getContext(), R.layout.jishu_layout, null);
            return new JishuImageHolder(view);
            }
            View view = View.inflate(parent.getContext(), R.layout.oushu, null);
            return new OushuImageHolder(view);
        }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==0){
            ((JishuImageHolder)holder).tv1.setText(newslist.get(position).getTitle());
            ((JishuImageHolder)holder).image1.setImageURI(newslist.get(position).getPicUrl());
        }else{
            ((OushuImageHolder)holder).tv2.setText(newslist.get(position).getTitle());
        ((OushuImageHolder)holder).image2.setImageURI(newslist.get(position).getPicUrl());
        }
    }



    @Override
    public int getItemCount() {
        if(newslist!=null){
        return  newslist.size();
        }
        return 0;
    }

    //根据条件返回条目的类型
    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0) {
            return TYPE_JISHU_IMAGI;
        }
        return TYPE_OUSHU_IMAGE;
    }

//奇数的
    private class JishuImageHolder extends RecyclerView.ViewHolder {

    private final SimpleDraweeView image1;
    private final TextView tv1;

    public JishuImageHolder(View itemView) {
            super(itemView);
        image1 = itemView.findViewById(R.id.simpledraweeview1);
        tv1 = itemView.findViewById(R.id.tv1);
    }
    }

    private class OushuImageHolder extends RecyclerView.ViewHolder {
        private final SimpleDraweeView image2;
        private final TextView tv2;
        public OushuImageHolder(View itemView) {
            super(itemView);
            image2 = itemView.findViewById(R.id.simpledraweeview2);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }
}
