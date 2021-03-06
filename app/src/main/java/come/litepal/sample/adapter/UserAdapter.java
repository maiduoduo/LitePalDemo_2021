package come.litepal.sample.adapter;

import android.content.Context;
import android.widget.TextView;


import java.util.List;

import come.litepal.sample.R;
import come.litepal.sample.model.User;


public class UserAdapter extends BaseAdapter<User> {

    public UserAdapter(Context context, List<User> list) {
        super(context, list);
    }

    @Override
    public void onBindView(ViewHolder holder, User data, int position) {
        TextView mTvId = holder.getView(R.id.tv_id);
        TextView mTvName = holder.getView(R.id.tv_name);
        TextView mTvSex = holder.getView(R.id.tv_sex);
        TextView mTvAge = holder.getView(R.id.tv_age);

        if (data != null) {
            mTvId.setText(String.valueOf(data.getId()));
            mTvName.setText(data.getName());
            mTvSex.setText(data.getSex());
            mTvAge.setText(data.getAge());
        }
    }

    @Override
    public int getItemLayoutId(int viewType) {
        return R.layout.item_user;
    }
}
