package com.example.administrator.circlebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
    private CircleMenuLayout mCircleMenuLayout;
    private String[] mItemTexts = new String[] { "安全中心 ", "特色服务", "投资理财",
            "转账汇款", "我的账户", "信用卡" };
    private int[] mItemImgs = new int[] { R.drawable.one,
            R.drawable.two, R.drawable.three,
            R.drawable.four, R.drawable.five,
            R.drawable.six };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //自已切换布局文件看效果
        setContentView(R.layout.activity_main);

        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);



        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener()
        {

            @Override
            public void itemClick(View view, int pos)
            {
                Toast.makeText(MainActivity.this, mItemTexts[pos],
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void itemCenterClick(View view)
            {
                Toast.makeText(MainActivity.this,
                        "开启你的转换之旅吧！  ",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }



}
