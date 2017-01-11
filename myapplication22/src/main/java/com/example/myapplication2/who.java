package com.example.myapplication2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wuqia on 2017/1/8.
 */

public class who extends RecyclerView.Adapter<who.ViewHoloder>{
    private static String TAG="who";
    private TextView i1;
    public ArrayList<String> data=new ArrayList<String>();


    @Override
    //创建
    public ViewHoloder onCreateViewHolder(ViewGroup parent, int viewType) {
        //1加载布局（R.layout.item_who） xml->view->Viewhorder
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_who,parent,false);
        return new ViewHoloder(view);
    }

    @Override
    //绑定viewhorder时调用，为viewhorder设置内容
    public void onBindViewHolder(ViewHoloder holder, int position) {
        holder.tvshow.setText(data.get(position));

    }

    @Override
    //获取itemcoumt的个数,共有多少个字符
    public int getItemCount() {
        return data.size();
    }
    public class ViewHoloder extends RecyclerView.ViewHolder {
        public  TextView tvshow;
        public ViewHoloder(View itemView) {
            super(itemView);
            tvshow= (TextView) itemView.findViewById(R.id.tv_show);

        }

    }
    /*
    代表每个ITEM，要有一个显示字符串的空间TextView
    假设viewholder已经把item.xml加载上去了
     */
}
