package com.customdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ${qcl} on  2016/8/31 09:48.
 * 邮箱：2501902696@qq.com
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                notification();
                break;
            case R.id.button2:
                notification2();
                break;
            case R.id.button3:
                notification3();
                break;
        }
    }

    private AlertDialog mDialog;

    //自定义的弹窗（提示框）
    public void notification() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示框")//这里设置标题
                .setMessage("提示框可以自定义布局样式，只有一个按钮")//这里设置提示信息
                .setTopImage(R.drawable.icon_tanchuang_tanhao)//这里设置顶部图标
                .setPositiveButton("朕知道了", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                });
        mDialog = builder.create();
        mDialog.show();
    }

    //自定义的弹窗（两个按钮的选择框）
    public void notification2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("两个按钮的选择框")
                .setMessage("选择可以自定义布局样式，有两个按钮")
                .setTopImage(R.drawable.icon_tanchuang_wenhao)
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                });
        mDialog = builder.create();
        mDialog.show();
    }

    //自定义的弹窗（一个按钮没有顶部图标）
    public void notification3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("没有提示信息，没有顶部图标")
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                });
        mDialog = builder.create();
        mDialog.show();
    }
}
