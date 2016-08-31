# CustomDialog & PromptDialog

* 1，可以完全自定义弹窗，选择框的样式和布局

* 2，既可以显示单个按钮的选择框，又可以显示两个按钮的选择框

* 3，可以自己定义是否显示提示信息，是否显示标题，是否显示图片 

# 使用步骤:
###1，自己把项目里的AlertDialog类复制到你的项目里就可以了，特别简单

###2，如果你想自己定义一些样式，就自己更改AlertDialog的布局，可以定义出你自己想要的任何样式，满足大家对弹窗的各种自定义

###3，代码中使用
<pre><code>
 private AlertDialog mDialog;
    //自定义的弹窗（提示框）
    public void notification() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示框")                                   //这里设置标题，不设置就不显示标题
                .setMessage("提示框可以自定义布局样式，只有一个按钮")//这里设置提示信息，不设置就不显示
                .setTopImage(R.drawable.icon_tanchuang_tanhao)      //这里设置顶部图标，不设置就不显示
                .setPositiveButton("朕知道了", new DialogInterface.OnClickListener() 
                {                                               //这里可以设置两个按钮，如果其中一个不设置，单个按钮会独占一行
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialog.dismiss();
                    }
                });
        mDialog = builder.create();
        mDialog.show();
    }

</code></pre>


## 效果图:
* 单个按钮的提示框

![](https://github.com/qiushi123/CustomDialog/blob/master/images/3.png?raw=true)

* 两个按钮的选择框

![](https://github.com/qiushi123/CustomDialog/blob/master/images/2.png?raw=true)

* 没有图标，没有提示信息的选择框

![](https://github.com/qiushi123/CustomDialog/blob/master/images/1.png?raw=true)

